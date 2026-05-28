package spring2019;

public class IntXList {
    private IntSLList[] items;
    private int size;

    public IntXList() {
        items = new IntSLList[1];
        items[0] = new IntSLList();
    }

// b) (35 points) Fill in the resize method in the IntXList class. You may not need both loops or all lines.
// after calling resize, IntSLList[] items will be of length numSLLists
    private void resize(int numSLLists) {
        IntSLList[] temp = new IntSLList[numSLLists];
        for (int i = 0; i < items.length; i += 1) {
           temp[i] = items[i];
        }
        for (int j = items.length; j < numSLLists; j += 1) {
            temp[j] = new IntSLList();
        }
        items = temp;
    }

    public void addLast(int x) {
        if (size == items.length * 4) {
            resize(items.length * 2);
        }
        items[size / 4].addLast(x);
        size += 1;
    }
}