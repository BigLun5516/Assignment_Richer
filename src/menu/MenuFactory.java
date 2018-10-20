package menu;

import global.MenuID;

/*
 * 普通工厂 
 * 用于创建Menu的各个子类
 */
public  class MenuFactory extends AbstractMenuFactory {
	public Menu createMenu(int menuID) {
		if(menuID == MenuID.MAIN_MENU) {
			return new MainMenu();
		} else if(menuID == MenuID.PLAYERS_MENU) {
			return new PlayersMenu();
		} else if(menuID == MenuID.LOAD_MENU) {
			return new LoadMenu();
		} else if(menuID == MenuID.SAVE_MENU) {
			return new SaveMenu();
		} else if(menuID == MenuID.OPTION_MENU) {
			return new OptionMenu();
		} else if(menuID == MenuID.VOLUM_MENU) {
			return new VolumMenu();
		} else if(menuID == MenuID.RESOLUTION_MENU) {
			return new ResolutionMenu();
		} else if(menuID == MenuID.PLAY_MENU) {
			return new PlayMenu();
		}  else {
			return new MainMenu();
		}

	}
}
