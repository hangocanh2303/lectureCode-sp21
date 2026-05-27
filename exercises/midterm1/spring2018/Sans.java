package spring2018;

import spring2018.IntList;


public class Sans {
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
}