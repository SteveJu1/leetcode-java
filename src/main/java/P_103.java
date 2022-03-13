import java.util.*;

public class P_103 {
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
    层序遍历
    使用dfs，对应层判断一下奇偶，决定在表头还是表尾添加元素就可以了
     */
    List<List<Integer>> res = new ArrayList<>(); //返回值放在外面 不用作为dfs的参数传来传去

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>(); //返回的结果
        if (null == root) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        boolean isOrderLeft = true;
        while (!queue.isEmpty()) {
            Deque<Integer> result = new LinkedList<>();  //记录一层的结果
            int levelCount = queue.size(); // 每一层的数量
            for (int i = 0; i < levelCount; i++) {  //把每一层的节点添加到List中去
                TreeNode node = queue.poll();
                if (isOrderLeft) {
                    result.addLast(node.val);
                } else {
                    result.addFirst(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            res.add(new LinkedList<>(result));
            isOrderLeft = !isOrderLeft;
        }
        return res;

    }
}
