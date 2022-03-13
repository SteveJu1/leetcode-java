import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P_515 {
    /*
    给定一棵二叉树的根节点 root ，请找出该二叉树中每一层的最大值。
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /*
    层序遍历用BFS 实现是队列
    把层序的每一层返回值改一下
     */
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelCount = queue.size();
            Integer maxValue = Integer.MIN_VALUE;
            for (int i = 0; i < levelCount; i++) {
                TreeNode treeNode = queue.poll();
                maxValue = Math.max(treeNode.val, maxValue);
                if (treeNode.left != null) {
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.add(treeNode.right);
                }
            }
            res.add(maxValue);
        }
        return res;
    }
}
