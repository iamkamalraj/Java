package day13;

//1347. Minimum Number of Steps to Make Two Strings Anagram
//
//You are given two strings of the same length s and t. In one step you can choose any character of t and replace it with another character.
//
//Return the minimum number of steps to make t an anagram of s.
//
//An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.
//
// 
//
//Example 1:
//
//Input: s = "bab", t = "aba"
//Output: 1
//Explanation: Replace the first 'a' in t with b, t = "bba" which is anagram of s.
//Example 2:
//
//Input: s = "leetcode", t = "practice"
//Output: 5
//Explanation: Replace 'p', 'r', 'a', 'i' and 'c' from t with proper characters to make t anagram of s.
//Example 3:
//
//Input: s = "anagram", t = "mangaar"
//Output: 0
//Explanation: "anagram" and "mangaar" are anagrams. 
// 
//
//Constraints:
//
//1 <= s.length <= 5 * 104
//s.length == t.length
//s and t consist of lowercase English letters only.

class Solution {
    public int minSteps(String s, String t) {
        Map<Character, Integer> smp = new HashMap<>();
        Map<Character, Integer> tmp = new HashMap<>();
        int cnt = 0;

        for (char a : s.toCharArray()) {
            smp.put(a, smp.getOrDefault(a, 0) + 1);
        }

        for (char a : t.toCharArray()) {
            tmp.put(a, tmp.getOrDefault(a, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : smp.entrySet()) {
            char key = entry.getKey();
            if (tmp.containsKey(key)) {
                if (entry.getValue().equals(tmp.get(key))) {
                    cnt += entry.getValue();
                } else {
                    cnt += Math.min(entry.getValue(), tmp.get(key));
                }
            }
        }

        return s.length() - cnt;
    }
}
