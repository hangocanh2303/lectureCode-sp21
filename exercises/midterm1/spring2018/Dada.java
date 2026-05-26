package spring2018;

//1. Static Dada.
//a) (10 points) Consider the class shown below. Next to the lines with blanks, write the result of the print
//statement. No syntax errors or runtime errors occur.
public class Dada {
    private static String[] rs;

    /**
     * Prints out the given array, i.e. if d contains two Strings
     * with names "alice" and "bob", this method will print "alice bob ".
     */
    private static void printStringArray(String[] s) {
        for (int i = 0; i < s.length; i += 1) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }

//    public static void main(String[] args) {
//        String a = "alice";
//        String b = "bob";
//        String c = "carol";
//        String d = "dan";
//        String[][] twod = {{a, b}, {c, d}};
//        String[] X = twod[1];
//        printStringArray(X); // "c d "
//        Dada.rs = X;
//        String[] Y = Dada.rs;
//        Y = new String[]{d, c};
//        Dada.rs[1] = "eve";
//        printStringArray(Dada.rs); // "c eve "
//        printStringArray(Y); // "d c "
//        printStringArray(twod[0]); // "a b "
//        printStringArray(twod[1]); // "c eve "
//    }

//    b) (9 points) Suppose we add new methods to Dada called fillOne and fillMany and replace main
//    as shown below. Fill in the print statements. The Dada class is otherwise unchanged.

    private static void fillMany(String[] d) {
        System.arraycopy(Dada.rs, 0, d, 0, d.length);
    }
    private static void fillOne(String d) { d = Dada.rs[0]; }

    public static void main(String[] args) {
        String a = "alice";
        String b = "bob";
        String c = "carol";
        String d = "dan";
        String[][] twod = {{a, b}, {c, d}};
        Dada.rs = new String[]{"fritz", "gritz"};
        String[] X = twod[0];
        printStringArray(X); // alice bob
        fillOne(X[0]);
        printStringArray(X); // alice bob
        fillMany(X);
        printStringArray(X); // fritz gritz
    }
}