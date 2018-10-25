package Player;

import global.MenuID;
import menu.Menu;
import menu.MenuMgr;

public class PlayerMgr {
    static public PlayerMgr getInstance(){
        if(playerMgr == null){
            playerMgr = new PlayerMgr();
        }
        return playerMgr;
    }

    public void play(boolean waitChoose){
        while (players[turn].play(waitChoose)) {
            waitChoose = true;
            turn = (turn + 1) % 3;
        }
    }

    public void setTurn(int turn){
        this.turn = turn;
    }

    private PlayerMgr(){
        players = new Player[3]; //此处暂时写死了，以后应可根据用户选择改变
        players[0] = new AutoPlayer();
        players[1] = new HumanPlayer();
        players[2] = new AutoPlayer();
    }

    static private  PlayerMgr playerMgr = null;
    private Player[] players;
    private int turn = 0;
}
