package block;

public class TripBlock extends Block {
	@Override
	public String name() {
		return new String("B");
	}

	@Override
	public Block clone() {
		return new TripBlock();
	}
}
