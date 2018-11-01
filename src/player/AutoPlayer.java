package player;

import block.Block;
import global.MenuID;
import map.MapMgr;
import menu.MenuMgr;
import outdevice.StreamDevice;

public class AutoPlayer extends Player {
    public AutoPlayer(){
        moveDistance = 2;
        defaultMoveDistance = 2;
    }


    @Override
    public boolean play(boolean waitChoose){
        // 还未被淘汰才执行以下过程
        if (!isOut) {
            // 判断是否获胜
            if (PlayerMgr.getInstance().getSurvivalNum() == 1){
                MenuMgr.getInstance().setCurMenu(MenuID.MAIN_MENU);
                return false;
            }

            System.out.println("\n\nAutoPlayer" + getId() + " is playing");

            // 判断是否淘汰
            if (money <= 0){
                System.out.println("玩家" + getId() + "淘汰");
                isOut = true;
                PlayerMgr.getInstance().someoneOut();
                position = null;
                return true;
            }

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

                    // 判断是否淘汰
                    if (money <= 0){
                        System.out.println("玩家" + getId() + "淘汰");
                        isOut = true;
                        PlayerMgr.getInstance().someoneOut();
                        position = null;
                        return true;
                    }
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
        return true;
    }
}
