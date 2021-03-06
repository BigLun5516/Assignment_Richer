package block;

import global.BlockID;

public class BlockManager {
	static public BlockManager getInstance(){
		if(blockManager == null){
			blockManager = new BlockManager();
		}
		return blockManager;
	}
	static private  BlockManager blockManager;
	private  BlockManager(){
		prototypes = new Block[BlockID.BLOCK_COUNT];
		prototypes[BlockID.NONEBLOCK] = null;
		prototypes[BlockID.MONEYBLOCK] = new MoneyBlock();
		prototypes[BlockID.TRIPBLOCK] = new TripBlock();
		prototypes[BlockID.BARBLOCK] = new BarBlock();
		prototypes[BlockID.SLIDEBLOCK] = new SlideBlock();

	}


	private  Block prototypes[];


	
	
	public Block cloneBlock(int id) {
		if(id > BlockID.NONEBLOCK && id < BlockID.BLOCK_COUNT){
			Block temp = prototypes[id].clone();
			return temp;
		}
		return null;
	}
	
	 public void setPrototypes(int blockID,Block block) {
		prototypes[blockID] = block;
	 }

	 public Block getBlockPrototype(int index){
		return prototypes[index];
	 }
	
	
	
	
}
