package map;

import block.Block;
import block.BlockID;


public class MapDirector1 extends MapDirector{
    public MapDirector1(Builder builder){
        super.builder = builder;
    }
    public void createMap(){
        Map aMap = new Map(new MapImp1());

        int layout[][] = {
                {1, 1, 1, 1, 1},
                {2, 0, 0, 0, 2},
                {3, 3, 3, 3, 3},
                {4, 0, 0, 0, 4},
                {1, 1, 1, 1, 1}
        } ;

        for(int r = 0; r < BlockID.BLOCK_ROWS; r++){
            for(int c = 0; c < BlockID.BLOCK_COLS; c++){
                if (layout[r][c] != 0){
                    Block temp = builder.buildBlock(layout[r][c]);
                    temp.setPosition(r, c);
                    aMap.addBlock(temp);
                }
            }
        }
        map = aMap;
    }
//    public Map getMap(){
//        return map;
//    }
//
//    private Map map;
//    private Builder builder;
}
