import java.util.Arrays;

public class ExamPrepare {

    //    Given two one-dimensional arrays LL and UR, fill in the program on the next page
    //    to insert the elements of LL into the lower-left triangle of a square two-dimensional
    //    array S and UR into the upper-right triangle of S, without modifying elements along
    //    the main diagonal of S. You can assume LL and UR both contain at least enough
    //    elements to fill their respective triangles. (Spring 2020 MT1)
    //    For example, consider
    //    int[] LL = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0 };
    //    int[] UR = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    //    int[][] S = {
    //            { 0, 0, 0, 0, 0},
    //            { 0, 0, 0, 0, 0},
    //            { 0, 0, 0, 0, 0},
    //            { 0, 0, 0, 0, 0},
    //            { 0, 0, 0, 0, 0}
    //    };
    //    After calling fillGrid(LL, UR, S), S should contain
    //    {
    //        { 0, 11, 12, 13, 14 },
    //        { 1, 0, 15, 16, 17 },
    //        { 2, 3, 0, 18, 19 },
    //        { 4, 5, 6, 0, 20 },
    //        { 7, 8, 9, 10, 0 }
    //    }
    //(The last two elements of LL are excess and therefore ignored.)

    /**
     * Fill the lower-left triangle of S with elements of LL and the
     * upper-right triangle of S with elements of UR (from left-to
     * right, top-to-bottom in each case). Assumes that S is square and
     * LL and UR have at least sufficient elements.
     */
    public static void fillGrid(int[] LL, int[] UR, int[][] S) {
        int N = S.length;
        int kL, kR;
        kL = kR = 0;
        for (int i = 0; i < N; i += 1) {
            for (int j = 0; j < N; j += 1) {
                if (i < j) {
                    S[i][j] = UR[kR];
                    kR++;
                }
                if (i > j) {
                    S[i][j] = LL[kL];
                    kL++;
                }
            }
        }
    }

    //    2 Even Odd
    //    Implement the method evenOdd by destructively changing the ordering of a given
    //    IntList so that even indexed links precede odd indexed links.
    //    For instance, if lst is defined as IntList.list(0, 3, 1, 4, 2, 5), evenOdd(lst)
    //    would modify lst to be IntList.list(0, 1, 2, 3, 4, 5).
    //    You may not need all the lines.
    //    Hint: Make sure your solution works for lists of odd and even lengths.
    public class IntList {
        public int first;
        public IntList rest;

        public IntList(int f, IntList r) {
            this.first = f;
            this.rest = r;
        }

        public static void evenOdd(IntList lst) {
            if (lst.rest == null) {
                return;
            }
            IntList even = lst;
            IntList odd = lst.rest;
            IntList oddHead = odd;
            while (even.rest != null && odd.rest != null) {
                even.rest = even.rest.rest;
                odd.rest = odd.rest.rest;
                even = even.rest;
                odd = odd.rest;
            }
            even.rest = oddHead;
        }
    }

    public static void main(String[] args) {
        int[] LL = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0};
        int[] UR = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[][] S = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };

        fillGrid(LL, UR, S);
        System.out.println(Arrays.deepToString(S));
    }
}
