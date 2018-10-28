package player;

import block.Block;
import block.LinkedBlock;
import block.MoneyBlock;
import global.DirID;

import java.util.Random;
import java.util.Vector;


// 有别的路就不后退，别的路概率一样
public class MoveStrategy1 extends MoveStrategy {
    @Override
    public Block move(Player player) {
        Block position = player.getPosition();
        Block lastPosition = player.getLastPosition();
        // 统计当前块的邻居（除lastPosition）
        Vector<Integer> neighbors = new Vector<>();
        for (int i = DirID.DIR_LEFT; i < DirID.DIR_COUNT; i++) {
            Block neighbor = ((LinkedBlock)position).getNeighbor(i);
            if ( neighbor != null && neighbor != lastPosition){
                neighbors.add(i);
            }
        }
        // 寻找下一块
        int size = neighbors.size();
        if (size != 0){
            Random rand = new Random();
            // select表示Vector neighbors中的第几个
            int select = rand.nextInt(size);

            return ((LinkedBlock)position).getNeighbor(neighbors.get(select));
        } else {
            return lastPosition;
        }
    }
}
