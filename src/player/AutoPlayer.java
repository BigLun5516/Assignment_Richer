package player;

import block.Block;
import map.MapMgr;
import outdevice.StreamDevice;

public class AutoPlayer extends Player {
    public AutoPlayer(){
        moveDistance = 2;
        defaultMoveDistance = 2;
    }


    @Override
    public boolean play(boolean waitChoose){
        System.out.println("\n\nAutoPlayer is playing");
        // State发挥作用
        statesExecute();

        tempMoveDistance = moveDistance;

        // 走两步
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
        MapMgr.getInstance().getCurMap().showMap(new StreamDevice());
        // 显示生命 金钱属性
        System.out.println("Life: " + life);
        System.out.println("Money: " + money);
        return true;
    }
}
