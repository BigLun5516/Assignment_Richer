package player;

import block.Block;
import block.LinkedBlock;
import global.DirID;
import global.MenuID;
import map.MapMgr;
import menu.MenuMgr;
import outdevice.StreamDevice;

import java.util.Random;
import java.util.Vector;

public class HumanPlayer extends Player {
    public HumanPlayer(){
        moveDistance = 3;
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

            // 走三步
            for (int j = 0; j < 3; j++) {
                Block next = moveStrategy.move(this);
                lastPosition = position;
                position = next;
            }

            MapMgr.getInstance().getCurMap().showMap(streamDevice);
            return true;
        }
    }
}