package prop.state;

import player.Player;

public class FlyCardState extends State{
    public FlyCardState(){
        super.duration = 2;
    }
    public FlyCardState(int duration){
        this.duration = duration;
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
