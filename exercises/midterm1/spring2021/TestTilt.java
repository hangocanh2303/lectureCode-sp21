package spring2021;

import org.junit.Test;
import spring2019.IntList;

import static org.junit.Assert.assertEquals;

public class TestTilt {
    @Test
    public void testNoMerge() {
        IntList L = IntList.of(2, 4, 2, 4);
        tiltRowLeft(L);
        IntList expected = IntList.of(2, 4, 2, 4);
        assertEquals(expected, L);
    }

    @Test
    public void testOneMerge() {
        IntList L = IntList.of(2, 2, 8, 4);
        tiltRowLeft(L);
        IntList expected = IntList.of(4, 8, 4);
        assertEquals(expected, L);
    }

    @Test
    public void testTwoMerges() {
        IntList L = IntList.of(2, 2, 4, 4);
        tiltRowLeft(L);
        IntList expected = IntList.of(4, 8);
        assertEquals(expected, L);
    }

    @Test
    public void testTrickyCase() {
        IntList L = IntList.of(2, 2, 4, 8);
        tiltRowLeft(L);
        IntList expected = IntList.of(4, 4, 8);
        assertEquals(expected, L);
    }

    @Test
    public void testMoreThanFour() {
        IntList L = IntList.of(2, 2, 4, 2, 8, 8, 4, 2, 2);
        tiltRowLeft(L);
        IntList expected = IntList.of(4, 4, 2, 16, 4, 4);
        assertEquals(expected, L);
    }

    public static void tiltRowLeft(IntList tiles) {
        IntList p = tiles;
        while (p.rest != null) {
            if (p.first == p.rest.first) {
                p.first += p.first;
                p.rest = p.rest.rest;
                if (p.rest == null) { // Using this is optional.
                    break; // If you don't want to break,
                } // just put "false" in the blank.
            }
            p = p.rest;
        }
    }
//    public static void tiltRowLeft(IntList tiles) {
//        IntList p = tiles;
//        while (p.rest != null) {
//            if (p.first == p.rest.first) {
//                p.first += p.first;
//                p.rest = p.rest.rest;
//                if (p.rest == null) { // Using this is optional.
//                    break; // If you don't want to break,
//                } // just put "false" in the blank.
//            }
//            p = p.rest;
//        }
//    }
}
