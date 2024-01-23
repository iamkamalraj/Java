package day22;

//645. Set Mismatch
//
//You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
//
//You are given an integer array nums representing the data status of this set after the error.
//
//Find the number that occurs twice and the number that is missing and return them in the form of an array.
//
// 
//
//Example 1:
//
//Input: nums = [1,2,2,4]
//Output: [2,3]
//Example 2:
//
//Input: nums = [1,1]
//Output: [1,2]
// 
//
//Constraints:
//
//2 <= nums.length <= 104
//1 <= nums[i] <= 104



class Solution {
    public int[] findErrorNums(int[] nums) {
        int len=nums.length;
        int an=0;
        int arr[]=new int[10001];
        int ans[]=new int[2];
        int count=0;
         
        for(int i=0;i<len;i++){
            arr[nums[i]]++;
        }
        for(int i=1;i<len+1;i++){
            if(arr[i]==2){
                ans[0]=i;
                count++;
            }
            else if(arr[i]==0){
                count++;
                ans[1]= i;
            }

            if(count==2){
                break;
            }
        }

        return ans;
    }
}

//day23
class Solution {
    public int maxLength(List<String> arr) {
        List<Integer> dp = new ArrayList<>();
        dp.add(0);
        int res = 0;
        for (String s : arr) {
            int a = 0, dup = 0;
            for (char c : s.toCharArray()) {
                dup |= a & (1 << (c - 'a'));
                a |= 1 << (c - 'a');
            }
            if (dup > 0)    continue;
            for (int i = dp.size() - 1; i >= 0; i--) {
                if ((dp.get(i) & a) > 0) continue;
                dp.add(dp.get(i) | a);
                res = Math.max(res, Integer.bitCount(dp.get(i) | a));
            }
            
        }
        return res;
    }
}
