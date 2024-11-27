package Iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int current;
    private int next;

    public FibonacciIterator() {
        this.current = 0;
        this.next = 1;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int temp = current;
        current = next;
        next = temp + current;
        return temp;
    }
}
