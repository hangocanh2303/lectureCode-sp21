package spring2021;

public interface MT1List<T> {
    public void addLast(T item);

    public T get(int i);

    public void remove(int i);

    public int size();

    public MT1List<T> createList();

    default public MT1List<T> getEvens() {
        MT1List<T> b = createList();
        for (int i = 0; i < size(); i += 1) {
            if (i % 2 == 0) {
                b.addLast(get(i));
            }
        }
        return b;
    }

    default public MT1List<T> remove(int start, int end) {
        MT1List<T> result = createList();
        for (int i = start; i <= end; i += 1) {
            result.addLast(get(start));
            remove(start);
        }
        return result;
    }

    default public void reverse() {
        if (size() > 0) {
            T firstItem = get(0);
            remove(0);
            reverse();
            addLast(firstItem);
        }
    }

    default public void reverseOther() {
        int backIndex = size() - 2;
        for (int i = backIndex; i >= 0; i -= 1) {
            T item = get(i);
            remove(i);
            addLast(item);
        }
    }
}
