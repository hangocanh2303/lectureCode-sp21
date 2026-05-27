package spring2018;

//5. A Needle in ArrayStack. The Stack interface is given below. A Stack is basically like the proj1 Deque,
//where push is like “addLast”, and pop is like “removeLast”. For example, if we call push(5),
//push(10), push(15), then call pop(), we’d get 15. If we call pop() again, we get 10.
//public interface Stack<Item> {
//    void push(Item x); // places an item on “top” of the stack
//    Item pop(); // removes and returns “top” item of the stack
//    int size(); // returns the number of items on the stack
//}
//a) (14 points). Fill in the ArrayStack implementation below. To ensure efficient memory usage, double
//the array size when full, halve the array size when < 1/4 full, and avoid storing unnecessary references.
//The if conditions for resizing during push and pop are provided for you in the skeleton code.
public class ArrayStack<Item> implements Stack<Item> {
    private Item[] items;
    private int size;
    public ArrayStack() { // initial array size is 8
        items = (Item[]) new Object[8];
        size = 0;
    }
    private void resize(int capacity) { // resizes array to given capacity
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }
    public void push(Item x) {
        if (usageRatio() == 1) { resize(size * 2); }
        items[size] = x;
        size += 1;
    }
    public Item pop() { // returns null if stack is empty
        if (size == 0) { return null; }
        if (usageRatio() < 0.25 && items.length > 8) { resize(items.length / 2); }
        size -= 1;
        Item result = items[size];
        items[size] = null;
        return result;
    }
    public int size() { return size; }
    private double usageRatio() { return ((double) size()) / items.length; }
}