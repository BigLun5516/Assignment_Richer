package block;

import global.DirID;

public class LinkedBlock extends Block {
    public LinkedBlock(Block block) {
        this.kernel = block.clone();
        neighbors = new Block[DirID.DIR_COUNT];
    }

    public String name() {
        return kernel.name();
    }

    public Block clone() {
        return new LinkedBlock(kernel);
    }

    public void setNeighbor(int dir, Block block) {
        if (dir > DirID.DIR_NONE && dir < DirID.DIR_COUNT) {
            neighbors[dir] = block;
        }
        // 感觉没用，但删了有错，估计是移动部分的原因
        else if (dir == DirID.DIR_NONE) {
            neighbors[dir] = null;
        }
    }

    public Block getNeighbor(int dir){
        return neighbors[dir];
    }


    private Block kernel;
    private Block[] neighbors;

}
