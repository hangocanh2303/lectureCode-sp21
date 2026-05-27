package spring2018;

import java.lang.reflect.Array;

public interface Stack<Item> {
    void push(Item x); // places an item on “top” of the stack
    Item pop(); // removes and returns “top” item of the stack
    int size(); // returns the number of items on the stack
    default void purge(Item x) {
        ArrayStack<Item> stack = new ArrayStack<>();
        while (size() > 0) {
           Item item = pop();
           if (!item.equals(x)) {
               stack.push(item);
           }
        }
        while (stack.size() > 0) {
            push(stack.pop());
        }
    }

    default void purgeWithRecursion(Item x) {
        if (size() == 0) {
            return;
        }
        Item top = pop();
        purgeWithRecursion(x);
        if (!top.equals(x)) {
            push(top);
        }
    }
}

