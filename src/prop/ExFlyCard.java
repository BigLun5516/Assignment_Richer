package prop;

import player.Player;
import prop.state.ExFlyCardState;

public class ExFlyCard extends Card {
    public ExFlyCard(Player target){
        this.target = target;
    }

    @Override
    public void execute(Player player) {
        target.addState(new ExFlyCardState());
    }

    private Player target;
}
