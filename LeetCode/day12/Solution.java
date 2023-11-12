package day12;

//101. Symmetric Tree

//
//Example 1:
//
//
//Input: root = [1,2,2,3,4,4,3]
//Output: true
//Example 2:
//
//
//Input: root = [1,2,2,null,3,null,3]
//Output: false
// 
//
//Constraints:
//
//The number of nodes in the tree is in the range [1, 1000].
//-100 <= Node.val <= 100
// 
//
//Follow up: Could you solve it both recursively and iteratively?
//
//

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

//Recursive:
//public class Solution {
//
//    public boolean isSymmetric(TreeNode root) {
//        return isMirror(root, root);
//    }
//
//    private boolean isMirror(TreeNode t1, TreeNode t2) {
//        if (t1 == null && t2 == null) {
//            return true;
//        } else if (t1 == null || t2 == null) {
//            return false;
//        } else if (t1.val != t2.val) {
//            return false;
//        }
//
//        return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
//    }
//}

//Iterative:
//public class Solution {
//
//    public boolean isSymmetric(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root.left);
//        queue.add(root.right);
//
//        while (!queue.isEmpty()) {
//            TreeNode t1 = queue.poll();
//            TreeNode t2 = queue.poll();
//
//            if (t1 == null && t2 == null) {
//                continue;
//            } else if (t1 == null || t2 == null || t1.val != t2.val) {
//                return false;
//            }
//
//            queue.add(t1.left);
//            queue.add(t2.right);
//            queue.add(t1.right);
//            queue.add(t2.left);
//        }
//
//        return true;
//    }
//}


//Example usage:
//
//Java
//TreeNode root = new TreeNode(1);
//root.left = new TreeNode(2);
//root.right = new TreeNode(2);
//root.left.left = new TreeNode(3);
//root.right.right = new TreeNode(3);
//
//Solution solution = new Solution();
//boolean isSymmetric = solution.isSymmetric(root);
//
//System.out.println(isSymmetric); // true
