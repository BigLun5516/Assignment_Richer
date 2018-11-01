package map;

import block.Block;
import outdevice.OutDevice;
import player.PlayerMgr;

public class MapImpWithPlayer extends MapImp {
    @Override
    public void showMap(OutDevice outDevice){
        int row = 0, col = 0;
        int r, c;
        for(Block block : blocks){
            r = block.getRow();
            c = block.getCol();
            for (int i = row; i < r; i++) {
                outDevice.draw("\n");
                col = 0;
            }
            for (int i = col; i < c; i++) {
                outDevice.draw(" ");
            }


            int playersNum = PlayerMgr.getInstance().getPlayersNum();
            boolean nobody = true;
            for (int i = 0; i < playersNum; i++) {
                if(block == PlayerMgr.getInstance().getPlayerPosition(i) && nobody){
                    outDevice.draw(new Integer(i).toString());
                    nobody = false;
                }
            }
            if(nobody){
                outDevice.draw(block.name());
            }

//            if (block == PlayerMgr.getInstance().getPlayerPosition(0)){
//                // 第一个玩家
//                outDevice.draw("0");
//            } else if (block == PlayerMgr.getInstance().getPlayerPosition(1)){
//                // 第二个玩家
//                outDevice.draw("1");
//            } else {
//                outDevice.draw(block.name());
//            }

            row = r;
            col = c + 1;
        }
        outDevice.draw("\n\n");
    }
}
