package leetCode.easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

// Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> pTraversalList = BFS_Traversal(p);
        List<Integer> qTraversalList = BFS_Traversal(q);
        if (Objects.equals(pTraversalList, qTraversalList)) {
            return true;
        }
        return false;
    }

    public List<Integer> BFS_Traversal(TreeNode root) {
        LinkedList<Integer> visitedNodes = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode currentNode = root;
        if (root == null) {
            return visitedNodes;
        }
        queue.add(currentNode);
        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            if (currentNode != null) {
                visitedNodes.add(currentNode.val);
                queue.add(currentNode.right);
                queue.add(currentNode.left);
            } else {
                visitedNodes.add(toInteger(currentNode));
            }
        }
        System.out.println(visitedNodes);
        return visitedNodes;
    }

    public Integer toInteger(TreeNode node) {
        if (node == null) {
            return new Integer(0);
        }
        return new Integer(node.val);
    }
}