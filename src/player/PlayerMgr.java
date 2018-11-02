package player;

import block.Block;
import block.BlockManager;
import block.TripBlock;
import global.BlockID;
import map.MapMgr;
import player.Identity.BaiFuMei;
import player.Identity.GaoFuShuai;

import java.util.Vector;

public class PlayerMgr {
    static public PlayerMgr getInstance(){
        if(playerMgr == null){
            playerMgr = new PlayerMgr();
        }
        return playerMgr;
    }

    public void init(){
        // 新建一个tripBlock惩罚为50的地图
        TripBlock tripBlockPrototype;
        tripBlockPrototype = (TripBlock) BlockManager.getInstance().getBlockPrototype(BlockID.TRIPBLOCK);
        tripBlockPrototype.setMoneyPunish(50);
        MapMgr.getInstance().createMap();

        for (int i = 0; i < players.size(); i++) {
            // 重置位置 ID
            players.get(i).resetPosition();
            players.get(i).setId(i);

            // 删除玩家的所有状态
            players.get(i).deleteAllStates();

            // 重置玩家生命、金钱
            players.get(i).setLife(100);
            players.get(i).setMoney(50);

            // 玩家淘汰状态设置为未淘汰
            players.get(i).setOut(false);

            // 尚未有人被淘汰
            haveSomeoneOut = false;

        }

        // 从第一个人开始
        turn = 0;
    }

    public void play(boolean waitChoose){
        while (players.get(turn).play(waitChoose)) {
            waitChoose = true;
            turn = (turn + 1) % players.size();
        }
    }

    public Block getPlayerPosition(int index){
        return players.get(index).getPosition();
    }

    public Player getCurrentPlayer(){
        return players.get(turn);
    }

    public void someoneOut(){
        // 第一次有人淘汰时执行以下操作
        if (!haveSomeoneOut) {
            TripBlock tripBlockPrototype;
            tripBlockPrototype = (TripBlock) BlockManager.getInstance().getBlockPrototype(BlockID.TRIPBLOCK);
            tripBlockPrototype.setMoneyPunish(200);
            MapMgr.getInstance().createMap();
            // 将玩家所在的块更新到新地图的块上
            for(Player player : players){
                player.setPosition(MapMgr.getInstance().getCurMap().getBlockById(
                        player.getPosition().getId()));
            }
            haveSomeoneOut = true;
        }

        //所有剩余玩家金钱减半
        for (Player player : players){
            if (!player.isOut()){
                player.setMoney(player.getMoney() / 2);
            }
        }
    }

    private PlayerMgr(){
        players = new Vector<>();
        Player player1 = new HumanPlayer();
        Player player2 = new AutoPlayer();
        Player player3 = new AutoPlayer();
        player1.setIdentity(new GaoFuShuai(player1));
        player2.setIdentity(new GaoFuShuai(player2));
        player3.setIdentity(new BaiFuMei(player3));

        players.add(player1);
        players.add(player2);
        players.add(player3);

    }

    static private  PlayerMgr playerMgr = null;
    private Vector<Player> players;
    private int turn = 0;

    private boolean haveSomeoneOut = false;



    public Vector<Player> getPlayers(){
        return players;
    }

    public int getSurvivalNum(){
        int playersNum = players.size();
        int survivalNum = 0;
        for (int j = 0; j < playersNum; j++) {
            if(players.get(j).isOut() == false){
                survivalNum++;
            }
        }
        return survivalNum;
    }

    public int getPlayersNum(){
        return players.size();
    }

    public boolean isHaveSomeoneOut() {
        return haveSomeoneOut;
    }

    public void setHaveSomeoneOut(boolean haveSomeoneOut) {
        this.haveSomeoneOut = haveSomeoneOut;
    }
}
