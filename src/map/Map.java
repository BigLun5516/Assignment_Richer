package map;

import block.Block;
import outdevice.OutDevice;

public class Map {
	public Map(MapImp mapImp){
		this.mapImp = mapImp;
	}
	public void addBlock(Block block){
		mapImp.addBlock(block);
	};
	public Block getBlock(int index){
		return mapImp.getBlock(index);
	}
	public Block getBlockById(int id){ return mapImp.getBlockById(id); }
	public  void showMap(OutDevice outDevice){
		mapImp.showMap(outDevice);
	}
	public int getBlocksNum(){
		return mapImp.getBlocksNum();
	}

	private  MapImp mapImp;
}
