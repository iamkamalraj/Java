package day10;

//94. Binary Tree Inorder Traversal
//Easy
//Topics
//Companies
//Given the root of a binary tree, return the inorder traversal of its nodes' values.
//
// 
//
//Example 1:
//
//
//Input: root = [1,null,2,3]
//Output: [1,3,2]
//Example 2:
//
//Input: root = []
//Output: []
//Example 3:
//
//Input: root = [1]
//Output: [1]
// 
//
//Constraints:
//
//The number of nodes in the tree is in the range [0, 100].
//-100 <= Node.val <= 100
// 
//
//Follow up: Recursive solution is trivial, could you do it iteratively?

//https://youtu.be/6wxNc8gCj8E

class Solution {
   private List<Integer> res = new ArrayList<>();
   public List<Integer> inorderTraversal(TreeNode root) {
       traverse(root);
       return res;
   }
   
   private void traverse(TreeNode root) {
       if (root == null) {
           return;
       }
       traverse(root.left);
       res.add(root.val);
       traverse(root.right);
   }
}

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
// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> result = new ArrayList<>();
//         inorder(root, result);
//         return result;
//     }

//     public void inorder(TreeNode root, List<Integer> result) {
//         if (root == null) {
//             return;
//         }

//         inorder(root.left, result);
//         result.add(root.val);
//         inorder(root.right, result);
//     }
// }



