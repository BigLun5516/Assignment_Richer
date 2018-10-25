package Player;

import global.MenuID;
import map.MapMgr;
import menu.Menu;
import menu.MenuMgr;
import menu.PlayMenu;
import outdevice.StreamDevice;

public class HumanPlayer extends Player {
    @Override
    public boolean play(boolean waitChoose){
        StreamDevice streamDevice = new StreamDevice();
        if(waitChoose){
            streamDevice.drawLn("Humanplayer is playing");
            MenuMgr.getInstance().setCurMenu(MenuID.PLAY_MENU);
            return false;
        } else {
            MapMgr.getInstance().getCurMap().showMap(streamDevice);
            return true;
        }

    }
}
