package menu;
import game.Game;
import game.Input;

public class LoadMenu extends Menu {

	@Override
	public void show() {
		System.out.println("\n****************Select the Record to be loaded***********");
		System.out.println("1.1");
		System.out.println("2.2");
		System.out.println("3.3");
		System.out.println("4.4");
		System.out.println("5.5");
		System.out.println("0.Back");
		System.out.println("Your selected:");
		
	}

	@Override
	public boolean doChoice() {
		int choice = Input.in.nextInt();
		switch(choice) {
			case 1:{
				System.out.println("Loading record with ID = "+choice);
				break;
			}
			case 2:{
				System.out.println("Loading record with ID = "+choice);
				break;
			}
			case 3:{
				System.out.println("Loading record with ID = "+choice);
				break;
			}
			case 4:{
				System.out.println("Loading record with ID = "+choice);
				break;
			}
			case 5:{
				System.out.println("Loading record with ID = "+choice);
				break;
			}
			case 0:{
				
				break;
			}
		}
		Game.getInstance().setCurMenu(MenuID.MAIN_MENU);
		return true;
	}
	
}
