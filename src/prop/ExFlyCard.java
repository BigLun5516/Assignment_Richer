package prop;

import player.Player;
import prop.Vistor.ExFlyCardVistor;
import prop.state.ExFlyCardState;

public class ExFlyCard extends Card {
    public ExFlyCard(Player target){
        this.target = target;
    }

    @Override
    public void execute(Player player) {
        target.getIdentity().accept(new ExFlyCardVistor(), player);
    }

    private Player target;
}
