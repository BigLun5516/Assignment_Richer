package prop.state;

import player.Player;

public abstract class State {
    public String getFeature(){
        return "";
    }

    public abstract void execute(Player player);

    protected int duration;

    public int getDuration() {
        return duration;
    }
}
