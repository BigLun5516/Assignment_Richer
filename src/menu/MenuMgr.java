package menu;

import global.MenuID;

public class MenuMgr {
	static public MenuMgr getInstance() {
		if(instance == null) {
			instance = new MenuMgr();
		}
		return instance;
	}
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
	public void setCurMenu(int menuID) {
		curMenu = getMenu(menuID);
	}
	public Menu getCurMenu(){
		return curMenu;
	}

	private MenuMgr() {
		menuPool = new Menu[MenuID.MENU_COUNT];
		for(int i=0;i<MenuID.MENU_COUNT;i++) {
			menuPool[i] = null;
		}
		absMenuFactory = new MenuFactory();
		setCurMenu(MenuID.MAIN_MENU);

	}

	private Menu curMenu;
	private Menu menuPool[];
	private AbstractMenuFactory absMenuFactory;
	static private MenuMgr instance = null;


}
