package player;

import block.Block;
import block.LinkedBlock;
import global.DirID;

import java.util.Random;
import java.util.Vector;


// 所有可选方向概率一样
public class MoveStrategy2 extends MoveStrategy {
    @Override
    public Block move(Player player) {
        Block position = player.getPosition();
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
