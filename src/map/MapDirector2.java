package map;

import block.LinkedBlock;
import global.DirID;

public class MapDirector2 extends MapDirector {
    public MapDirector2(Builder builder){
        super.builder = builder;
    }
    public void createMap(){
        Map aMap = new Map(new MapImpWithPlayer());
        // 类型	序号	行	列	LEFT	RIGHT	UP	DOWN
        int layout[][] = {
                {1, 1, 0, 0, 0, 2, 0, 6},
                {1, 2, 0, 1, 1, 3, 0, 0},
                {1, 3, 0, 2, 2, 4, 0, 7},
                {1, 4, 0, 3, 3, 5, 0, 0},
                {1, 5, 0, 4, 4, 0, 0, 8},
                {2, 6, 1, 0, 0, 0, 1, 9},
                {2, 7, 1, 2, 0, 0, 3, 10},
                {2, 8, 1, 4, 0, 0, 5, 12},
                {3, 9, 2, 0, 0, 0, 6, 13},
                {3, 10, 2, 2, 0, 11, 7, 14},
                {3, 11, 2, 3, 10, 12, 0, 0},
                {3, 12, 2, 4, 11, 0, 8, 15},
                {4, 13, 3, 0, 0, 0, 9, 16},
                {4, 14, 3, 2, 0, 0, 10, 18},
                {4, 15, 3, 4, 0, 0, 12, 20},
                {1, 16, 4, 0, 0, 17, 13, 0},
                {1, 17, 4, 1, 16, 18, 0, 0},
                {1, 18, 4, 2, 17, 19, 14, 0},
                {1, 19, 4, 3, 18, 20, 0, 0},
                {1, 20, 4, 4, 19, 21, 15, 0},
                {2, 21, 4, 5, 20, 22, 0, 0},
                {2, 22, 4, 6, 21, 23, 0, 0},
                {2, 23, 4, 7, 22, 0, 0, 0}
        } ;

        for (int i = 0; i < 23; i++) {
            LinkedBlock temp = (LinkedBlock) builder.buildBlock(layout[i][0]);
            temp.setPosition(layout[i][2], layout[i][3]);
            temp.setId(layout[i][1]);
            aMap.addBlock(temp);
        }

        for (int i = 0; i < 23; i++) {
            LinkedBlock temp = (LinkedBlock) aMap.getBlock(i);
            temp.setNeighbor(DirID.DIR_LEFT, aMap.getBlock(layout[i][4] - 1));
            temp.setNeighbor(DirID.DIR_RIGHT, aMap.getBlock(layout[i][5] - 1));
            temp.setNeighbor(DirID.DIR_UP, aMap.getBlock(layout[i][6] - 1));
            temp.setNeighbor(DirID.DIR_DOWN, aMap.getBlock(layout[i][7] - 1));
        }
        map = aMap;
    }

}
