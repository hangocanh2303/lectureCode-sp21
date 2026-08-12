public class MergeSort {


    public void sort(int[] arr) {
        int[] tmp = new int[arr.length];
        sort(arr, tmp, 0, arr.length - 1);
    }

    private void sort(int[] arr, int[] tmp, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            sort(arr, tmp, left, mid);
            sort(arr, tmp , mid + 1, right);
            merge(arr, tmp, left, mid, right);
        }
    }

    private void merge(int[] arr, int[] tmp, int left, int mid, int right) {
        for (int k = left; k <= right; k += 1) {
            tmp[k] = arr[k];
        }
        int i = left;
        int j = mid + 1;

        for (int k = left; k <= right; k += 1) {
            if (i > mid) {
                arr[k] = tmp[j];
                j += 1;
            } else if(j > right) {
                arr[k] = tmp[i];
                i += 1;
            } else if (tmp[i] <= tmp[j]) {
                arr[k] = tmp[i];
                i += 1;
            } else {
                arr[k] = tmp[j];
                j += 1;
            }
        }
    }
}
