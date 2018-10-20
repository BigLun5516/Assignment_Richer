package menu;
import game.Game;
import game.Input;
import outdevice.OutDevice;
import outdevice.OutDeviceWithSpace;
import outdevice.StreamDevice;

public abstract class Menu {
	
	public boolean process() {
		show(new OutDeviceWithSpace(new StreamDevice()));
		int choice = getChoice();
		return doChoice(choice);
	}
	public int getChoice(){
		return Input.in.nextInt();
	}
	public abstract void show(OutDevice outDevice);
	public abstract boolean doChoice(int choice);
}
