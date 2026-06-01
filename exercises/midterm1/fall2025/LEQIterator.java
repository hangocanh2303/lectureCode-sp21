package fall2025;

import java.util.Iterator;

public class LEQIterator implements Iterator<Integer> {

    private IntList curr;
    private int frontIndex;

    public LEQIterator(IntList L) {
        curr = L;
        frontIndex = L.first;
    }

    public boolean hasNext() {
        return curr != null;
    }

    public Integer next() {
        int result = curr.first;
        curr = curr.rest;
        while (curr != null && curr.first > frontIndex) {
            curr = curr.rest;
        }
        return result;
    }
}
