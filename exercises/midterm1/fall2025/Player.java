package fall2025;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {
    public double score;

    public static Map<Player, Integer> rankedAbove(List<Player> players) {
        Map<Player, Integer> results = new HashMap<>();
        for (Player p1: players) {
            results.put(p1, 1);
            for (Player p2: players) {
                if (p2.score > p1.score) {
                    results.put(p1, results.get(p1) + 1);
                }
            }
        }
        return results;
    }
}
