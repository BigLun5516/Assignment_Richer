package prop.Vistor;

import player.Identity.BaiFuMei;
import player.Identity.GaoFuShuai;
import player.Player;
import prop.state.ExFlyCardState;
import prop.state.FlyCardState;

public class FlyCardVistor extends Vistor {
    @Override
    public void visit(BaiFuMei targetIdentity, Player user) {
        targetIdentity.getPlayer().addState(new FlyCardState());
    }

    @Override
    public void visit(GaoFuShuai targetIdentity, Player user) {
        targetIdentity.getPlayer().addState(new FlyCardState());
    }
}
