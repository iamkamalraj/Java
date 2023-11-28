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

//Runtime 2ms
class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, area = 0, minHeight;
        while(i < j){
            minHeight = Math.min(height[i], height[j]);
            area = Math.max(area, minHeight * (j - i));
            while(i < j && height[i] <= minHeight) i++;
            while(i < j && height[j] <= minHeight) j--;
        }
        return area;
    }
}

//Runtime 1ms
class Solution {
    public int maxArea(int[] height) {
       int maxArea=0;
        int x1 = 0, x2 = height.length - 1;
        int h = -1; // the max height recorded so far. We haven't computed anything, so let's guess it's -1.
        // we validate that x2 > x1 that BOTH new height are higher than the previous minimum height calculated. 
        while((height[x1] >= h && height[x2] >= h) && x2>x1) {
            // we find an higher height, let calcute the new min height, and replace the surface area if necessary.
            h = Math.min(height[x1], height[x2]);
            int newArea = (x2-x1) * h;
            if(maxArea < newArea) maxArea = newArea;

            // Now that we have evaluated that a new surface area exist, we need to find a new minimum height by moving x1 and x2 to an height that is higher than the previous one.
            while(height[x1] <= h && x2 > x1) x1++;
            // we move the offset until the next left hand maxValuePossible.
            while(height[x2] <= h && x2 > x1) x2--;
        }
        return maxArea;
    }  
}
