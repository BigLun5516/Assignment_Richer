package Player;

import map.MapMgr;
import outdevice.StreamDevice;

public class AutoPlayer extends Player {
    @Override
    public boolean play(boolean waitChoose){
        System.out.println("\n\nAutoPlayer is playing");
        MapMgr.getInstance().getCurMap().showMap(new StreamDevice());
        return true;
    }
}
