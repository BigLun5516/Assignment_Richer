package map;

import block.Block;
import outdevice.OutDevice;

public class MapImp1 extends MapImp{
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
            outDevice.draw(block.name());
            row = r;
            col = c + 1;
        }
        outDevice.draw("\n\n");
    }


}
