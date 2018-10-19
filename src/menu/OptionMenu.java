package menu;
import game.Input;
import global.MenuID;

public class OptionMenu extends Menu {

	@Override
	public void show() {
		System.out.println("\n***************Set options for game***************");
		System.out.println("1.set the value of Volum(0-100)");
		System.out.println("2.set the resolution");
		System.out.println("0.Back");
		System.out.println("your selected:");

	}

	@Override
	public boolean doChoice() {
		int choice = Input.in.nextInt();
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
