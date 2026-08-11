public class SelectionSort {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i += 1) {
            // find the smallest number
            int minIndex = findSmallestIndex(arr, i);
            // swap it to first
            swap(arr, i, minIndex);
        }

    }

    private void swap(int[] arr, int first, int minIndex) {
        int temp = arr[first];
        arr[first] = arr[minIndex];
        arr[minIndex] = temp;
    }

    private int findSmallestIndex(int[] arr, int start) {
        int min = start;
        for (int i = start; i < arr.length; i += 1) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }
}
