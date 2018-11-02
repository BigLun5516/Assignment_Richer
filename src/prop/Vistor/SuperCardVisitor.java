package prop.Vistor;

import player.Identity.BaiFuMei;
import player.Identity.GaoFuShuai;
import player.Player;
import prop.state.SuperCardState;

public class SuperCardVisitor extends Vistor {
    @Override
    public void visit(BaiFuMei targetIdentity, Player user) {
        targetIdentity.getPlayer().addState(new SuperCardState());
    }

    @Override
    public void visit(GaoFuShuai targetIdentity, Player user) {
        targetIdentity.getPlayer().addState(new SuperCardState());
    }
}
