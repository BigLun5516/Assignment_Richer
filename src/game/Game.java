package game;
import factory.MenuFactory;
import map.Builder;
import map.Map;
import map.MapDirector;
import menu.Menu;
import menu.MenuID;
import menu.MenuMgr;

/*
 * 作者：李钦伦
 * 学号：551651119
 * 时间：2018.9.7
 */
public class Game {
	///单例实现
	static private Game instance = null;
	private Game() {}
	static public Game getInstance() {
		if(instance == null) {
			instance = new Game();
		}
		return instance;
	}
	
	
	
	private Menu curMenu;
	private Map curMap;

	public Setting setting;

	public Map getCurMap() {
		return curMap;
	}

	public void init() {
		setCurMenu(MenuID.MAIN_MENU);
		setting = new Setting();
		createMap();
	}
	public void run() {
		boolean notOver = true ;
		while(notOver) {
			
			notOver = curMenu.process();
		}
	}
	public void term() {
		Input.in.close();
	}
	
	public void setCurMenu(int menuID) {
		MenuMgr menuMgr = MenuMgr.getInstance();
		menuMgr.setAbsMenuFactory(new MenuFactory());
		curMenu = menuMgr.getMenu(menuID);
		
	}


	public void createMap(){
		MapDirector mapDirector = new MapDirector(new Builder());
		mapDirector.createMap();
		curMap = mapDirector.getMap();
	}



	public static void main(String[] args) {
		//Game game = new Game();
		Game.getInstance().init();
		Game.getInstance().run();
		Game.getInstance().term();

	}
	
	

}
