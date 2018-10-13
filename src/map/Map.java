package map;

import block.Block;
import block.BlockID;
import factory.MapFactory;
import jdk.nashorn.internal.ir.BlockStatement;

import java.util.Vector;

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
	public  void showMap(){
		mapImp.showMap();
	}

	private  MapImp mapImp;
}
