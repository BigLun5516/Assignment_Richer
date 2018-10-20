package menu;
import game.Game;
import game.Input;
import global.MenuID;
import outdevice.OutDevice;

public class VolumMenu extends Menu{
	
	@Override
	public void show(OutDevice outDevice) {
		outDevice.drawLn("\n*************Set Volum***************");
		outDevice.drawLn("now is " + Game.getInstance().setting.getVolum()+"\n");
		outDevice.drawLn("input value(0-100):");
		
	}

	@Override
	public boolean doChoice(int choice) {
		int volum = Input.in.nextInt();
		Game.getInstance().setting.setVolum(volum);
		System.out.println("set volum to " + volum);
		MenuMgr.getInstance().setCurMenu(MenuID.OPTION_MENU);
		return true;
	}

}
