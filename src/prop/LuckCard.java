package prop;

import player.Player;
import prop.Vistor.LuckCardVistor;
import prop.state.LuckCardState;

public class LuckCard extends Card {
    public LuckCard(Player target){
        this.target = target;
    }

    @Override
    public void execute(Player player) {
        target.getIdentity().accept(new LuckCardVistor(), player);
    }

    private Player target;
}
