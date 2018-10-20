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
	public  void showMap(OutDevice outDevice){
		mapImp.showMap(outDevice);
	}

	private  MapImp mapImp;
}
