Suppose we want to implement an iterator for `WeightedQuickUnionDS` objects. This iterator will iterate
over all items in a given set in numerically increasing order.

For example, if we run:

```java
WeightedQuickUnionDS df = new WeightedQuickUnionDS(6); // creates WQUDS of size 6
df.connect(3, 2);
df.connect(1, 5);
df.connect(2, 5);

Iterator<Integer> connectedToThree = df.setIterator(3);

while (connectedToThree.hasNext()) {
    System.out.print(connectedToThree.next() + " ");
}
```

Then this code will print out:

```text
1 2 3 5
```

Fill in the code below.

Recall that a `DisjointSets` object stores items numbered `0` to `N-1` (inclusive). For example, if we instantiate `new WeightedQuickUnionDS(6)`, the valid item numbers for this object are `0`, `1`, `2`, `3`, `4`, and `5`.

The `setIterator` method should take **O(N log N)** time.

Note that you **may not** create helper functions or new classes. You may import any data structures you'd like (though this is not necessary), and you are not required to use the import that we provide.

```java
import java.util.ArrayList;
import java.util.Iterator;

public class WeightedQuickUnionDS implements DisjointSets {
    ... // Instance variables not listed because you are not allowed to access them

    private int find(int p) { ... }

    public boolean isConnected(int p, int q) { ... }

    public void connect(int p, int q) { ... }

    public int size() { ... } // returns the number of items in the disjoint set

    /** returns an Iterator over the set containing p. */
    public Iterator<Integer> setIterator(int p) {
        __________________________________________________________
        __________________________________________________________
        __________________________________________________________
        __________________________________________________________
        __________________________________________________________
        __________________________________________________________
        __________________________________________________________
        __________________________________________________________
        __________________________________________________________
    }

    // YOU MAY NOT CREATE HELPER FUNCTIONS OR
    // NEW CLASSES.
}
```
```
    /** problem 6 sp21 midterm2 */
    public Iterator<Integer> setIterator(int p) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for  (int i = 0; i < size(); i += 1) {
            if (isConnected(p, i)) {
                list.add(i);
            }
        }
        return list.iterator();
    }
```