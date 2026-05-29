package spring2021;

public class BLList<T> implements MT1List<T> {
    private class Node {
        private T item;
        private Node prev;

        public Node(T i, Node p) {
            item = i;
            prev = p;
        }
    }

    private Node sentinel;
    private int size;

    public BLList() {
        sentinel = new Node(null, null);
        size = 0;
    }

    @Override
    public void addLast(T item) {
//        Node currLast = sentinel.prev;
//        Node newLast = new Node(item, currLast);
//        sentinel.prev = newLast;
        sentinel.prev = new Node(item, sentinel.prev);
        size += 1;
    }

    @Override
    public T get(int i) {
        return null;
    }

    private Node getNodeIter(int i) {
        int backIndex = size() - i;
        Node p = sentinel;
        while (backIndex > 0) {
            p = p.prev;
            backIndex -= 1;
        }
        return p;
    }

    private Node getNode(int i) {
        return getNode(size() - i, sentinel);
    }

    private Node getNode(int i, Node p) {
        if (i == 0) {
            return p;
        }
        return getNode(i - 1, p.prev);
    }

//    private Node getNode(int i) {
//        if (i == size) {
//            return sentinel;
//        }
//        return getNode(i, sentinel.prev);
//    }
//
//    private Node getNode(int i, Node p) {
//        int backIndex = Math.abs(i - size + 1);
//        if (backIndex == 0) {
//            return p;
//        }
//        return getNode(i - 1, p.prev);
//    }

    @Override
    public void remove(int i) {
        if (i < 0 || i > size() - 1) {
            return;
        }
        Node nextNode = getNode(i + 1);
        nextNode.prev = nextNode.prev.prev;
        size -= 1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public MT1List<T> createList() {
        return null;
    }
}