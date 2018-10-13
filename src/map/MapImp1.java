package map;

import block.Block;

public class MapImp1 extends MapImp{
    public void showMap(){
        int rowMax = 0;
        int colMax = 0;
        for (int i = 0; i < blocks.size(); i++) {
            if(blocks.get(i).getRow() > rowMax){
                rowMax = blocks.get(i).getRow();
            }
            if(blocks.get(i).getCol() > colMax){
                colMax = blocks.get(i).getCol();
            }
        }
        // 初始化
        String blocksMap[][] = new String[rowMax + 1][colMax + 1];
        for (int i = 0; i < rowMax + 1; i++) {
            for (int j = 0; j < colMax +1; j++) {
                blocksMap[i][j] = " ";
            }
        }

        // 填值
        for (int i = 0; i < blocks.size(); i++) {
            Block tempBlock = blocks.get(i);
            blocksMap[tempBlock.getRow()][tempBlock.getCol()]
                    = tempBlock.name();
        }

        for (int i = 0; i < rowMax + 1; i++) {
            for (int j = 0; j < colMax + 1; j++) {
                System.out.print(blocksMap[i][j]);
            }
            System.out.print("\n");
        }
    }
}
