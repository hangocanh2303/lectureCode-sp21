package exampre;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MsdSort {

    public static List<String> msd(List<String> items) {
        return msd(items, 0);
    }

    private static List<String> msd(List<String> items, int index) {
        if (items.size() == 1 || index == items.getFirst().length()) {
            return items;
        }
        List<String> answer = new ArrayList<>();
        int start = 0;
        stableSort(items, index);
        for (int end = 1; end <= items.size(); end += 1) {

            if (end == items.size() || items.get(end).charAt(index) != (items.get(start).charAt(index))) {
                answer.addAll(msd(items.subList(start, end), index += 1));
                start = end;
            }
        }
        return answer;
    }

    /* You don't need to understand the implementation of this method to use it! */
    private static void stableSort(List<String> items, int index) {
        items.sort(Comparator.comparingInt(o -> o.charAt(index)));
    }
}
