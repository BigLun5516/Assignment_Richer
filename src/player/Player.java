package player;

import block.Block;
import map.MapMgr;
import prop.Prop;
import prop.state.State;

import java.util.Iterator;
import java.util.Vector;

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
        prop.execute(this);
    }

    protected Block position;
    protected Block lastPosition;
    protected MoveStrategy moveStrategy;
    protected float money = 50;  // 经过moneyBlock 给50金币
    protected float life = 100;  // 经过 tripBlock 减20金币 减20生命值
    protected int moveDistance;
    protected int defaultMoveDistance;
    protected int tempMoveDistance;

    private int id;
    protected Vector<State> states = new Vector<>();

    public void statesExecute(){
        Iterator<State> it = states.iterator();
        while(it.hasNext()){
            State temp = it.next();
            temp.execute(this);
            if(temp.getDuration() == -1){
                it.remove();
            }
        }
    }

    public void addState(State state){
        states.add(state);
    }

    public void deleteAllStates(){
        states.clear();
    }

    public Vector<State> getStates() {
        return states;
    }

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

    public int getMoveDistance() {
        return moveDistance;
    }

    public void setMoveDistance(int moveDistance) {
        this.moveDistance = moveDistance;
    }

    public int getDefaultMoveDistance() {
        return defaultMoveDistance;
    }

    public int getTempMoveDistance() {
        return tempMoveDistance;
    }

    public void setTempMoveDistance(int tempMoveDistance) {
        this.tempMoveDistance = tempMoveDistance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
