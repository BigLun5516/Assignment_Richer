package prop;

import player.Player;
import prop.state.FreezeSpellState;

public class FreezeSpell extends Spell {
    public FreezeSpell(Player target){
        this.target = target;
    }

    @Override
    public void execute(Player player) {
        target.addState(new FreezeSpellState());
    }

    private Player target;
}
