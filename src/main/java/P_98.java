import Structure.TreeNode;

public class P_98 {
    /*
    1.递归
    2.中序遍历是递增的
     */
    long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        // 遍历左子树
        if (!isValidBST(root.left)) {
            return false;
        }

        if (root.val <= pre) {  //当前节点不大于父节点，不是
            return false;
        }
        pre = root.val; //记录父节点

        // 遍历右子树
        return isValidBST(root.right);
    }
}
