package day13;

// 104. Maximum Depth of Binary Tree

// Given the root of a binary tree, return its maximum depth.

// A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

 

// Example 1:


// Input: root = [3,9,20,null,null,15,7]
// Output: 3
// Example 2:

// Input: root = [1,null,2]
// Output: 2
 

// Constraints:

// The number of nodes in the tree is in the range [0, 104].
// -100 <= Node.val <= 100

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

public class Solution {
   public int maxDepth(TreeNode root) {
       if (root == null) {
           return 0;
       }

       int leftDepth = maxDepth(root.left);
       int rightDepth = maxDepth(root.right);

       return Math.max(leftDepth, rightDepth) + 1;
   }
}


// This solution works by recursively calculating the maximum depth of the left and right subtrees of a node, and then adding 1 for the current node. The base case is when the root node is null, in which case the maximum depth is 0.

// Here is an example of how to use the solution:

// Java
// TreeNode root = new TreeNode(3);
// root.left = new TreeNode(9);
// root.right = new TreeNode(20);
// root.right.left = new TreeNode(15);
// root.right.right = new TreeNode(7);

// Solution solution = new Solution();
// int maxDepth = solution.maxDepth(root);

// System.out.println(maxDepth); // 4
// Use code with caution. Learn more
// Output:

// 4
