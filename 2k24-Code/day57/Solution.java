package day57;

//543. Diameter of Binary Tree
//
//Given the root of a binary tree, return the length of the diameter of the tree.
//
//The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
//
//The length of a path between two nodes is represented by the number of edges between them.
//
// 
//
//Example 1:
//
//
//Input: root = [1,2,3,4,5]
//Output: 3
//Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
//Example 2:
//
//Input: root = [1,2]
//Output: 1
// 
//
//Constraints:
//
//The number of nodes in the tree is in the range [1, 104].
//-100 <= Node.val <= 100

class Solution {
    public class DiameterData {
        int diameter;
        int height;
        DiameterData(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }

    public DiameterData calculateDiameterAndHeight(TreeNode root) {
        if (root == null) {
            return new DiameterData(0, 0);
        }

        DiameterData leftData = calculateDiameterAndHeight(root.left);
        DiameterData rightData = calculateDiameterAndHeight(root.right);

        int currentDiameter = Math.max(leftData.height + rightData.height, 
                                        Math.max(leftData.diameter, rightData.diameter));
        int currentHeight = Math.max(leftData.height, rightData.height) + 1;

        return new DiameterData(currentDiameter, currentHeight);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        DiameterData data = calculateDiameterAndHeight(root);
        
        return data.diameter;
    }
}
