package map;

import block.Block;
import block.BlockManager;
import block.LinkedBlock;

public class LinkedBuilder extends Builder{
	public Block buildBlock(int blockID){
		return new LinkedBlock(BlockManager.getInstance().cloneBlock(blockID));
	}
}
