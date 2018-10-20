package game;
import menu.*;

/*
 * 作者：李钦伦
 * 学号：551651119
 * 时间：2018.9.7
 */

public class Game {
	public Setting setting;
	public static Game getInstance() {
		if(instance == null) {
			instance = new Game();
		}
		return instance;
	}
	public void init() {
		setting = new Setting();
	}
	public void run() {
		boolean notOver = true ;
		while(notOver) {
			Menu menu = MenuMgr.getInstance().getCurMenu();
			if(MainMenu.class.isInstance(menu)){
				notOver = new MenuDecoratorWithMusic(
						new MenuDecoratorWithHead(menu)
				).process();
			} else {
				notOver = new MenuDecoratorWithMusic(menu).process();
			}
		}
	}
	public void term() {
		Input.in.close();
	}

	private static Game instance = null;
	private Game() {}


	public static void main(String[] args) {
		//Game game = new Game();
		Game.getInstance().init();
		Game.getInstance().run();
		Game.getInstance().term();

	}
	
	

}
