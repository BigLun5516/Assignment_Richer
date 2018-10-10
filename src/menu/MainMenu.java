package menu;
import block.BlockID;
import block.BlockManager;
import block.EBlock;
import block.FBlock;
import game.Game;
import game.Input;
import map.Map;
import map.MapDirector;

public class MainMenu extends Menu{

	@Override
	public void show() {
		System.out.println("\n***************Main Menu**************");
		System.out.println("1.new");
		System.out.println("2.load");
		System.out.println("3.Save");
		System.out.println("4.Option");
		System.out.println("5.Play");
		System.out.println("6: Change To EF");
		System.out.println("0.Exit");
		System.out.println("   Your selected:");
		
	}

	@Override
	public boolean doChoice() {
		int choice = Input.in.nextInt();
		switch(choice) {
			case 1:{
				Game.getInstance().setCurMenu(MenuID.PLAYERS_MENU);
				break;
			}
			case 2:{
				Game.getInstance().setCurMenu(MenuID.LOAD_MENU);
				break;
			}
			case 3:{
				Game.getInstance().setCurMenu(MenuID.SAVE_MENU);
				break;
			}
			case 4:{
				Game.getInstance().setCurMenu(MenuID.OPTION_MENU);
				break;
			}
			case 5:{
				//System.out.println("now is playing");
				
				//new Map().showMap(new MapFactory());
				
				//new Map().showMap(new MapDirector());
				
				Game.getInstance().getCurMap().showMap();
				
				break;
			}
			case 6:{
				BlockManager.getInstance().setPrototypes(BlockID.MONEYBLOCK, new EBlock());
				BlockManager.getInstance().setPrototypes(BlockID.BARBLOCK, new FBlock());
				Game.getInstance().createMap();
				break;
			}
			case 0:{
				return false;
			}
			
		}
		return true;
	}
	
}
