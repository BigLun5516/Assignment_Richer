package prop;

import player.Player;
import prop.state.LuckCardState;

public class LuckCard extends Card {
    public LuckCard(Player target){
        this.target = target;
    }

    @Override
    public void execute(Player player) {
        target.addState(new LuckCardState());
    }

    private Player target;
}
