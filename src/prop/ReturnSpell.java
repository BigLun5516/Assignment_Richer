package prop;

import player.Player;
import prop.Vistor.ReturnSpellVistor;


public class ReturnSpell extends Spell {
    public ReturnSpell(Player target){
        this.target = target;
    }

    @Override
    public void execute(Player me) {
        target.getIdentity().accept(new ReturnSpellVistor(), me);
    }

    private Player target;
}
