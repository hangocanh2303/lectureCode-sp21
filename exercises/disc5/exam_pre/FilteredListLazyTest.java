package exam_pre;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class FilteredListLazyTest {
    @Test
    public void testFilteredListLazy() {
        ArrayList<Integer> L = new ArrayList<>();
        L.add(1);
        L.add(2);
        L.add(3);
        L.add(4);
        L.add(5);
        L.add(6);

        Predicate<Integer> filter = new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {
                return x % 2 == 0;
            }
        };

        FilteredListLazy<Integer> filteredListLazy =
                new FilteredListLazy<>(L, filter);

        ArrayList<Integer> actual = new ArrayList<>();

        for (Integer x : filteredListLazy) {
            actual.add(x);
        }

        Integer[] expected = new Integer[]{2, 4, 6};

        assertArrayEquals(expected,
                actual.toArray(new Integer[0]));
    }

    @Test
    public void testFilteredList() {
        ArrayList<Integer> L = new ArrayList<>();
        L.add(1);
        L.add(2);
        L.add(3);
        L.add(4);
        L.add(5);
        L.add(6);

        Predicate<Integer> filter = new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {
                return x % 2 == 0;
            }
        };

        FilteredList<Integer> filteredList =
                new FilteredList<>(L, filter);

        ArrayList<Integer> actual = new ArrayList<>();

        for (Integer x : filteredList) {
            actual.add(x);
        }

        Integer[] expected = new Integer[]{2, 4, 6};

        assertArrayEquals(expected,
                actual.toArray(new Integer[0]));
    }
}
