package exam_pre;

//2 Iterator of Iterators
//Implement an IteratorOfIterators which will accept as an argument a List of
//Iterator objects containing Integers. The first call to next() should return the
//first item from the first iterator in the list. The second call to next() should return
//the first item from the second iterator in the list. If the list contained n iterators,
//the n+1th time that we call next(), we would return the second item of the first
//iterator in the list.
//Note that if an iterator is empty in this process, we continue to the next iterator.
//Then, once all the iterators are empty, hasNext should return false. For example,
//if we had 3 Iterators A, B, and C such that A contained the values [1, 3,
//4, 5], B was empty, and C contained the values [2], calls to next() for our
//IteratorOfIterators would return [1, 2, 3, 4, 5].

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * invariants:
 *
 *
 */
public class IteratorOfIterators implements Iterator<Integer> {

    private LinkedList<Iterator<Integer>> iterators = new LinkedList<>();

    public IteratorOfIterators(List<Iterator<Integer>> a) {
        for(Iterator<Integer> item: a) {
            if (item.hasNext()) {
                iterators.add(item);
            }
        }
    }
    @Override
    public boolean hasNext() {
        return !iterators.isEmpty();
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Iterator<Integer> first = iterators.removeFirst();
        int result = first.next();
        if (first.hasNext()) {
            iterators.addLast(first);
        }
        return result;
    }


//    private List<Iterator<Integer>> iterators;
//    private int index;
//    private int size;
//
//    public IteratorOfIterators(List<Iterator<Integer>> a) {
//        iterators = a;
//        index = 0;
//        size = iterators.size();
//    }
//
//    @Override
//    public boolean hasNext() {
//        // solution 1
//        for (Iterator<Integer> i: iterators) {
//            if (i.hasNext()) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public Integer next() {
//        if (!hasNext()) {
//            throw new NoSuchElementException();
//        }
//        int currIterator = index % size;
//        index += 1;
//        moveIndex();
//        return iterators.get(currIterator).next();
//    }
//
//    private void moveIndex() {
//
//        while (hasNext() && !iterators.get(index % size).hasNext()) {
//            index += 1;
//        }
//    }
}