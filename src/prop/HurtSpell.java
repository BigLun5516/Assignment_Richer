package prop;

import player.Player;
import prop.Vistor.HurtSpellVistor;

public class HurtSpell extends Spell {
    public HurtSpell(Player target){
        this.target = target;
    }

    @Override
    public void execute(Player player) {
        target.getIdentity().accept(new HurtSpellVistor(), player);
    }

    private Player target;
}
