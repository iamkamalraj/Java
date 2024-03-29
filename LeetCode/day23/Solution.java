package day23;

//20. Valid Parentheses

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
// 
//
//Example 1:
//
//Input: s = "()"
//Output: true
//Example 2:
//
//Input: s = "()[]{}"
//Output: true
//Example 3:
//
//Input: s = "(]"
//Output: false
// 
//
//Constraints:
//
//1 <= s.length <= 104
//s consists of parentheses only '()[]{}'.

//class Solution {
//	public boolean isValid(String s) {
//		Stack<Character> stack = new Stack<Character>();
//		for (char c : s.toCharArray()) {
//			if (c == '(')
//				stack.push(')');
//			else if (c == '{')
//				stack.push('}');
//			else if (c == '[')
//				stack.push(']');
//			else if (stack.isEmpty() || stack.pop() != c)
//				return false;
//		}
//		return stack.isEmpty();
//	}
//}


//day24
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        for (int i = 1;i < nums.length; i++)
        {
            prefix[i]  = nums[i-1] * prefix[i -1];
        }
        int suffix = 1;
        for (int i = nums.length-1; i>=0;  i--)
        {
        prefix[i] = prefix[i] * suffix;
        suffix = suffix * nums[i];
        }

    return prefix;
    }
}
