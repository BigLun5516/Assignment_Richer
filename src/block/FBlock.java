package block;

import player.Player;

public class FBlock extends Block {
	@Override
	public void effect(Player me) throws Exception {

	}

	@Override
	public String name() {
		return new String("F");
	}

	@Override
	public Block clone() {
		return new FBlock();
	}

}
