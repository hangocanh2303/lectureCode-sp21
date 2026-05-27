package spring2018;

//    For reference, part of the IntList class definition is given below:
public class IntList {
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
