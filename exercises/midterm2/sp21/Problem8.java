package sp21;

public class Problem8 {
    public static class Node {
        public int value;
        public Node left;
        public Node right;
        public Node(int v, Node l, Node r) {
            value = v;
            left = l;
            right = r;
        }
    }

    public static Node splitLeft(Node p) {
        if (p == null) {
            return null;
        }
        Node newNode = new Node(p.value / 2, null, null); // 20
        newNode.left = splitLeft(p.left); // left of 20 splitLeft of 8 ~ 4
        newNode.right = splitRight(p.left);
        return newNode;
    }

    public static Node splitRight(Node p) {
        if (p == null) {
            return null;
        }
        Node newNode = new Node(p.value / 2, null, null); // 20 right
        newNode.left = splitLeft(p.right); //
        newNode.right = splitRight(p.right);
        return newNode;
    }

    public static void split(Node p) {
        if (p == null) {
            return;
        }
        p.value = 0;
        p.left = splitLeft(p);
        p.right = splitRight(p);
    }
}
