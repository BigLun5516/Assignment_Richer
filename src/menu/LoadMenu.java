package menu;
import player.PlayerMgr;
import global.MenuID;
import outdevice.OutDevice;

public class LoadMenu extends Menu {

	@Override
	public void show(OutDevice outDevice) {
		outDevice.drawLn("\n****************Select the Record to be loaded***********");
		outDevice.drawLn("1.1");
		outDevice.drawLn("2.2");
		outDevice.drawLn("3.3");
		outDevice.drawLn("4.4");
		outDevice.drawLn("5.5");
		outDevice.drawLn("0.Back");
		outDevice.drawLn("Your selected:");
		
	}

	@Override
	public boolean doChoice(int choice) {
		switch (choice) {
			case 1: {

			}
			case 2: {

			}
			case 3: {

			}
			case 4: {

			}
			case 5: {
				System.out.println("Loading record with ID = " + choice);
				PlayerMgr.getInstance().init();
				PlayerMgr.getInstance().play(true);
				break;
			}
			case 0: {
				MenuMgr.getInstance().setCurMenu(MenuID.MAIN_MENU);
				break;
			}
		}

		return true;
	}
}
