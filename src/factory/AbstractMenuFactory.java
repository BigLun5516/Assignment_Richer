package factory;

import menu.Menu;

public abstract class AbstractMenuFactory {
	abstract public Menu  createMenu(int menuID);
}
