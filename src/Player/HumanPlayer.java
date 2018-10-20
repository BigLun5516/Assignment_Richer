package Player;

import global.MenuID;
import menu.MenuMgr;
import menu.PlayMenu;

public class HumanPlayer extends Player {
    @Override
    public boolean play(){
        System.out.println("\n\nHumanPlayer is playing..");
        return new PlayMenu().process();

    }
}
