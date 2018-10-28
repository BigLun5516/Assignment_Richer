package map;

import player.PlayerMgr;
import block.Block;
import outdevice.OutDevice;

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
            if (block == PlayerMgr.getInstance().getPlayerPosition(0)){
                // 第一个玩家
                outDevice.draw("0");
            } else if (block == PlayerMgr.getInstance().getPlayerPosition(1)){
                // 第二个玩家
                outDevice.draw("1");
            } else {
                outDevice.draw(block.name());
            }

            row = r;
            col = c + 1;
        }
        outDevice.draw("\n\n");
    }
}
