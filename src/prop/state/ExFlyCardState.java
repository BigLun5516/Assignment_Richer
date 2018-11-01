package prop.state;

import player.Player;

public class ExFlyCardState extends State {
    public ExFlyCardState(){
        duration = 2;
    }

    @Override
    public String getFeature() {
        return "IgnoreBar";
    }

    @Override
    public void execute(Player player) {
        if (duration > 0){
            duration--;
            player.setMoveDistance(6);
        } else {
            duration--;
            player.setMoveDistance(player.getDefaultMoveDistance());
        }
    }
}
