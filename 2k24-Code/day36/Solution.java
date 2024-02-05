package day36;

//387. First Unique Character in a String
//
//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
//
// 
//
//Example 1:
//
//Input: s = "leetcode"
//Output: 0
//Example 2:
//
//Input: s = "loveleetcode"
//Output: 2
//Example 3:
//
//Input: s = "aabb"
//Output: -1
// 
//
//Constraints:
//
//1 <= s.length <= 105
//s consists of only lowercase English letters.

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        
        // Count character frequencies
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        
        // Find the first unique character
        for (int i = 0; i < s.length(); ++i) {
            if (freqMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        // If no unique character is found
        return -1;
    }
}
