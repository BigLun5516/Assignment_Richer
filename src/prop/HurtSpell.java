package prop;

import player.Player;
import prop.state.HurtSpellState;

public class HurtSpell extends Spell {
    public HurtSpell(Player target){
        this.target = target;
    }

    @Override
    public void execute(Player player) {
        target.addState(new HurtSpellState());
    }

    private Player target;
}
