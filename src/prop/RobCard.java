package prop;

import player.Player;

public class RobCard extends Card {
    public RobCard(Player target){
        this.target = target;
    }

    @Override
    public void excute(Player me) {
        System.out.println("使用RobCard");
        float targetMoney = target.getMoney();
        float myMoney = me.getMoney();
        me.setMoney(myMoney + targetMoney / 2);
        target.setMoney(targetMoney - targetMoney / 2);
    }

    private Player target;
}
