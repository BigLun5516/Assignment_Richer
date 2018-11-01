package map;

import block.Block;
import outdevice.OutDevice;

import java.util.Vector;

public abstract class MapImp {
    public MapImp(){
    }
    public abstract void showMap(OutDevice outDevice);
    public void addBlock(Block block){
        blocks.add(block);
    }
    public Block getBlock(int index){
        if (index >= 0) {
            return blocks.get(index);
        } else {
            return null;
        }
    }
    public Block getBlockById(int id){
        for (int i = 0; i < blocks.size(); i++) {
            if(blocks.get(i).getId() == id){
                return blocks.get(i);
            }
        }
        return null;
    }

    public int getBlocksNum(){
        return blocks.size();
    }

    protected Vector<Block> blocks = new Vector<>();
}

