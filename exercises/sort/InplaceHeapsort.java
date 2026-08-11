public class InplaceHeapsort {

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
        int largest = index;
        int leftIndex = leftIndex(index);
        int rightIndex = rightIndex(index);

        if (leftIndex < n && arr[largest] < arr[leftIndex]) {
            largest = leftIndex;
        }

        if (rightIndex < n && arr[largest] < arr[rightIndex]) {
            largest = rightIndex;
        }

        if (largest != index) {
            swap(arr, largest, index);
            sink(arr, largest, n);
        }
    }

    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
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
