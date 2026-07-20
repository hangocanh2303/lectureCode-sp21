package fa23;

import java.util.List;

public class Hole {
    // ...implementation not shown...
// Checks whether this hole intersects with the passed in hole.
    public boolean intersectsWithHole(Hole other) {
        return true;
    }

    // Checks whether this hole intersects with the bottom.
    public boolean intersectsWithBottom() {
        return true;
    }

    // Checks whether this hole intersects with the top.
    public boolean intersectsWithTop() {
        return true;
    }

    public boolean topBottomConnected(List<Hole> holes) {
        WeightedQuickUnion q = new WeightedQuickUnion(holes.size() + 2);
        int bottom = holes.size();
        int top = holes.size() + 1;

        for (int i = 0; i < holes.size(); i += 1) {
            if (holes.get(i).intersectsWithBottom()) {
                q.connect(i, bottom);
            }
            if (holes.get(i).intersectsWithTop()) {
                q.connect(i, top);
            }
        }

        for (int i = 0; i < holes.size(); i += 1) {
            for (int j = i + 1; j < holes.size(); j += 1) {
                if (holes.get(i).intersectsWithHole(holes.get(j))) {
                    q.connect(i, j);
                }
            }
        }
        return q.isConnected(top, bottom);
    }
}

