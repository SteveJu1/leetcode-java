import structure.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P_429 {
    /*
       创建一个队列  进行广度优先遍历
       循环queue的大小 在循环里出队 把孩子都入队 把值加入一层的返回里
     */
    List<List<Integer>> list = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return list;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);    // 将根节点入队列
        while (!queue.isEmpty()) {
            List<Integer> result = new ArrayList<Integer>();
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                Node node = queue.poll();
                result.add(node.val);
                for (Node children : node.children) {       // 并将它的孩子节点入队列
                    queue.add(children);
                }
            }
            // 当某一层遍历完后。将该层的结果加入到list中去
            list.add(result);
        }
        return list;
    }
}
