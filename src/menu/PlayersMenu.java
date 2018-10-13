package menu;
import game.Game;
import game.Input;

public class PlayersMenu extends Menu {

	@Override
	public void show() {
	
		System.out.println("\n*************Set number of players***************");
		System.out.println("now is " + Game.getInstance().setting.getPlayers()+"\n");
		System.out.println("1.default = 2");
		System.out.println("2.2");
		System.out.println("3.3");
		System.out.println("4.4");
		System.out.println("5.5");
		System.out.println("6.6");
		System.out.println("7.7");
		System.out.println("8.8");
		System.out.println("0.Back");
		System.out.println("Your selected:");

	}

	@Override
	public boolean doChoice() {
		
		int choice = Input.in.nextInt();
		
		
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
