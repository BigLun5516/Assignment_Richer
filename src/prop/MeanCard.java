package prop;

import player.Player;
import player.PlayerMgr;

import java.util.Vector;

public class MeanCard extends Card {

    @Override
    public void execute(Player me) {
        System.out.println("使用MeanCard");
        Vector<Player> players = PlayerMgr.getInstance().getPlayers();
        float allMoney = 0;
        int playerNum = players.size();
        for (int i = 0; i < playerNum; i++) {
            allMoney += players.get(i).getMoney();
        }
        for (int i = 0; i < playerNum; i++) {
            players.get(i).setMoney(allMoney / playerNum);
        }
    }

}
