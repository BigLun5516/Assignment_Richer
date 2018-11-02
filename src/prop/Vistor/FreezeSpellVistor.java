package prop.Vistor;

import player.Identity.BaiFuMei;
import player.Identity.GaoFuShuai;
import player.Player;
import prop.state.FlyCardState;
import prop.state.FreezeSpellState;

public class FreezeSpellVistor extends Vistor {
    @Override
    public void visit(BaiFuMei targetIdentity, Player user) {
        targetIdentity.getPlayer().addState(new FreezeSpellState());
    }

    @Override
    public void visit(GaoFuShuai targetIdentity, Player user) {
        targetIdentity.getPlayer().addState(new FreezeSpellState());
    }
}
