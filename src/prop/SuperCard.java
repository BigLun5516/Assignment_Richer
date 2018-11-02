package prop;

import com.sun.media.jfxmediaimpl.platform.java.JavaPlatform;
import player.Player;
import prop.Vistor.SuperCardVisitor;
import prop.state.SuperCardState;

public class SuperCard extends Card {
    public SuperCard(Player target){
        this.target = target;
    }

    @Override
    public void execute(Player player) {
        target.getIdentity().accept(new SuperCardVisitor(), player);
    }

    private Player target;
}
