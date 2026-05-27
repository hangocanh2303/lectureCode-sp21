package spring2018;

public class DLListOfInts implements ListOfInts {

    public class IntNode {
        public int item;
        public IntNode next, prev;
    }
    public IntNode sentinel;
    public int size;

//    b) (10 points). The DLListOfInts class is an implementation of ListOfInts that stores a doubly
//            linked list of integers, similar to your LinkedListDeque class. For a DLListOfInts, the default
//    plusEquals method will be very slow, since it relies on get and set. Fill in the plusEquals method
//    so that it behaves as in part a, but has a more efficient runtime, i.e. doesn’t rely on get or set. You must
//    use iteration. Assume that each list has a single sentinel node that points at itself when the list is empty,
//    just like in lecture and in the recommended approach for proj1a


    public void plusEquals(DLListOfInts x) {
        if (x == null || x.size() != size()) {
            return;
        }
        IntNode q = x.sentinel.next;
        for (IntNode p = sentinel.next; p != sentinel; p = p.next) {
            p.item = p.item + q.item;
            q = q.next;
        }
    }

    @Override
    public void addLast(int i) {

    }

    @Override
    public int get(int i) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void set(int i, int value) {

    }

}