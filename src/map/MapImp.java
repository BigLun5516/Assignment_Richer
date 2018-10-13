package map;

import block.Block;

import java.util.Vector;

public abstract class MapImp {
    public MapImp(){
    }
    public abstract void showMap();
    public void addBlock(Block block){
        blocks.add(block);
    }
    public Block getBlock(int index){
        return blocks.get(index);
    }
    public Block getBlockById(int id){
        for (int i = 0; i < blocks.size(); i++) {
            if(blocks.get(i).getId() == id){
                return blocks.get(i);
            }
        }
        return null;
    }

    protected Vector<Block> blocks = new Vector<>();
}

