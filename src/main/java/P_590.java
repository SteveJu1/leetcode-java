import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P_590 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    private List<Integer> res = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if (root == null) return res;
        for (Node child : root.children) {
            postorder(child);
        }
        res.add(root.val);
        return res;
    }
}
