package spring2019;

import java.util.Comparator;

public class IntListMetaComparator implements Comparator<IntList> {
    Comparator<Integer> c;

    public IntListMetaComparator(Comparator<Integer> givenC) {
        c = givenC;
    }

    /* Returns negative number if more items in x are less,
    Returns positive number if more items in x are greater.
    If one list is longer than the other, extra items are ignored.
    */
    public int compare(IntList x, IntList y) {
        if ((x == null) || (y == null)) {
            return 0;
        }
        int compareValue = c.compare(x.first, y.first);

        if (compareValue > 0) {
            return compare(x.rest, y.rest) + 1;
        } else if (compareValue < 0) {
            return compare(x.rest, y.rest) - 1;
        } else {
            return compare(x.rest, y.rest);
        }
    } // Your reference sheet has a definition for IntList
}