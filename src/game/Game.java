package game;
import menu.MenuMgr;

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
			
			notOver = MenuMgr.getInstance().getCurMenu().process();
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
