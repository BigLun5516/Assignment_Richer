package block;

public class FBlock extends Block {

	@Override
	public String name() {
		return new String("F");
	}

	@Override
	public Block clone() {
		return new FBlock();
	}

}
