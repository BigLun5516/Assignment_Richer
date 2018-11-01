package block;

import player.Player;

public class MoneyBlock extends Block {
	@Override
	public void effect(Player me) throws Exception {
		me.setMoney(me.getMoney() + 50);
	}

	@Override
	public String name() {
		return new String("A");
	}
	
	@Override
	public Block clone() {
		return new MoneyBlock();
	}
}
