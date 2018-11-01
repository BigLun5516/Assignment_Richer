package prop.state;

import player.Player;

public class LuckCardState extends State {
    public LuckCardState(){
        super.duration = 3;
    }

    @Override
    public void execute(Player player) {
        if (duration > 0){
            duration--;
            player.setMoney(player.getMoney() + 200);
        } else {
           duration--;
        }
    }
}
