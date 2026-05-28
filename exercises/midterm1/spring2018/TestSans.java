package spring2018;

import org.junit.Test;
import static org.junit.Assert.*;
//    d) (12 points). Suppose we want to write tests for and sans and ilsans. Fill in the code below with a
//    JUnit test to see if each method behaves as expected for one example input. Do not write a test for null
//    inputs. Reminder that IntList.of(4, 5, 6) creates an IntList containing the values 4, 5, and 6.
//    Assume the methods on the previous page are all part of a class called Sans, i.e. they are invoked as
//    Sans.sans.

public class TestSans {
    @Test
    public void testSans() { // TEST THE ARRAY VERSION OF SANS
        int[] x = new int[]{1, 2, 3, 4, 5, 6, 1};
        int y = 1;
        int[] expected = {2, 3, 4, 5, 6};
        int[] actual = Sans.sans(x, y);
        assertArrayEquals(expected, actual);
    }

    @Test // TEST THE NON-DESTRUCTIVE INTLIST VERSION OF SANS
    public void testIlsans() {
        IntList x = IntList.of(1, 2, 3, 4, 5, 6, 1);
        int y = 1;
        IntList expected = IntList.of(2, 3, 4, 5, 6);
        IntList actual = Sans.ilsans(x, y);

        assertEquals(expected, actual);
        assertNotEquals(x, actual);
    }
}
