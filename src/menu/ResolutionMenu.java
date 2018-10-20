package menu;
import game.Game;
import game.Input;
import global.MenuID;
import outdevice.OutDevice;

public class ResolutionMenu extends Menu {

	@Override
	public void show(OutDevice outDevice) {
		outDevice.drawLn("\n*********Set resolution**************");
		outDevice.drawLn("now is " + Game.getInstance().setting.getResolution() + "\n");
		outDevice.drawLn("1.640*320");
		outDevice.drawLn("2.800*600");
		outDevice.drawLn("3.1024*768");

	}

	@Override
	public boolean doChoice(int choice) {
		switch(choice) {
		 	case 1:{
		 		Game.getInstance().setting.setResolution("640*320");
		 		System.out.println("set resolution to 640*320");
		 		break;
		 	}
		 	case 2:{
		 		Game.getInstance().setting.setResolution("800*400");
		 		System.out.println("set resolution to 800*400");
		 		break;
		 	}
		 	case 3:{
		 		Game.getInstance().setting.setResolution("1027*768");
		 		System.out.println("set resolution to 1027*768");
		 		break;
		 	}
		}
		MenuMgr.getInstance().setCurMenu(MenuID.OPTION_MENU);
		return true;
	}

}
