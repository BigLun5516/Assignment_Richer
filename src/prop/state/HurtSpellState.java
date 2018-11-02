package prop.state;

import player.Player;

public class HurtSpellState extends State {
    public HurtSpellState(){
        duration = 2;
    }
    public HurtSpellState(int duration){
        this.duration = duration;
    }
    @Override
    public void execute(Player player) {
        if (duration > 0){
            duration--;
            player.setMoney(player.getMoney() - 5);
        } else {
            duration--;
        }
    }

}
