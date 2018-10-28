package player;

import block.Block;
import block.LinkedBlock;
import global.DirID;
import map.MapMgr;
import outdevice.StreamDevice;

import java.util.Random;
import java.util.Vector;

public class AutoPlayer extends Player {
    public AutoPlayer(){
        moveDistance = 2;
    }


    @Override
    public boolean play(boolean waitChoose){
        System.out.println("\n\nAutoPlayer is playing");
        // 走两步
        for (int j = 0; j < 2; j++) {
            Block next = moveStrategy.move(this);
            lastPosition = position;
            position = next;
        }
        MapMgr.getInstance().getCurMap().showMap(new StreamDevice());
        return true;
    }
}
