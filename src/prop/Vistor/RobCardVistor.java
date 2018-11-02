package prop.Vistor;

import player.Identity.BaiFuMei;
import player.Identity.GaoFuShuai;
import player.Identity.Identity;
import player.Player;
import prop.ExFlyCard;

public class RobCardVistor extends Vistor {
    @Override
    public void visit(BaiFuMei targetIdentity, Player user) {
        Player target = targetIdentity.getPlayer();
        System.out.println("使用RobCard");
        float targetMoney = target.getMoney();
        float myMoney = user.getMoney();
        user.setMoney(myMoney + targetMoney / 2);
        target.setMoney(targetMoney - targetMoney / 2);
    }

    @Override
    public void visit(GaoFuShuai targetIdentity, Player user) {
        Player target = targetIdentity.getPlayer();
        System.out.println("使用RobCard");
        float targetMoney = target.getMoney();
        float myMoney = user.getMoney();
        user.setMoney(myMoney + targetMoney / 2);
        target.setMoney(targetMoney - targetMoney / 2);
    }
}
