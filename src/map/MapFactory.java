package map;

import block.BarBlock;
import block.MoneyBlock;
import block.SlideBlock;
import block.TripBlock;
/*
 * 使用普通工厂创建地图
 * 细致到每一块砖的创建
 */
public class MapFactory {
	public String createMap() {
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append(new MoneyBlock());
		stringBuilder.append(new MoneyBlock());
		stringBuilder.append(new MoneyBlock());
		stringBuilder.append(new MoneyBlock());
		stringBuilder.append(new MoneyBlock());
		stringBuilder.append("\n");
		
		stringBuilder.append(new TripBlock());
		stringBuilder.append("   ");
		stringBuilder.append(new TripBlock());
		stringBuilder.append("\n");
		
		stringBuilder.append(new BarBlock());
		stringBuilder.append("   ");
		stringBuilder.append(new BarBlock());
		stringBuilder.append("\n");
		
		stringBuilder.append(new SlideBlock());
		stringBuilder.append("   ");
		stringBuilder.append(new SlideBlock());
		stringBuilder.append("\n");
		
		stringBuilder.append(new MoneyBlock());
		stringBuilder.append(new MoneyBlock());
		stringBuilder.append(new MoneyBlock());
		stringBuilder.append(new MoneyBlock());
		stringBuilder.append(new MoneyBlock());
		
		return stringBuilder.toString();
	}
}
