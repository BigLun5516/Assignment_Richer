package prop;

import player.Player;


public class ReturnSpell extends Spell {
    public ReturnSpell(Player target){
        this.target = target;
    }

    @Override
    public void excute(Player me) {
        System.out.println("使用ReturnSpell");
        target.resetPosition();
    }

    private Player target;
}
