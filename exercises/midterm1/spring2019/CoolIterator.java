package spring2019;

import java.util.Iterator;

public class CoolIterator implements Iterator<Integer> {
    IntList L;

    public CoolIterator(IntList input) {
        L = input;
    }

    public boolean hasNext() {
        return L != null;
    }

    private IntList getNext(int x, IntList p) {
        if (p == null) {
            return null;
        }

        if (x == 0) {
            return p;
        }

        return getNext(x - 1, p.rest);
    }

    public Integer next() {
        int first = L.first;
        L = getNext(L.first, L);
        return first;
    }

    public static void main(String[] args) {
        IntList L = IntList.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});

        CoolIterator ci = new CoolIterator(L);

        while (ci.hasNext()) {
            System.out.print(ci.next());
        }
    }
}

// What will be the output of the main method above? 1248