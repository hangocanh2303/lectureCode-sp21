public class InplaceMinHeapsort {

    public void sort(int[] arr) {
        int n = arr.length;
        heapify(arr, n);
        for (int i = n - 1; i > 0; i -= 1) {
            swap(arr, 0, i);
            sink(arr, 0, i);
        }
    }

    private void heapify(int[] arr, int n) {
        for (int i = (n / 2) - 1; i >= 0; i -= 1) {
            sink(arr, i, n);
        }
    }

    private void sink(int[] arr, int index, int n) {
        int smallest = index;
        int leftIndex = 2 * index + 1;
        int rightIndex = 2 * index + 2;

        if (leftIndex < n && arr[smallest] > arr[leftIndex]) {
            smallest = leftIndex;
        }

        if (rightIndex < n && arr[smallest] > arr[rightIndex]) {
            smallest = rightIndex;
        }

        if (smallest != index) {
            swap(arr, smallest, index);
            sink(arr, smallest, n);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Returns the index of the node to the left of the node at i.
     */
    private static int leftIndex(int i) {
        return 2 * i + 1;
    }

    /**
     * Returns the index of the node to the right of the node at i.
     */
    private static int rightIndex(int i) {
        return (2 * i) + 2;
    }

    /**
     * Returns the index of the node that is the parent of the node at i.
     */
    private static int parentIndex(int i) {
        return (i - 1) / 2;
    }

}
