package prop;

import player.Player;
import prop.state.SuperCardState;

public class SuperCard extends Card {
    public SuperCard(Player target){
        this.target = target;
    }

    @Override
    public void execute(Player player) {
        target.addState(new SuperCardState());
    }

    private Player target;
}
