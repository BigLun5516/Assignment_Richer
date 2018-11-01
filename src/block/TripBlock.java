package block;

import player.Player;

public class TripBlock extends Block {
	@Override
	public void effect(Player me) throws Exception {
		me.setMoney(me.getMoney() - 50);
		me.setLife(me.getLife() - 10);
	}

	@Override
	public String name() {
		return new String("B");
	}

	@Override
	public Block clone() {
		return new TripBlock();
	}
}
