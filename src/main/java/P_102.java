import Structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList(); //返回的结果
        if (null == root) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> result = new ArrayList<Integer>();  //记录一层的结果
            int levelCount = queue.size(); // 每一层的数量
            for (int i = 0; i < levelCount; i++) {  //把每一层的节点添加到List中去
                TreeNode node = queue.poll();
                result.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(result);
        }
        return res;
    }
}
