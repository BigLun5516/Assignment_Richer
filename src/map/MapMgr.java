package map;

public class MapMgr {
    public static MapMgr getInstance(){
        if(instance == null){
            instance = new MapMgr();
        }
        return instance;
    }
    public void createMap(){
        mapDirector.createMap();
        curMap = mapDirector.getMap();
    }

    public void setMapDirector(MapDirector mapDirector) {
        this.mapDirector = mapDirector;
    }

    public Map getCurMap() {
        return curMap;
    }

    private  static MapMgr instance;
    private Map curMap;
    private MapDirector mapDirector;
    private  MapMgr(){
//        mapDirector = new MapDirector1(new Builder());
        mapDirector = new MapDirector2(new LinkedBuilder());
        createMap();
    }
}
