//package day42;
//
//560. Subarray Sum Equals K
//
//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//
//A subarray is a contiguous non-empty sequence of elements within an array.
//
// 
//
//Example 1:
//
//Input: nums = [1,1,1], k = 2
//Output: 2
//Example 2:
//
//Input: nums = [1,2,3], k = 3
//Output: 2
// 
//
//Constraints:
//
//1 <= nums.length <= 2 * 104
//-1000 <= nums[i] <= 1000
//-107 <= k <= 107
//
//
//Hint 1
//Will Brute force work here? Try to optimize it.
//Hint 2
//Can we optimize it by using some extra space?
//Hint 3
//What about storing sum frequencies in a hash table? Will it be useful?
//Hint 4
//sum(i,j)=sum(0,j)-sum(0,i), where sum(i,j) represents the sum of all the elements from index i to j-1. Can we use this property to optimize it.
//
//
//class Solution {
//    public int subarraySum(int[] nums, int k) {
//        int sum = 0;
//        int ans = 0;
//        HashMap<Integer,Integer> map = new HashMap<>();
//        map.put(0,1);
//        for(int j=0;j<nums.length;j++){
//            sum += nums[j];
//            if(map.containsKey(sum -k)){
//                ans += map.get(sum-k);
//            }
//            map.put(sum,map.getOrDefault(sum,0)+1);
//        }
//        return ans;
//    }
//}
//
//Approach
//
//This code is an implementation of a solution to find the number of contiguous subarrays in an array
//of integers that add up to a target sum, k.
//
//The approach used in this solution is to use a HashMap, map, to store the cumulative sum of the
//elements in the array and the number of times that cumulative sum has been seen so far. The cumulative
//sum of the elements in a subarray can be represented as the difference between the cumulative sum of
//the elements in the array up to the end of the subarray and the cumulative sum of the elements in the
//array up to the start of the subarray.
//
//The function starts by initializing a variable sum to keep track of the cumulative sum of the elements
//in the array, and a variable ans to keep track of the number of subarrays that add up to k. The
//function also adds an entry to map with key 0 and value 1, which represents the cumulative sum of an
//empty subarray, which is 0.
//
//The function then iterates over each element in the array, adding the current element to the cumulative
//sum, and checking if the cumulative sum minus k is in map. If it is, the function adds the value of
//that key in map to the count of subarrays that add up to k, as that represents the number of times
//that cumulative sum has been seen so far, and therefore the number of subarrays that end at the
//current element and add up to k.
//
//Finally, the function adds the current cumulative sum to map, with a value of 1 if it is the first
//time that cumulative sum has been seen, or increments the value of that key by 1 if it has been seen
//before.
//
//Complexity
//Time complexity:
//The time complexity of this solution is O(n), where n is the length of the array. This is because,
//in the worst case, all elements in the array need to be processed once, so the number of operations
//is proportional to the length of the array.
//
//Space complexity:
//The space complexity of this solution is O(n), as in the worst case, all elements in the array can
//have different cumulative sums, so the HashMap can store at most n entries.