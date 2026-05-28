package spring2021;

//1. Cal Central.
//a) (30 points). Let's start with a short helper method that will be useful in later questions. Fill in public
//static boolean contains(int[] a, int x) so it returns true if and only if the integer array a contains the
//integer x. Your solution may use at most 9 lines. (Clarification: you can assume a will never be null.)
public class Utils {
    public static boolean contains(int[] a, int x) {
        for (int i = 0; i < a.length; i += 1) {
            if (a[i] == x) {
                return true;
            }
        }
        return false;
    }
}
