package prop;

import player.Player;
import prop.Vistor.FlyCardVistor;
import prop.state.FlyCardState;

public class FlyCard extends Card {
    public FlyCard(Player target){
        this.target = target;
    }

    @Override
    public void execute(Player me) {
        target.getIdentity().accept(new FlyCardVistor(), me);
    }

    private Player target;
}
