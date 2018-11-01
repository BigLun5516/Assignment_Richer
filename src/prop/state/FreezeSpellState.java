package prop.state;

import player.Player;

public class FreezeSpellState extends State{
    public FreezeSpellState(){
        super.duration = 3;
    }

    @Override
    public void execute(Player player) {
        if (duration > 0){
            duration--;
            player.setMoveDistance(1);
        } else {
            duration--;
            player.setMoveDistance(player.getDefaultMoveDistance());
        }
    }
}
