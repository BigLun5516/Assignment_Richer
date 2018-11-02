package prop.Vistor;

import player.Identity.BaiFuMei;
import player.Identity.GaoFuShuai;
import player.Player;
import prop.state.FreezeSpellState;
import prop.state.HurtSpellState;

public class HurtSpellVistor extends Vistor {
    @Override
    public void visit(BaiFuMei targetIdentity, Player user) {
        targetIdentity.getPlayer().addState(new HurtSpellState());
    }

    @Override
    public void visit(GaoFuShuai targetIdentity, Player user) {
        targetIdentity.getPlayer().addState(new HurtSpellState());
    }
}
