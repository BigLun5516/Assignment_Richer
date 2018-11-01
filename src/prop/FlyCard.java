package prop;

import player.Player;
import prop.state.FlyCardState;

public class FlyCard extends Card {
    public FlyCard(Player target){
        this.target = target;
    }

    @Override
    public void execute(Player me) {
        target.addState(new FlyCardState());
    }

    private Player target;
}
