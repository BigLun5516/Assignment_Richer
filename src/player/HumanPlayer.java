package player;

import block.Block;
import global.MenuID;
import map.MapMgr;
import menu.MenuMgr;
import outdevice.StreamDevice;

public class HumanPlayer extends Player {
    public HumanPlayer(){
        moveDistance = 3;
        defaultMoveDistance = 3;
    }

    @Override
    public boolean play(boolean waitChoose) {
        StreamDevice streamDevice = new StreamDevice();
        if (waitChoose) {
            // 等待玩家做选择
            streamDevice.drawLn("Humanplayer is playing");
            MenuMgr.getInstance().setCurMenu(MenuID.PLAY_MENU);
            return false;
        } else {
            // 玩家选择了Go

            // State发挥作用
            statesExecute();

            tempMoveDistance = moveDistance;

            // 走三步
            try {
                for (int j = 0; j < tempMoveDistance; j++) {
                    Block next = moveStrategy.move(this);
                    lastPosition = position;
                    position = next;

                    // 当前位置Block的效果
                    position.effect(this);
                }
            } catch (Exception e) {
            }
            // 显示当前地图
            MapMgr.getInstance().getCurMap().showMap(streamDevice);
            // 显示生命金钱属性
            System.out.println("Life:" + life);
            System.out.println("Money:" + money);
            return true;
        }
    }
}