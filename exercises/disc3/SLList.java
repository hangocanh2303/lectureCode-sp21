//(a) Fill in blanks in the methods findFirst and findFirstHelper below such that they return the
//index of the first Node with item n, or -1 if there is no such node containing that item.
public class SLList {
    Node sentinel;

    public SLList() {
        this.sentinel = new Node();
    }

    private static class Node {
        int item;
        Node next;
    }

    public int findFirst(int n) {
        return findFirstHelper(n, 0, sentinel.next);
    }

    public int findFirstWithLoop(int n) {
        Node p = sentinel.next;
        int index = 0;
        while (p != null) {
            if (p.item == n) {
                return index;
            }
            p = p.next;
            index += 1;
        }
        return -1;
    }

    private int findFirstHelper(int n, int index, Node curr) {
        if (curr == null) {
            return -1;
        }
        if (n == curr.item) {
            return index;
        } else {
            return findFirstHelper(n, index + 1, curr.next);
        }
    }

}

//(b) Why do we use a helper method here? Why can’t we just have the signature for findFirst
//also have a pointer to the curr node, such that the user of the function passes in the sentinel
//each time?

//

