package map;

import block.Block;
import block.BlockID;
import factory.MapFactory;
import jdk.nashorn.internal.ir.BlockStatement;

public class Map {
	public Map(){
		blocks = new Block[BlockID.BLOCK_ROWS][BlockID.BLOCK_COLS];
	}


	private Block blocks[][];


	public void setBlock(int r,int c,Block block){
		blocks[r][c] = block;
	}
	public Block getBlock(int r,int c) {
		return blocks[r][c];
	}

	public  void showMap(){
		for(int r = 0; r < BlockID.BLOCK_ROWS; r++){
			for(int c = 0; c < BlockID.BLOCK_COLS; c++){
				if(blocks[r][c] != null){
					System.out.print(blocks[r][c].name() + " ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("\n");
		}
	}
	
}
