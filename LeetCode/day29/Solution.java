package day29;

//11. Container With Most Water

//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//
//Return the maximum amount of water a container can store.
//
//Notice that you may not slant the container.
//
// 
//
//Example 1:
//
//
//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
//Example 2:
//
//Input: height = [1,1]
//Output: 1
// 
//
//Constraints:
//
//n == height.length
//2 <= n <= 105
//0 <= height[i] <= 104

//Runtime 5ms
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left < right){
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * w;
            max = Math.max(max, area);
            if(height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--;
            else {
                left++;
                right--;
            }
        }
        return max;
    }
}

//Runtime 4ms
class Solution {
    public int maxArea(int[] height) {
        // max y of two points
        // max x diff of two points

        int i = 0;
        int j = height.length - 1;

        int maxArea = -1;
        
        while (i < j) {
            int leftBar = height[i];
            int rightBar = height[j];

            int area = Math.min(leftBar, rightBar) * (j - i);
            maxArea = Math.max(area, maxArea);

            if (leftBar > rightBar) {
                j--;
            } else {
                i++;
            }
        }
        return maxArea;
    }
}

//Runtime 3ms
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;

        while (leftPointer <= rightPointer) {
            int temp = 0;
            if (height[leftPointer] < height[rightPointer]) {
                temp = height[leftPointer] * (rightPointer - leftPointer);
                leftPointer++;
            } else {
                temp = height[rightPointer] * (rightPointer - leftPointer);
                rightPointer--;
            }
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
