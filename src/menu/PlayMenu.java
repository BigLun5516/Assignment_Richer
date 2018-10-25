package menu;


import global.MenuID;
import outdevice.OutDevice;
import Player.PlayerMgr;

public class PlayMenu extends Menu{



    @Override
    public void show(OutDevice outDevice) {
        outDevice.drawLn("\n   PlayMenu");
        outDevice.drawLn("1. Go...");
        outDevice.drawLn("2. Load");
        outDevice.drawLn("3. Save");
        outDevice.drawLn("0. Back To MainMenu");
        outDevice.drawLn("   Your selected:");
    }

    @Override
    public boolean doChoice(int choice) {
        switch (choice) {
            case 1: {
                // GO
                PlayerMgr.getInstance().play(false);
                break;
            }
            case 2: {
                // Load
                MenuMgr.getInstance().setCurMenu(MenuID.LOAD_MENU);
                break;
            }
            case 3: {
                // Save
                MenuMgr.getInstance().setCurMenu(MenuID.SAVE_MENU);
                break;
            }
            default: {
                // Back
                MenuMgr.getInstance().setCurMenu(MenuID.MAIN_MENU);
                break;
            }

        }

        PlayerMgr.getInstance().setTurn(0);
        return true;
    }


}
