package player.Identity;

import player.Player;
import prop.Vistor.Vistor;

public class BaiFuMei extends Identity {
    public BaiFuMei(Player player){
        this.player = player;
    }
    @Override
    public void accept(Vistor vistor, Player user) {
        vistor.visit(this, user);

    }
}
