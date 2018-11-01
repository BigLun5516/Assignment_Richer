package block;

import player.Player;
import prop.state.State;

import java.util.Vector;

public class BarBlock extends Block {
	@Override
	public void effect(Player me) throws Exception {
		Vector<State> myStates = me.getStates();
		int myStatesNum = myStates.size();
		boolean ableIgnoreBar = false;
		for (int i = 0; i < myStatesNum; i++) {
			if(myStates.get(i).getFeature().equals("IgnoreBar")){
				ableIgnoreBar = true;
			}
		}
		if (!ableIgnoreBar){
			throw new Exception();
		}
	}

	@Override
	public String name() {
		return new String("C");
	}
	
	@Override
	public Block clone() {
		return new BarBlock();
	}
}
