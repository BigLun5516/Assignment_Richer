package menu;
import game.Input;
import global.MenuID;
import outdevice.OutDevice;

public class OptionMenu extends Menu {

	@Override
	public void show(OutDevice outDevice) {
		outDevice.drawLn("\n***************Set options for game***************");
		outDevice.drawLn("1.set the value of Volum(0-100)");
		outDevice.drawLn("2.set the resolution");
		outDevice.drawLn("0.Back");
		outDevice.drawLn("your selected:");

	}

	@Override
	public boolean doChoice(int choice) {
		switch(choice) {
			case 1:{
				MenuMgr.getInstance().setCurMenu(MenuID.VOLUM_MENU);
				break;
			}
			case 2:{
				MenuMgr.getInstance().setCurMenu(MenuID.RESOLUTION_MENU);
				break;
			}
			case 0:{
				MenuMgr.getInstance().setCurMenu(MenuID.MAIN_MENU);
				break;
			}
		}
		
		return true;
	}

}
