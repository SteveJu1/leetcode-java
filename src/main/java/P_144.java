import Structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P_144 {
    // 前序遍历
    private ArrayList res = new ArrayList();

    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return res;
    }

    private void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    // 前序遍历非递归用栈实现
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return res;
    }
}
