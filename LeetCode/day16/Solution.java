package day16;

//100. Same Tree
//Solved
//Easy
//Topics
//Companies
//Given the roots of two binary trees p and q, write a function to check if they are the same or not.
//
//Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
//
// 
//
//Example 1:
//
//
//Input: p = [1,2,3], q = [1,2,3]
//Output: true
//Example 2:
//
//
//Input: p = [1,2], q = [1,null,2]
//Output: false
//Example 3:
//
//
//Input: p = [1,2,1], q = [1,1,2]
//Output: false
// 
//
//Constraints:
//
//The number of nodes in both trees is in the range [0, 100].
//-104 <= Node.val <= 104
//Seen this question in a real interview before?
//1/4





//public class TreeNode {
// int val;
// TreeNode left;
// TreeNode right;
// TreeNode(int x) { val = x; }
//}
//
//class Solution {
// public boolean isSameTree(TreeNode p, TreeNode q) {
//     // Both trees are null
//     if (p == null && q == null) return true;
//     // One of p and q is null
//     if (q == null || p == null) return false;
//     if (p.val != q.val) return false;
//     return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
// }
//}


//This code defines a TreeNode class for the binary tree nodes, and a Solution class 
//with a isSameTree method that checks if two binary trees are the same. The isSameTree
//method uses recursion to traverse the trees and compare the nodes. If both trees are null,
//it returns true. If one of the trees is null, it returns false. If the values of the nodes
//are not equal, it returns false. Otherwise, it recursively checks the left and right subtrees.
//If both subtrees are the same, it returns true. Otherwise, it returns false. This solution assumes
//that the trees are binary and the nodes contain integer values. The time complexity of this solution
//is O(n), where n is the number of nodes in the tree, because it visits each node once. The space
//complexity is O(h), where h is the height of the tree, because in the worst case (when the tree
//		is completely unbalanced), the number of recursive calls adds up to the height of the tree.
//This space is required for the function call stack. The average case (when the tree is balanced)
//space complexity is O(log n).
