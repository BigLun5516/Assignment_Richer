package map;

import block.Block;
import block.BlockID;

/*
 * 未使用原型方法
 */
public class MapDirector {
	public MapDirector(Builder builder){
		this.builder = builder;
	}

	private Map map;
	private Builder builder;
	public void createMap(){
		Map aMap = new Map();

		int layout[][] = {
				{1, 1, 1, 1, 1},
				{2, 0, 0, 0, 2},
				{3, 3, 3, 3, 3},
				{4, 0, 0, 0, 4},
				{1, 1, 1, 1, 1}
		} ;

		for(int r = 0; r < BlockID.BLOCK_ROWS; r++){
			for(int c = 0; c < BlockID.BLOCK_COLS; c++){
				aMap.setBlock(r,c,builder.buildBlock(layout[r][c]));
			}
		}
		map = aMap;
	}
	public Map getMap(){
		return map;
	}

}
