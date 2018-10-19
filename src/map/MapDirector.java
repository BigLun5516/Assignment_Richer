package map;


public abstract class MapDirector {
	public abstract void createMap();
	public Map getMap(){
		return map;
	}

	protected Map map;
	protected Builder builder;
}
