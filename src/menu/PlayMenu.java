package menu;


import com.sun.glass.ui.Size;
import game.Input;
import global.MenuID;
import outdevice.OutDevice;
import player.Player;
import player.PlayerMgr;
import prop.MeanCard;
import prop.ReturnSpell;
import prop.RobCard;

import java.util.Vector;

public class PlayMenu extends Menu{



    @Override
    public void show(OutDevice outDevice) {
        outDevice.drawLn("\n   PlayMenu");
        outDevice.drawLn("1. Go...");
        outDevice.drawLn("2. ApplyRobCard");
        outDevice.drawLn("3. ApplyMeanCard");
        outDevice.drawLn("4. ApplyReturnCard");
        outDevice.drawLn("5. Load");
        outDevice.drawLn("6. Save");
        outDevice.drawLn("0. Back To MainMenu");
        outDevice.drawLn("   Your selected:");
    }

    @Override
    public boolean doChoice(int choice) {
        switch (choice) {
            case 1: {
                // GO
                PlayerMgr.getInstance().play(false);
                break;
            }
            case 2:{
                // ApplyRobCard
                Vector<Player> alllayers = PlayerMgr.getInstance().getPlayers();
                int playerNum = alllayers.size();
                System.out.println("请输入目标ID（0-" + (playerNum - 1) + ")");
                int targetId = Input.in.nextInt();
                if(targetId >= 0 && targetId < playerNum){
                    PlayerMgr.getInstance().getCurrentPlayer().useProp(new RobCard(alllayers.get(targetId)));
                } else {
                    System.out.println("使用失败");
                }

                //test
                System.out.println(alllayers.get(0).getMoney());
                System.out.println(alllayers.get(1).getMoney());

                break;
            }
            case 3:{
                // ApplyMeanCard
                PlayerMgr.getInstance().getCurrentPlayer().useProp(new MeanCard());

                //test
                System.out.println(PlayerMgr.getInstance().getPlayers().get(0).getMoney());
                System.out.println(PlayerMgr.getInstance().getPlayers().get(1).getMoney());

                break;
            }
            case 4:{
                // ApplyReturnCard
                Vector<Player> alllayers = PlayerMgr.getInstance().getPlayers();
                int playerNum = alllayers.size();
                System.out.println("请输入目标ID（0-" + (playerNum - 1) + ")");
                int targetId = Input.in.nextInt();
                if(targetId >= 0 && targetId < playerNum){
                    PlayerMgr.getInstance().getCurrentPlayer().useProp(new ReturnSpell(alllayers.get(targetId)));
                } else {
                    System.out.println("使用失败");
                }
                break;
            }
            case 5: {
                // Load
                MenuMgr.getInstance().setCurMenu(MenuID.LOAD_MENU);
                break;
            }
            case 6: {
                // Save
                MenuMgr.getInstance().setCurMenu(MenuID.SAVE_MENU);
                break;
            }
            default: {
                // Back
                MenuMgr.getInstance().setCurMenu(MenuID.MAIN_MENU);
                break;
            }

        }


        return true;
    }


}
