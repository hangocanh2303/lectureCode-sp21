import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestSort {
    @Test
    public void testSelectionSort() {
        int[] input = {6, 3, 7, 2, 8, 1};
        int[] expected = {1, 2, 3, 6, 7, 8};
        new SelectionSort().sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testNaiveHeapSort() {
        int[] input = {6, 3, 7, 2, 8, 1};
        int[] expected = {1, 2, 3, 6, 7, 8};
        int[] result = new NaiveHeapsort().sort(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testInplaceHeapSort() {
        int[] input = {6, 3, 7, 2, 8, 1};
        int[] expected = {1, 2, 3, 6, 7, 8};
        new InplaceHeapsort().sort(input);
        assertArrayEquals(expected, input);
    }

}
