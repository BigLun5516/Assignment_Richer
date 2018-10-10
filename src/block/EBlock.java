package block;

public class EBlock extends Block {

	@Override
	public String name() {
		return new String("E");
	}

	@Override
	public Block clone() {
		return new EBlock();
	}

}
