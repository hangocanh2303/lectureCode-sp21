package spring2021;

//6. AListBug (110 points).
//The AListMax100 below is a partial implementation of an array list that can store at most 100 items.
//The implementation of the AListMax100 class has a serious bug that happens even when the list still has
//plenty of space left. The bug is not that the AList can run out of space! The bug is also not an offby-one error!
public class AListMax100<Item> {
    private Item[] items;
    private static int size;

    /**
     * Creates an empty list.
     */
    public AListMax100() {
        items = (Item[]) new Object[100];
        size = 0;
    }

    /**
     * Inserts X into the back of the list if there is room.
     */
    public void addLast(Item x) {
        if (size >= 100) {
            return;
        }
        items[size] = x;
        size = size + 1;
    }

    /**
     * Returns the item from the back of the list or null if empty.
     */
    public Item getLast() {
        if (size == 0) {
            return null;
        }
        return items[size - 1];
    }

    /**
     * Returns the number of items in the list.
     */
    public int size() {
        return size;
    }

    // other methods not shown
}
//a) (15 Points) What single line number could we change so that the bug is fixed?
//Line number: 3
//b) (15 Points) Describe how we would change the line of code to fix the bug.
//Description of the bug fix: remove static keyword of size
