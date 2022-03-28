package template;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    /* 广度优先搜索模板 用队列实现
          1
       2   3
     3  4               1出队列后 2 3 进队列   场景 层序遍历
      1.压入root 到queue
      2.当queue不为空 出队列 压入子节点
      dsf用栈实现，可以用递归实现
     */
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
