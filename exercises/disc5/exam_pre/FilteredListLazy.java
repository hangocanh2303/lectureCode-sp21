package exam_pre;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class FilteredListLazy<T> implements Iterable<T> {

    private List<T> list;
    private Predicate<T> fil;

    public FilteredListLazy(List<T> L, Predicate<T> filter) {
        list = L;
        fil = filter;
    }

    @Override
    public Iterator<T> iterator() {
        return new FilterIterator();
    }

    private class FilterIterator implements Iterator<T> {
        private int index;


        public FilterIterator() {
            index = 0;
            moveIndex();
        }

        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T result = list.get(index);
            index += 1;
            moveIndex();
            return result;
        }

        private void moveIndex() {
            while (hasNext() && !fil.test(list.get(index))) {
                index += 1;
            }
        }
    }
}

