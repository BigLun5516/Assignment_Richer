package map;

import block.*;

/*
 * 生成器方法
 * 可以一次建造多块状
 */
public class Builder {
	///使用原型方法
	public Block buildBlock(int blockID) {
		return BlockManager.getInstance().cloneBlock(blockID);

	}
	

}
