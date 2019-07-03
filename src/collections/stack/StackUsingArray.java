package collections.stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackUsingArray<E> implements StackInterface {

    ArrayList<Integer> al;

    public StackUsingArray(){
        al = new ArrayList<>();
    }

    @Override
    public void push(int n) {
    al.add(0,n);
    }


    @Override
    public int peek() {
        return al.get(0);
    }

    @Override
    public int size() {
        return al.size();
    }

    @Override
    public Integer pop() {
        if (al.isEmpty())  throw new EmptyStackException();

        return al.remove(0);
    }
}
