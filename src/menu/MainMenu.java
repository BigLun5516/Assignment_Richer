package menu;
import Player.PlayerMgr;
import global.BlockID;
import block.BlockManager;
import block.EBlock;
import block.FBlock;
import game.Input;
import global.MenuID;
import map.MapMgr;
import outdevice.OutDevice;
import outdevice.StreamDevice;

public class MainMenu extends Menu{

	@Override
	public void show(OutDevice outDevice) {
		outDevice.drawLn("\n***************Main Menu**************");
		outDevice.drawLn("1.new");
		outDevice.drawLn("2.load");
		outDevice.drawLn("3.Option");
		outDevice.drawLn("4.Play");
		outDevice.drawLn("5: Change To EF");
		outDevice.drawLn("0.Exit");
		outDevice.drawLn("   Your selected:");
		
	}

	@Override
	public boolean doChoice(int choice) {
		switch(choice) {
			case 1:{
				MenuMgr.getInstance().setCurMenu(MenuID.PLAYERS_MENU);
				break;
			}
			case 2:{
				MenuMgr.getInstance().setCurMenu(MenuID.LOAD_MENU);
				break;
			}
			case 3:{
				MenuMgr.getInstance().setCurMenu(MenuID.OPTION_MENU);
				break;
			}
			case 4:{
				PlayerMgr.getInstance().start();
				break;
			}
			case 5:{
				BlockManager.getInstance().setPrototypes(BlockID.MONEYBLOCK, new EBlock());
				BlockManager.getInstance().setPrototypes(BlockID.BARBLOCK, new FBlock());
				MapMgr.getInstance().createMap();
				break;
			}
			case 0:{
				return false;
			}
			
		}
		return true;
	}
	
}
