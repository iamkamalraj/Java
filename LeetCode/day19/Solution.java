package day19;


//102. Binary Tree Level Order Traversal
//
//Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
//
// 
//
//Example 1:
//
//
//Input: root = [3,9,20,null,null,15,7]
//Output: [[3],[9,20],[15,7]]
//Example 2:
//
//Input: root = [1]
//Output: [[1]]
//Example 3:
//
//Input: root = []
//Output: []
// 
//
//Constraints:
//
//The number of nodes in the tree is in the range [0, 2000].
//-1000 <= Node.val <= 1000



//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//}
//


//class Solution {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> levels = new ArrayList<>();
//        if (root == null) {
//            return levels;
//        }
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//
//        while (!queue.isEmpty()) {
//            int levelSize = queue.size();
//            List<Integer> currentLevel = new ArrayList<>();
//
//            for (int i = 0; i < levelSize; i++) {
//                TreeNode node = queue.poll();
//                currentLevel.add(node.val);
//
//                if (node.left != null) {
//                    queue.add(node.left);
//                }
//
//                if (node.right != null) {
//                    queue.add(node.right);
//                }
//            }
//
//            levels.add(currentLevel);
//        }
//
//        return levels;
//    }
//}
//
