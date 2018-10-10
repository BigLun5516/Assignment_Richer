package menu;

import factory.AbstractMenuFactory;
import factory.MenuFactory;

public class MenuMgr {
	/////单例实现
	static private MenuMgr instance = null; 
	static public MenuMgr getInstance() {
		if(instance == null) {
			instance = new MenuMgr();
		}
		return instance;
	}
	private MenuMgr() {
		menuPool = new Menu[MenuID.MENU_COUNT];
		for(int i=0;i<MenuID.MENU_COUNT;i++) {
			menuPool[i] = null;
		}
	}
	////
	private Menu menuPool[];
	private AbstractMenuFactory absMenuFactory;

	public void setAbsMenuFactory(AbstractMenuFactory absMenuFactory){
		this.absMenuFactory = absMenuFactory;
	}

	

	public  Menu getMenu(int menuID) {
		if(menuID < MenuID.MAIN_MENU || menuID >= MenuID.MENU_COUNT){
			menuID = MenuID.MAIN_MENU;
		}
		if(menuPool[menuID] == null){
			menuPool[menuID] = absMenuFactory.createMenu(menuID);
		}
		return menuPool[menuID];
	}
	

}
