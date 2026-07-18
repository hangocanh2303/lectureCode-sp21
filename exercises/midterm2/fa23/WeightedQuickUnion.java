package fa23;

import java.util.ArrayList;
import java.util.Iterator;

public class WeightedQuickUnion implements DisjointSets {

    private int[] parent;

    public WeightedQuickUnion(int N) {
        parent = new int[N];
        for (int i = 0; i < N; i += 1) {
            parent[i] = -1;
        }
    }

    @Override
    public void connect(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) {
            return;
        }
        int sizeP = -parent[rootP];
        int sizeQ = -parent[rootQ];
        if (sizeP < sizeQ) {
            parent[rootQ] += parent[rootP];
            parent[rootP] = rootQ;
        } else {
            parent[rootP] += parent[rootQ];
            parent[rootQ] = rootP;
        }
    }

    @Override
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    /** find the root of an item */
    private int find(int item) {
        while (parent[item] >= 0) {
            item = parent[item];
        }
        return item;
    }

    public int size() {
        return parent.length;
    }

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
}
