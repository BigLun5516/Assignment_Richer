package player;

import block.Block;
import map.MapMgr;
import prop.Prop;

public abstract class Player {

    public abstract boolean play(boolean waitChoose);

    public void resetPosition(){
        position = MapMgr.getInstance().getCurMap().getBlock(0);
        lastPosition = null;
    }

    public Player(){
        moveStrategy = new MoveStrategy3();
    }

    public void useProp(Prop prop){
        prop.excute(this);
    }

    protected Block position;
    protected Block lastPosition;
    protected MoveStrategy moveStrategy;
    protected float money = 50;  // 经过moneyBlock 给50金币
    protected float life = 100;  // 经过 tripBlock 减20金币 减20生命值
    protected float moveDistance;
    private int id;

    // get set
    public Block getPosition(){
        return position;
    }
    public Block getLastPosition(){
        return lastPosition;
    }
    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public float getLife() {
        return life;
    }

    public void setLife(float life) {
        this.life = life;
    }

    public float getMoveDistance() {
        return moveDistance;
    }

    public void setMoveDistance(float moveDistance) {
        this.moveDistance = moveDistance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
