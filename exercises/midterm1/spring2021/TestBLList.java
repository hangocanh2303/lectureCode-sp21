package spring2021;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestBLList {

    @Test
    public void testAddLastAndGet() {
        BLList<Integer> b = new BLList<>();
        b.addLast(1);
        b.addLast(2);
        b.addLast(3);

        assertEquals(1, (long) b.get(0));
        assertEquals(2, (long) b.get(1));
        assertEquals(3, (long) b.get(2));
    }
}
