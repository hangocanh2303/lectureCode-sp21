public class SpecialSort {
    /**
     * Given an array that only contains 0’s, 1’s and 2’s, write an algorithm to sort
     * it in linear time. You may want to use the provided helper method, swap.
     */
    public static int[] specialSort(int[] arr) {
        int front = 0;
        int back = arr.length - 1;
        int curr = 0;

        //idea: using two pointer 0 in 1/3 first, 2 in 1/3 last and middle is 1

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
