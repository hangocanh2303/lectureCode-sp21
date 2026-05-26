package spring2018;

import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import spring2018.Problem4.IntList;
import org.junit.Test;
import static org.junit.Assert.*;

@RunWith(Enclosed.class)
public class Problem4 {
//    4. Sans. Implement the methods below. For reference, the IntList class is defined at the bottom of the
//            next page.
//    a) (7 points). /** Non-destructively creates a copy of x that contains no y. */
    public static int[] sans(int[] x, int y) {
        int[] xclean = new int[x.length];
        int c = 0;
        for (int i = 0; i < x.length; i += 1) {
            if (x[i] != y) {
                xclean[c] = x[i];
                c += 1;
            }
        }
        int[] r = new int[c];
        System.arraycopy(xclean, 0, r, 0, c);
        return r; // arraycopy parameters are:
    } // srcArr, srcStartIdx, destArr, destStartIdx, numToCopy
    // where src->source, dest->destination, Idx->index
//    b) (9 points). /** Non-destructively creates a copy of x that contains no y. */
    public static IntList ilsans(IntList x, int y) {
        if (x == null) {
            return x;
        }
        if (x.first == y) {
            return ilsans(x.rest, y);
        }
        return new IntList(x.first, ilsans(x.rest, y));
    }
//    c) (9 points). /** Destructively creates a copy of x that contains no y. You may
//     not use new. */
    public static IntList dilsans(IntList x, int y) {
        if (x == null) {
           return x;
        }
        x.rest = dilsans(x.rest, y);
        if (x.first == y) {
            return x.rest;
        }
        return x;
    }

//    d) (12 points). Suppose we want to write tests for and sans and ilsans. Fill in the code below with a
//    JUnit test to see if each method behaves as expected for one example input. Do not write a test for null
//    inputs. Reminder that IntList.of(4, 5, 6) creates an IntList containing the values 4, 5, and 6.
//    Assume the methods on the previous page are all part of a class called Sans, i.e. they are invoked as
//    Sans.sans.


    public static class TestSans {
        @Test
        public void testSans() { // TEST THE ARRAY VERSION OF SANS
            int[] x = ______________________________________________________
            int y = ________________________________________________________
            int[] expected = _______________________________________________
            int[] actual = _________________________________________________
            ________________________________________________________________
                    ________________________________________________________________
        }

        @Test // TEST THE NON-DESTRUCTIVE INTLIST VERSION OF SANS
        public void testIlsans() {
            IntList x = IntList.of(_________________________________________
            int y = ________________________________________________________
            IntList expected = IntList.of(__________________________________
                    IntList actual = _______________________________________________
                    ________________________________________________________________
                    ________________________________________________________________
                    ________________________________________________________________);
        }
    }

    //    For reference, part of the IntList class definition is given below:
    public static class IntList {
        public int first;
        public IntList rest;

        public IntList(int f, IntList r) {
            first = f;
            rest = r;
        }

        public IntList() {
        }

        public static IntList of(Integer... args) { /* works correctly */
            return null;
        }

        public boolean equals(Object x) { /*works correctly with assertEquals*/
            return false;
        }
    }
}