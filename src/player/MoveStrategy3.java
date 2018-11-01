package player;

import block.Block;
import block.LinkedBlock;
import global.DirID;

import java.util.Random;
import java.util.Vector;

/*
这里边的dirId 与 DirID中的不一样，相差1；
 */

// 第一次走 多有方向概率一样
// 不是第一次走 概率因情况而定，但一般直行最大
public class MoveStrategy3 extends MoveStrategy {
    @Override
    public Block move(Player player) {
        Block position = player.getPosition();
        LinkedBlock lastPostion = (LinkedBlock)player.getLastPosition();
        // 不是第一次前进
        if (lastPostion != null) {
            int lastDir = -1; // 上一步的方向
            for (int i = DirID.DIR_LEFT; i < DirID.DIR_COUNT; i++) {
                if(lastPostion.getNeighbor(i) == position){
                    lastDir = i - 1;
                }
            }
            // 统计当前块的邻居（除lastPosition）
            Vector<Boolean> neighbors = new Vector<>();
            // 某个方向有邻居，对应下标-1设为true，否之设为false
            for (int i = DirID.DIR_LEFT; i < DirID.DIR_COUNT; i++) {
                Block neighbor = ((LinkedBlock)position).getNeighbor(i);
                if ( neighbor != null ){
                    neighbors.add(true);
                } else {
                    neighbors.add(false);
                }
            }

            // 寻找下一块
            int size = 0;
            for (int i = 0; i < 4; i++) {
                if(neighbors.get(i) == true){
                    size++;
                }
            }
            // 生成一个1-100的整数
            int randomRes = (int)(Math.random() * 100 + 1);
            int nextDir = -1;
            if (size == 4) {
                if (randomRes <= 50) {
                    nextDir = lastDir;
                } else if (randomRes <= 75) {
                    nextDir = (lastDir + 1) % 4;
                } else {
                    nextDir = (lastDir - 1) % 4;
                }
            } else if (size == 3){
                // 可以直行
                if (neighbors.get(lastDir)) {
                    if (randomRes <= 60){
                        nextDir = lastDir;
                    } else if(neighbors.get((lastDir + 1) % 4)){
                        nextDir = (lastDir + 1) % 4;
                    } else {
                        nextDir = (lastDir - 1) % 4;
                    }
                }
                // 不可直行
                else {
                    if (randomRes <= 50) {
                        nextDir = (lastDir + 1) % 4;
                    } else {
                        nextDir = (lastDir - 1) % 4;
                    }
                }
            } else if (size == 2) {
                // 只能直行或返回时选择直行
                for (int i = 0; i < DirID.DIR_COUNT - 1; i++) {
                    if ( neighbors.get(i) && i != (lastDir + 2) % 4){
                        nextDir = i;
                    }
                }
            } else {
                nextDir = (lastDir + 2) % 4;
            }

            return ((LinkedBlock) position).getNeighbor(nextDir + 1);
        }
        // 第一次前进
        else {
            // 统计当前块的邻居
            Vector<Integer> neighbors = new Vector<>();
            for (int i = DirID.DIR_LEFT; i < DirID.DIR_COUNT; i++) {
                Block neighbor = ((LinkedBlock)position).getNeighbor(i);
                if ( neighbor != null ){
                    neighbors.add(i);
                }
            }
            // 寻找下一块
            int size = neighbors.size();
            Random rand = new Random();
            // select表示Vector neighbors中的第几个
            int select = rand.nextInt(size);
            return ((LinkedBlock)position).getNeighbor(neighbors.get(select));
        }


    }
}
