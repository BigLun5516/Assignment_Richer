package player;

import block.Block;
import iterator.JavaIterator;

import javax.xml.bind.ValidationException;
import java.util.Vector;

public class PlayerMgr {
    static public PlayerMgr getInstance(){
        if(playerMgr == null){
            playerMgr = new PlayerMgr();
        }
        return playerMgr;
    }

    public void init(){
        // 重置位置 ID
        for (int i = 0; i < players.size(); i++) {
            players.get(i).resetPosition();
            players.get(i).setId(i);
        }

        // 从第一个人开始
        turn = 0;
    }

    public void play(boolean waitChoose){
        while (players.get(turn).play(waitChoose)) {
            waitChoose = true;
            turn = (turn + 1) % 2;
        }
    }

    public Block getPlayerPosition(int index){
        return players.get(index).getPosition();
    }



    public Player getCurrentPlayer(){
        return players.get(turn);
    }

    private PlayerMgr(){
        players = new Vector<>();
        players.add(new HumanPlayer());
        players.add(new AutoPlayer());

    }

    static private  PlayerMgr playerMgr = null;
   private Vector<Player> players;
   private int turn = 0;

    public Vector<Player> getPlayers(){
        return players;
    }

    public int getPlayerNum(){
        return players.size();
    }
}
