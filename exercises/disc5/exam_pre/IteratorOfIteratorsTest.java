package exam_pre;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class IteratorOfIteratorsTest {

    @Test
    public void testIteratorOfIterator() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(4);
        a.add(5);

        ArrayList<Integer> b = new ArrayList<>();

        ArrayList<Integer> c =  new ArrayList<>();

        c.add(2);

        List<Iterator<Integer>> list = new ArrayList<>();
        list.add(a.iterator());
        list.add(b.iterator());
        list.add(c.iterator());

        IteratorOfIterators iterators = new IteratorOfIterators(list);

        ArrayList<Integer> actual = new ArrayList<>();

        for (IteratorOfIterators it = iterators; it.hasNext(); ) {
            Integer item = it.next();
            actual.add(item);
        }

        Integer[] expected = new Integer[]{1, 2, 3, 4, 5};

        assertArrayEquals(expected,
                actual.toArray(new Integer[0]));
    }
}
