import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

// Invariant: all 0s are to the left of curr, all 2s are to the right of back,
// and the elements between front and curr are all 1s.
public class SpecialSort {

    /**
     * Given an array that only contains 0’s, 1’s and 2’s, write an algorithm to sort
     * it in linear time. You may want to use the provided helper method, swap.
     * */
    public static int[] specialSort(int[] arr) {
        int front = 0;
        int back = arr.length - 1;
        int curr = 0;

        while (curr < back) {
            if (arr[curr] == 0) {
                swap(arr, front, curr);
                front += 1;
                curr += 1;
            } else if (arr[curr] == 1) {
                curr += 1;
            } else {
                swap(arr, curr, back);
                back -= 1;
            }
        }

        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Test
    public void testSpecialSort() {
        int[] input = {0, 1, 2, 0, 2, 1};
        int[] expected = {0, 0, 1, 1, 2, 2};
        assertArrayEquals(expected, SpecialSort.specialSort(input));
    }
}