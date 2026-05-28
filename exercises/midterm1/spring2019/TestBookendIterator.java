package spring2019;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;


public class TestBookendIterator {
    @Test
    public void testBookendIterator() {
        List<String> L2 = List.of("cats", "live", "in", "space");

        Iterator<String> it2 = L2.iterator();

        Iterator<String> bit2 = new BookendIterator<>(it2);

        List<String> expected = List.of("cats", "space");
        List<String> actual = new ArrayList<>();
        while (bit2.hasNext()) {
//            System.out.println(bit2.next());
            actual.add(bit2.next());
        }
        assertEquals(expected, actual);

    }
}
