public class InsertionSort {

    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i += 1) {
            int current = arr[i]; //
            int j = i;

            while (j > 0 && arr[j - 1] > current) {
                arr[j] = arr[j - 1];
                j -= 1;
            }
            arr[j] = current;
        }
    }
}
