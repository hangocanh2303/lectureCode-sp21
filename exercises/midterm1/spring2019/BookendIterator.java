package spring2019;

import java.util.Iterator;
import java.util.NoSuchElementException;
// Solution 1
//public class BookendIterator<T> implements Iterator<T> {
//    private Iterator<T> myIter;
//    private boolean isFirst;
//    private T last;
//
//    public BookendIterator(Iterator<T> input) {
//        myIter = input;
//        isFirst = true;
//    }
//
//    public boolean hasNext() {
//        if (isFirst) {
//            return true;
//        }
//        return myIter.hasNext();
//    }
//
//    public T next() {
//        if (!hasNext()) {
//            throw new NoSuchElementException();
//        }
//        if (isFirst) {
//            isFirst = false;
//            return myIter.next();
//        }
//        while (myIter.hasNext()) {
//            last = myIter.next();
//        }
//
//        return last;
//    }
//}


// Solution 2:

public class BookendIterator<T> implements Iterator<T> {

    private Iterator<T> myIter;
    private T[] arr = (T[]) new Object[2];
    private int index = 0;

    public BookendIterator(Iterator<T> input) {
       myIter = input;
       arr[0] = myIter.next();
       while (myIter.hasNext()) {
           arr[1] = myIter.next();
       }
    }

    public boolean hasNext() {
       return index < 2;
    }

    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        T result = arr[index];
        index += 1;
        return result;
    }
}
