package menu;
import game.Input;
import global.MenuID;
import outdevice.OutDevice;

public class SaveMenu extends Menu {

	@Override
	public void show(OutDevice outDevice) {
		outDevice.drawLn("\n**************Select the Record to be saved******************");
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
		switch(choice) {
			case 1:{
				System.out.println("Saving record with ID = "+choice);
				break;
			}
			case 2:{
				System.out.println("Saving record with ID = "+choice);
				break;
			}
			case 3:{
				System.out.println("Saving record with ID = "+choice);
				break;
			}
			case 4:{
				System.out.println("Saving record with ID = "+choice);
				break;
			}
			case 5:{
				System.out.println("Saving record with ID = "+choice);
				break;
			}
			case 0:{
				
				break;
			}
		}
		MenuMgr.getInstance().setCurMenu(MenuID.MAIN_MENU);
		return true;
	}
	
}
