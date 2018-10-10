package block;

public class SlideBlock extends Block {
	@Override
	public String name() {
		return new String("D");
	}
	
	@Override
	public Block clone() {
		return new SlideBlock();
	}
}
