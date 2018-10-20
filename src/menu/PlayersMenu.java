package menu;
import game.Game;
import game.Input;
import global.MenuID;
import outdevice.OutDevice;

public class PlayersMenu extends Menu {

	@Override
	public void show(OutDevice outDevice) {

		outDevice.drawLn("\n*************Set number of players***************");
		outDevice.drawLn("now is " + Game.getInstance().setting.getPlayers()+"\n");
		outDevice.drawLn("1.default = 2");
		outDevice.drawLn("2.2");
		outDevice.drawLn("3.3");
		outDevice.drawLn("4.4");
		outDevice.drawLn("5.5");
		outDevice.drawLn("6.6");
		outDevice.drawLn("7.7");
		outDevice.drawLn("8.8");
		outDevice.drawLn("0.Back");
		outDevice.drawLn("Your selected:");

	}

	@Override
	public boolean doChoice(int choice) {
		switch(choice) {
			case 1:{
				Game.getInstance().setting.setPlayers(2);
				System.out.println("set number of players to " + choice);
				break;
			}
			case 2:{
				Game.getInstance().setting.setPlayers(choice);
				System.out.println("set number of players to " + choice);
				break;
			}
			case 3:{
				Game.getInstance().setting.setPlayers(choice);
				System.out.println("set number of players to " + choice);
				break;
			}
			case 4:{
				Game.getInstance().setting.setPlayers(choice);
				System.out.println("set number of players to " + choice);
				break;
			}
			case 5:{
				Game.getInstance().setting.setPlayers(choice);
				System.out.println("set number of players to " + choice);
				break;
			}
			case 6:{
				Game.getInstance().setting.setPlayers(choice);
				System.out.println("set number of players to " + choice);
				break;
			}
			case 7:{
				Game.getInstance().setting.setPlayers(choice);
				System.out.println("set number of players to " + choice);
				break;
			}
			case 8:{
				Game.getInstance().setting.setPlayers(choice);
				System.out.println("set number of players to " + choice);
				break;
			}
			case 0:{
				
				break;
			}
		}
		MenuMgr.getInstance().setCurMenu(MenuID.MAIN_MENU);
		return true;
	}

}
