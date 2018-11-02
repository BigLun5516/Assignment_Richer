package player.Identity;

import player.Player;
import prop.Vistor.Vistor;

public class GaoFuShuai extends Identity {
    public GaoFuShuai(Player player){
        this.player = player;
    }

    @Override
    public void accept(Vistor vistor, Player user) {
        vistor.visit(this, user);

    }
}
