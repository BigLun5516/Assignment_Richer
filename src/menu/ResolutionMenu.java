package menu;
import game.Game;
import game.Input;

public class ResolutionMenu extends Menu {

	@Override
	public void show() {
		System.out.println("\n*********Set resolution**************");
		System.out.println("now is " + Game.getInstance().setting.getResolution() + "\n");
		System.out.println("1.640*320");
		System.out.println("2.800*600");
		System.out.println("3.1024*768");

	}

	@Override
	public boolean doChoice() {
		int choice = Input.in.nextInt();
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
		Game.getInstance().setCurMenu(MenuID.OPTION_MENU);
		return true;
	}

}
