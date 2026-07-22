package fa25;

import fa23.WeightedQuickUnion;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WalkManager {
    // Add any instance variables below (if necessary)
    WeightedQuickUnion wq;
    Map<Country, Integer> map;
    public WalkManager(List<Country> countries) {
        int N = countries.size();
        wq = new WeightedQuickUnion(N);
        map = new HashMap<>();

        for (int i = 0; i < N; i += 1) {
            Country curr = countries.get(i);
            map.put(curr, i);
        }
        for (Country country : countries) {
            for (Country c: country.borders) {
                wq.connect(map.get(country), map.get(c));
            }
        }
    }

    public boolean canWalk(Country a, Country b) {
        return wq.isConnected(map.get(a), map.get(b));
    }
}