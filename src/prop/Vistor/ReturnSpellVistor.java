package prop.Vistor;

import player.Identity.BaiFuMei;
import player.Identity.GaoFuShuai;
import player.Player;
import prop.state.LuckCardState;

public class ReturnSpellVistor extends Vistor {
    @Override
    public void visit(BaiFuMei targetIdentity, Player user) {
        System.out.println("使用ReturnSpell");
        targetIdentity.getPlayer().resetPosition();
    }

    @Override
    public void visit(GaoFuShuai targetIdentity, Player user) {
        System.out.println("使用ReturnSpell");
        targetIdentity.getPlayer().resetPosition();
    }
}
