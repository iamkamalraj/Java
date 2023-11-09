package day9;

//746. Min Cost Climbing Stairs
//Easy
//Topics
//Companies
//Hint
//You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
//
//You can either start from the step with index 0, or the step with index 1.
//
//Return the minimum cost to reach the top of the floor.
//
// 
//
//Example 1:
//
//Input: cost = [10,15,20]
//Output: 15
//Explanation: You will start at index 1.
//- Pay 15 and climb two steps to reach the top.
//The total cost is 15.
//Example 2:
//
//Input: cost = [1,100,1,1,1,100,1,1,100,1]
//Output: 6
//Explanation: You will start at index 0.
//- Pay 1 and climb two steps to reach index 2.
//- Pay 1 and climb two steps to reach index 4.
//- Pay 1 and climb two steps to reach index 6.
//- Pay 1 and climb one step to reach index 7.
//- Pay 1 and climb two steps to reach index 9.
//- Pay 1 and climb one step to reach the top.
//The total cost is 6.
// 
//
//Constraints:
//
//2 <= cost.length <= 1000
//0 <= cost[i] <= 999

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int n = cost.length;
        int[] dp = new
 
int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];


        
for (int i = 2; i < n; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i], dp[i - 2] + cost[i]);
        }

        return Math.min(dp[n - 1], dp[n - 2]);
    }
}


//This solution works by using a dynamic programming approach. We create an array dp, where dp[i] represents the minimum cost to reach the i-th step. We initialize the first two elements of dp to the costs of the first two steps. Then, we iterate over the remaining steps, computing the minimum cost to reach each step using the following recursive formula:
//
//dp[i] = min(dp[i - 1] + cost[i], dp[i - 2] + cost[i])
//This formula states that the minimum cost to reach the i-th step is the minimum of the following two costs:
//
//The cost of climbing one step from the (i - 1)-th step, plus the cost of the i-th step.
//The cost of climbing two steps from the (i - 2)-th step, plus the cost of the i-th step.
//Once we have computed the dp array, the minimum cost to reach the top of the floor is given by the minimum of dp[n - 1] and dp[n - 2].
//
//Here is an example of how to use the MinCostClimbingStairs class:
//
//Java
//int[] cost = {10, 15, 20};
//MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();
//int minCost = minCostClimbingStairs.minCostClimbingStairs(cost);
//System.out.println(minCost); // 15
//Use code with caution. Learn more
//This code will print the minimum cost to reach the top of the floor, which is 15.


