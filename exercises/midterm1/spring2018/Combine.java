package spring2018;

//6. Combine. The Combine.combine method takes a ComFunc and an integer array x and uses the
//ComFunc to “combine” all the items in x. For example, if we have an implementation of ComFunc called
//Add that adds two integers, and we call combine using the Add class on the array {1, 2, 3, 4}, the result
//will be 10, since 1 + 2 + 3 + 4 is 10.
//a) (16 points). Fill in the combine method below. If the array is of length 0, the result should be 0, and if
//the array is of length 1, the result should be the number in the array. For full credit use recursion. For 75%
//credit, you may use iteration. You may create a private helper function in the space provided.
//public interface ComFunc {
//    int apply(int a, int b); // apply(a, b) must equal apply(b, a)
//}
public class Combine {
    public static int combine(ComFunc f, int[] x) {
        if (x.length == 0) {
            return 0;
        }
        if (x.length == 1){
            return x[0];
        }
        int start = f.apply(x[0], x[1]);
        return combine(f, x, start, 2);
    }
    // your private helper function cannot create new arrays (too slow)
    private static int combine(ComFunc f, int[] x,  int comb, int index) {
        if (index == x.length) {
            return comb;
        }
        int twoCombine = f.apply(x[index], comb);
        return combine(f, x, twoCombine , index + 1);
    }

//b) (4 points). Suppose we have a method that adds two numbers, as shown below.
//public class Add implements ComFunc {
//    public int apply(int a, int b) {
//        return a + b;
//    }
//}
//Fill in the method below so that it prints out the correct result. You may use your answer from part a. Even
//if you left part a blank or think it be incorrect, you can assume that everything works as expected.
    public static int sumAll(int[] x) { // sumAll is not a member of Combine
        return Combine.combine(new Add(), x);
    }


}

//public class Combine {
//    public static int combine(ComFunc f, int[] x) {
//        if (x.length == 0) {
//            return 0;
//        }
//        if (x.length == 1){
//            return x[0];
//        }
//        int start = f.apply(x[0], x[1]);
//        return combine(f, x, start, 2);
//    }
//    // your private helper function cannot create new arrays (too slow)
//    private static int combine(ComFunc f, int[] x,  int comb, int index) {
//        if (index == x.length) {
//            return comb;
//        }
//        int twoCombine = f.apply(x[index], comb);
//        return combine(f, x, twoCombine , index + 1);
//    }
//}


//b) (4 points). Suppose we have a method that adds two numbers, as shown below.
//public class Add implements ComFunc {
//    public int apply(int a, int b) {
//        return a + b;
//    }
//}
//Fill in the method below so that it prints out the correct result. You may use your answer from part a. Even
//if you left part a blank or think it be incorrect, you can assume that everything works as expected.
//public static int sumAll(int[] x) { // sumAll is not a member of Combine
//    return ___________________________________________________
//}
//
