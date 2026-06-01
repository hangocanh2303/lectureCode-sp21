package fall2025;

public interface Deque<T> {
    void addFirst(T item);

    void addLast(T item);

    default boolean isEmpty() {
        return size() == 0;
    }

    int size();

    void printDeque();

    T removeFirst();

    T removeLast();

    T get(int index);

    default boolean rotateToFront(T x) {
        for (int i = 0; i < size(); i += 1) {
            if (get(0).equals(x)) {
                return true;
            }
            addLast(removeFirst());
        }
        return false;
    }
}
