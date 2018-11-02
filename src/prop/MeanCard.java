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
            if (!players.get(i).isOut()) {
                allMoney += players.get(i).getMoney();
            }
        }
        int survivalNum = PlayerMgr.getInstance().getSurvivalNum();
        for (int i = 0; i < playerNum; i++) {
            if (!players.get(i).isOut()) {
                players.get(i).setMoney(allMoney / survivalNum);
            }
        }
    }

}
