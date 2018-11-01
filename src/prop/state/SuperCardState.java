package prop.state;

import player.Player;

public class SuperCardState extends State {
    public SuperCardState(){
        duration = 1;
    }

    @Override
    public void execute(Player player) {
        if (duration > 0){
            duration--;
            player.setMoveDistance(6);
            player.setMoney(player.getMoney() + 200);
        } else {
            duration--;
            player.setMoveDistance(player.getDefaultMoveDistance());
        }
    }
}
