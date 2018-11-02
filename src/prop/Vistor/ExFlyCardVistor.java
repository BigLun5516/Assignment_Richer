package prop.Vistor;

import player.Identity.BaiFuMei;
import player.Identity.GaoFuShuai;
import player.Player;
import prop.state.ExFlyCardState;

public class ExFlyCardVistor extends Vistor {
    @Override
    public void visit(BaiFuMei targetIdentity, Player user) {
        targetIdentity.getPlayer().addState(new ExFlyCardState());
    }

    @Override
    public void visit(GaoFuShuai targetIdentity, Player user) {
        targetIdentity.getPlayer().addState(new ExFlyCardState());
    }
}
