package day14;

//112. Path Sum
//Easy
//Topics
//Companies
//Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
//
//A leaf is a node with no children.
//
// 
//
//Example 1:
//
//
//Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
//Output: true
//Explanation: The root-to-leaf path with the target sum is shown.
//Example 2:
//
//
//Input: root = [1,2,3], targetSum = 5
//Output: false
//Explanation: There two root-to-leaf paths in the tree:
//(1 --> 2): The sum is 3.
//(1 --> 3): The sum is 4.
//There is no root-to-leaf path with sum = 5.
//Example 3:
//
//Input: root = [], targetSum = 0
//Output: false
//Explanation: Since the tree is empty, there are no root-to-leaf paths.
// 
//
//Constraints:
//
//The number of nodes in the tree is in the range [0, 5000].
//-1000 <= Node.val <= 1000
//-1000 <= targetSum <= 1000

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Base case: if the root is null, return false
        if (root == null) {
            return false;
        }

        // Check if the current node is a leaf and if its value equals the remaining target sum
        if (root.left == null && root.right == null && targetSum - root.val == 0) {
            return true;
        }

        // Recursively check the left and right subtrees with the updated target sum
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    public static void main(String[] args) {
        // Example usage:
        // Constructing the binary tree from your example
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        // Check if there is a root-to-leaf path with sum = 3
        Solution solution = new Solution();
        boolean result = solution.hasPathSum(root, 3);

        // Output the result
        System.out.println(result);  // Output: true
    }
}

