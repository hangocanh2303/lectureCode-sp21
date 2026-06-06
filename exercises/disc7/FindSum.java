public class FindSum {
    public static boolean findSumFaster(int[] A, int x) {
        int left = 0;
        int right = A.length - 1;
        while (left <= right) {
            if (A[left] + A[right] > x) {
                right -= 1;
            }else if (A[left] + A[right] < x) {
                left += 1;
            }else {
                return true;
            }
        }
        return false;
    }
}
