package iterator;

import java.util.Vector;

public class CppIterator<T> {
    public CppIterator(Vector<T> vector){
        this.vector = vector;
    }

    public T first(){
        if (vector.size() != 0){
            return vector.get(0);
        } else {
            return null;
        }
    }

    public T next(){
        return vector.get(++index);
    }





    public int count(){
        return vector.size();
    }



    private Vector<T> vector;
    private int index = 0;
}
