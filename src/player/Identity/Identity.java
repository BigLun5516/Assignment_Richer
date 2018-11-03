package player.Identity;

import player.Player;
import prop.Vistor.Vistor;

public abstract class Identity {
    public abstract void accept(Vistor vistor, Player user);

    protected Player player;

    public Player getPlayer() {
        return player;
    }
}
