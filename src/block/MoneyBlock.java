package block;

public class MoneyBlock extends Block {
	@Override
	public String name() {
		return new String("A");
	}
	
	@Override
	public Block clone() {
		return new MoneyBlock();
	}
}
