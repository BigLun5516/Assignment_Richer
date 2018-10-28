package iterator;

import player.Player;

import java.util.Vector;

public class JavaIterator<T> {
    public JavaIterator(Vector<T> vector){
        this.vector = vector;
    }

    public T next(){
        return vector.get(++index);
    }

    public T cycleNext(){
        index = (index + 1) % vector.size();
        return vector.get(index);
    }

    public boolean hasNext(){
        if (index >= vector.size() - 1){
            return false;
        } else {
            return true;
        }
    }

    public int count(){
        return vector.size();
    }

    public void reset(){
        index = -1;
    }

    private Vector<T> vector;
    private int index = -1;
}
