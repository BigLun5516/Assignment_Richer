package menu;

import factory.AbstractMenuFactory;
import factory.MenuFactory;

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
		setAbsMenuFactory(new MenuFactory());
		curMenu = getMenu(menuID);
	}
	public Menu getCurMenu(){
		return curMenu;
	}

	static private MenuMgr instance = null;
	private Menu menuPool[];
	private AbstractMenuFactory absMenuFactory;
	private Menu curMenu;
	private MenuMgr() {
		menuPool = new Menu[MenuID.MENU_COUNT];
		for(int i=0;i<MenuID.MENU_COUNT;i++) {
			menuPool[i] = null;
		}
		setCurMenu(MenuID.MAIN_MENU);
	}

	




}
