import java.util.Collections;
import java.util.PriorityQueue;

public class NaiveHeapsort {
    public int[] sort(int[] arr) {
        PriorityQueue<Integer> pQueue
                = new PriorityQueue<Integer>(
                Collections.reverseOrder());
        int[] result = new int[arr.length];
        for (int j : arr) {
            pQueue.add(j);
        }
        for (int i = arr.length; i > 0; i -= 1) {
            int max = pQueue.remove();
            result[i - 1] = max;
        }
        return result;
    }
}
