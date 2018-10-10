package menu;
import game.Game;

public abstract class Menu {
	
	public boolean process() {
		show();
		return doChoice();
		
	}
	
	public abstract void show();
	public abstract boolean doChoice();
}
