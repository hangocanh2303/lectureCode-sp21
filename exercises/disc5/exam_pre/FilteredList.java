package exam_pre;//1 Filtered List
//We want to make a FilteredList class that selects only certain elements of a List
//during iteration. To do so, we’re going to use the Predicate interface defined below.
//Note that it has a method, test that takes in an argument and returns True if we
//want to keep this argument or False otherwise.
//public interface Predicate<T> {
//boolean test(T x);
//}
//For example, if L is any kind of object that implements List<String> (that is, the
//standard java.util.List), then writing
//FilteredList<String> FL = new FilteredList<>(L, filter);
//gives an iterable containing all items, x, in L for which filter.test(x) is True.
//Here, filter is of type Predicate. Fill in the FilteredList class below.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class FilteredList<T> implements Iterable<T> {

    private List<T> filterList = new ArrayList<>();

    public FilteredList(List<T> L, Predicate<T> filter) {
        for (T item : L) {
            if (filter.test(item)) {
                filterList.add(item);
            }
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new FilterIterator();
    }

    private class FilterIterator implements Iterator<T> {
        private int currIndex = 0;
        @Override
        public boolean hasNext() {
            return currIndex < filterList.size();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T result = filterList.get(currIndex);
            currIndex += 1;
            return result;
        }
    }
}