package day53;

//62. Unique Paths
//Solved
//Medium
//Topics
//Companies
//There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
//
//Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.
//
//The test cases are generated so that the answer will be less than or equal to 2 * 109.
//
// 
//
//Example 1:
//
//
//Input: m = 3, n = 7
//Output: 28
//Example 2:
//
//Input: m = 3, n = 2
//Output: 3
//Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
//1. Right -> Down -> Down
//2. Down -> Down -> Right
//3. Down -> Right -> Down

public class Solution {
    public int uniquePaths(int m, int n) {
        long ans = 1;
        for (int i = 1; i <= m - 1; i++) {
            ans = ans * (n - 1 + i) / i;
        }
        return (int)ans;
    }
}

//✅ 98.83% Easy DP & Math
//
//vanAmsen
//Sep LeetCoding Challenge
//9234
//15978
//Sep 03, 2023
//C++
//Java
//Python3
//C#
//6+
//Interview Guide - Unique Paths in a Grid
//Problem Understanding
//The problem describes a robot situated on a m×nm \times nm×n grid, starting at the top-left corner (i.e., grid[0][0]\text{grid}[0][0]grid[0][0]). The robot can move either to the right or downwards at any given time, and the objective is to reach the bottom-right corner of the grid. The challenge is to find the number of unique paths the robot can take to reach this goal.
//
//Key Points to Consider
//Grid Dimensions:
//The grid dimensions are mmm (rows) and nnn (columns), with 1≤m,n≤1001 \leq m, n \leq 1001≤m,n≤100.
//
//Movement Constraints:
//The robot can only move either down or to the right at any given point. It cannot move diagonally or backwards.
//
//Dynamic Programming and Combinatorial Mathematics:
//The problem can be solved using either a Dynamic Programming approach or using Combinatorial Mathematics.
//
//Live Coding & More - 3 Solutions
//
//
//Solution #1: Dynamic Programming
//Intuition and Logic Behind the Solution
//The idea behind this approach is to use a 2D Dynamic Programming (DP) array to store the number of unique paths to each cell. A cell (i,j)(i, j)(i,j) can be reached either from (i−1,j)(i-1, j)(i−1,j) or (i,j−1)(i, j-1)(i,j−1), and thus the number of unique paths to (i,j)(i, j)(i,j) is the sum of the number of unique paths to these two cells.
//
//Step-by-step Explanation
//Initialization:
//
//Create a m×nm \times nm×n DP array, initializing the first row and first column to 1 because there's only one way to reach those cells from the starting point.
//Main Algorithm:
//
//Iterate over the DP array starting from cell (1,1)(1, 1)(1,1).
//For each cell (i,j)(i, j)(i,j), set dp[i][j]=dp[i−1][j]+dp[i][j−1]\text{dp}[i][j] = \text{dp}[i-1][j] + \text{dp}[i][j-1]dp[i][j]=dp[i−1][j]+dp[i][j−1].
//Complexity Analysis
//Time Complexity: O(m×n)O(m \times n)O(m×n) — We iterate through each cell once.
//Space Complexity: O(m×n)O(m \times n)O(m×n) — For the DP array.
//Solution #2: Memory-Optimized Dynamic Programming
//Intuition and Logic Behind the Solution
//The original DP solution used a m×nm \times nm×n array to store the number of unique paths to each cell. However, since we only need information from the previous row and the current row to compute the number of unique paths for a given cell, we can optimize the solution to use only two rows at a time. This reduces the space complexity from O(m×n)O(m \times n)O(m×n) to O(n)O(n)O(n).
//
//Transitioning from O(m×n)O(m \times n)O(m×n) to O(n)O(n)O(n)
//In the original O(m×n)O(m \times n)O(m×n) approach, we used a 2D array dp where dp[i][j]\text{dp}[i][j]dp[i][j] represented the number of unique paths to reach cell (i,j)(i, j)(i,j). To optimize this to O(n)O(n)O(n), we can maintain only two 1D arrays: prev_row and curr_row, each of length nnn.
//
//prev_row[j] will represent dp[i−1][j]\text{dp}[i-1][j]dp[i−1][j], the number of unique paths to reach the cell in the previous row and jjj-th column.
//curr_row[j] will represent dp[i][j]\text{dp}[i][j]dp[i][j], the number of unique paths to reach the cell in the current row and jjj-th column.
//Step-by-step Explanation
//Initialization:
//
//Initialize two 1D arrays curr_row and prev_row with nnn elements, setting all elements to 1.
//Main Algorithm:
//
//Iterate over the rows starting from 1 (the second row).
//For each cell (i,j)(i, j)(i,j), set curr_row[j] = curr_row[j-1] + prev_row[j] .
//Swap curr_row and prev_row for the next iteration.
//Complexity Analysis
//Time Complexity: O(m×n)O(m \times n)O(m×n) — We still iterate through each cell once.
//Space Complexity: O(n)O(n)O(n) — For the two 1D arrays.
//Solution #3: Combinatorial Mathematics
//Intuition
//The number of unique paths can be seen as the number of ways to choose m−1m-1m−1 downs and n−1n-1n−1 rights, regardless of the order. In combinatorial terms, this is equivalent to (m+n−2m−1)\binom{m+n-2}{m-1}( 
//m−1
//m+n−2
//​
// ).
//
//Algorithm
//Use the Combinatorial Formula:
//(m+n−2m−1)\binom{m+n-2}{m-1}( 
//m−1
//m+n−2
//​
// ) or (m+n−2n−1)\binom{m+n-2}{n-1}( 
//n−1
//m+n−2
//​
// ) to calculate the number of unique paths.
//
//Python's Math Library:
//Python provides a built-in function math.comb(n, k)\text{math.comb(n, k)}math.comb(n, k) to calculate (nk)\binom{n}{k}( 
//k
//n
//​
// ) efficiently.
//
//Complexity Analysis
//Time Complexity: O(m)O(m)O(m) or O(n)O(n)O(n) — For calculating the combination.
//Space Complexity: O(1)O(1)O(1) — Constant space.
//Performance
//Dynamic Programming
//Language	Time (ms)	Memory (MB)
//Rust	0 ms	2.2 MB
//C++	0 ms	6.5 MB
//Java	0 ms	39.9 MB
//Go	1 ms	2.1 MB
//PHP	10 ms	19.3 MB
//C#	23 ms	26.6 MB
//Python3 (1D)	26 ms	16.3 MB
//Python3 (2D)	28 ms	16.3 MB
//JavaScript	52 ms	41.6 MB
//dp.png
//
//Combinatorial Mathematics
//Language	Time (ms)	Memory (MB)
//Rust	0 ms	2.2 MB
//C++	0 ms	5.9 MB
//PHP	0 ms	18.9 MB
//Java	0 ms	39.8 MB
//Go	1 ms	1.9 MB
//C#	22 ms	26.5 MB
//Python3	27 ms	16.4 MB
//JavaScript	55 ms	41.3 MB