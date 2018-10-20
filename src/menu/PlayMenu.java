package menu;

import game.Input;
import global.MenuID;
import map.MapMgr;
import outdevice.OutDevice;
import outdevice.StreamDevice;

public class PlayMenu extends Menu{



    @Override
    public void show(OutDevice outDevice) {
        outDevice.drawLn("   PlayMenu");
        outDevice.drawLn("1. Go...");
        outDevice.drawLn("2. Load");
        outDevice.drawLn("3. Save");
        outDevice.drawLn("4. Back To MainMenu");
        outDevice.drawLn("   Your selected:");
    }

    @Override
    public boolean doChoice(int choice) {
        switch (choice) {
            case 1: {
                // GO
                MapMgr.getInstance().getCurMap().showMap(new StreamDevice());
                return true;
            }
            case 2: {
                // Load
                MenuMgr.getInstance().getMenu(MenuID.LOAD_MENU).process();
                return false;
            }
            case 3: {
                // Save
                MenuMgr.getInstance().setCurMenu(MenuID.SAVE_MENU);
                return false;///
            }
            default: {
                // Back
                MenuMgr.getInstance().setCurMenu(MenuID.MAIN_MENU);
                return false;
            }
        }
    }


}
