package prop;

import player.Player;
import prop.Vistor.FreezeSpellVistor;
import prop.state.FreezeSpellState;

public class FreezeSpell extends Spell {
    public FreezeSpell(Player target){
        this.target = target;
    }

    @Override
    public void execute(Player player) {
        target.getIdentity().accept(new FreezeSpellVistor(), player);
    }

    private Player target;
}
