package spring2018;

//c) (7 points) The method sumOfLists given below is supposed to take an array of DLListOfInts and
//returns a DLListOfInts that is equal to the element-wise sum of all of the lists. For example if the array
//contains three lists that hold [2, 2, 2], [1, 2, 3], and [3, 3, 3], respectively, the method should return a
//DLListOfInts that contains [6, 7, 8]. The method should be non-destructive.
//public class PartC {
//    /** Non-destructively computes the sum of the given lists. Assumes
//     * that all lists are of the same length and that none are null. */
//    public static DLListOfInts sumOfLists(DLListOfInts[] lists) {
//        ListOfInts result = lists[0];
//        for (int i = 1; i < lists.length; i += 1) {
//            result.plusEquals(lists[i]);
//        }
//        return result;
//    }
//}
//What mistakes (if any) are there in sumOfLists? Note: The fact that the method makes the listed
//assumptions (“all lists are of the same length and none are null”) is not a mistake, it’s an assumption.

public class PartC {
    /** Non-destructively computes the sum of the given lists. Assumes
     * that all lists are of the same length and that none are null. */
    public static DLListOfInts sumOfLists(DLListOfInts[] lists) {
        DLListOfInts result = lists[0];
        for (int i = 1; i < lists.length; i += 1) {
            result.plusEquals(lists[i]);
        }
        return result;
    }
}
