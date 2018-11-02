package prop;

import player.Identity.Identity;
import player.Player;
import prop.Vistor.RobCardVistor;

public class RobCard extends Card {
    public RobCard(Player target){
        this.target = target;
    }

    @Override
    public void execute(Player me) {
        target.getIdentity().accept(new RobCardVistor(), me);
    }

    private Player target;
}
