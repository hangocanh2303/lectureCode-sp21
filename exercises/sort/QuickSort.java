public class QuickSort {
    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int lo, int hi) {
       if (lo >= hi) {
           return;
       }
       int p = partition(arr, lo, hi);
       sort(arr, lo, p);
       sort(arr, p + 1, hi);
    }

    private int partition(int[] arr, int lo, int hi) {
        int pivot = arr[lo];
        int i = lo + 1;
        int j = hi;
        while (true) {
            while (i < hi && arr[i] < pivot) {
                i = i + 1;
            }
            while (j > lo && arr[j] > pivot) {
                j = j - 1;
            }

            if (i >= j) {
                break;
            }

            swap(arr, i, j);

            i += 1;
            j -= 1;
        }

        swap(arr, lo, j);

        return j;
    }

    private void swap(int[] arr, int i, int j) {
       int tmp = arr[i];
       arr[i] = arr[j];
       arr[j] = tmp;
    }
}
