package block;

public class BarBlock extends Block {
	@Override
	public String name() {
		return new String("C");
	}
	
	@Override
	public Block clone() {
		return new BarBlock();
	}
}
