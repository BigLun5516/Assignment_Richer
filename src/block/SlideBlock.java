package block;

import player.Player;

public class SlideBlock extends Block {
	@Override
	public void effect(Player me) throws Exception {
		me.setTempMoveDistance(me.getTempMoveDistance() + 2);
	}

	@Override
	public String name() {
		return new String("D");
	}
	
	@Override
	public Block clone() {
		return new SlideBlock();
	}
}
