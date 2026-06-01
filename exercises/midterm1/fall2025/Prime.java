package fall2025;

import java.util.ArrayList;
import java.util.List;

public class Prime {
    public static int smallestPrimeFactor(int x) {
        int smallest = 2;
        while (true) {
            if (x % smallest == 0) {
                return smallest;
            }
            smallest += 1;
        }
    }

    public static void addAllPrimeFactors(int x, List<Integer> factors) {
        if (x == 1) {
            return;
        }
        int smallest = smallestPrimeFactor(x);
        factors.add(smallest);
        addAllPrimeFactors(x / smallest, factors);
    }

    public static List<Integer> primeFactors(int x) {
        List<Integer> factors = new ArrayList<>();
        addAllPrimeFactors(x, factors);
        return factors;
    }
}
