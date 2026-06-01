public class QuickUnionPathCompressionUF implements DisjointSets {
    private int[] parent;

    public QuickUnionPathCompressionUF(int N) {
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
        int root = item;
        while (parent[root] >= 0) {
            root = parent[root];
        }
        while (item != root) {
            int next = parent[item];
            parent[item] = root;
            item = next;
        }
        return root;
    }

    private int findRecursion(int item) {
        if (parent[item] < 0) {
            return item;
        }
        int rootItem = findRecursion(parent[item]);
        parent[item] = rootItem;
        return rootItem;
    }
}
