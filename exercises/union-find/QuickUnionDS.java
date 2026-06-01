public class QuickUnionDS implements DisjointSets{

    private int[] parent;

    public QuickUnionDS(int N) {
        parent = new int[N];
        for (int i = 0; i < N; i += 1) {
            parent[i] = -1;
        }
    }

    @Override
    public void connect(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        parent[rootQ] = rootP;
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
}
