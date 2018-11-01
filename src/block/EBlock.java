package block;

import player.Player;

public class EBlock extends Block {
	@Override
	public void effect(Player me) throws Exception {

	}

	@Override
	public String name() {
		return new String("E");
	}

	@Override
	public Block clone() {
		return new EBlock();
	}

}
