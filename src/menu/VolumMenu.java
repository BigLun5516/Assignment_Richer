package menu;
import game.Game;
import game.Input;

public class VolumMenu extends Menu{
	
	@Override
	public void show() {
		System.out.println("\n*************Set Volum***************");
		System.out.println("now is " + Game.getInstance().setting.getVolum()+"\n");
		System.out.println("input value(0-100):");
		
	}

	@Override
	public boolean doChoice() {
		int volum = Input.in.nextInt();
		Game.getInstance().setting.setVolum(volum);
		System.out.println("set volum to " + volum);
		Game.getInstance().setCurMenu(MenuID.OPTION_MENU);
		return true;
	}

}
