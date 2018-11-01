package block;

import player.Player;

public class TripBlock extends Block {
	@Override
	public void effect(Player me) throws Exception {
		me.setMoney(me.getMoney() - moneyPunish);
		me.setLife(me.getLife() - lifePunish);
	}

	@Override
	public String name() {
		return new String("B");
	}

	@Override
	public Block clone() {
		TripBlock tripBlock = new TripBlock();
		tripBlock.setMoneyPunish(moneyPunish);
		return tripBlock;
	}

	private float moneyPunish = 50;
	private float lifePunish = 10;


	public void setMoneyPunish(float moneyPunish) {
		this.moneyPunish = moneyPunish;
	}

	public void setLifePunish(float lifePunish) {
		this.lifePunish = lifePunish;
	}
}
