public class QuickFindDS implements DisjointSets{

    private int[] id;

    public QuickFindDS(int N) {
        id = new int[N];
        for (int i = 0; i < N; i += 1) {
            id[i] = i;
        }
    }

    @Override
    public void connect(int p, int q) {
        int groupP = id[p];
        int groupQ = id[q];
        for (int i = 0; i < id.length; i += 1) {
            if (id[i] == groupQ) {
                id[i] = groupP;
            }
        }
    }

    @Override
    public boolean isConnected(int p, int q) {
        return id[p] == id[q];
    }
}
