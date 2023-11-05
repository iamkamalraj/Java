package day5;

//14. Longest Common Prefix

//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".
//
// 
//
//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
// 
//
//Constraints:
//
//1 <= strs.length <= 200
//0 <= strs[i].length <= 200
//strs[i] consists of only lowercase English letters.


class Solution {
    public String longestCommonPrefix(String[] strs) {
         if (strs == null || strs.length == 0) {
            return "";
        }

        // Take the first string as a reference for comparison
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // Compare the current prefix with each string in the array
            while (strs[i].indexOf(prefix) != 0) {
                // Update the prefix by removing the last character and recheck
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}

//class Solution {
//    public String longestCommonPrefix(String[] strs) {
//        if (strs.length == 0) {
//            return "";
//        }
//
//        var j = 0;
//        for (int i = 0; i < strs.length; i++) {
//            if (strs[i].length() == 0) {
//                return "";
//            }
//            if (strs[i].length() == j || strs[0].length() == j) {
//                break;
//            }
//            if (strs[i].charAt(j) != strs[0].charAt(j)) {
//                break;
//            }
//            if (i == strs.length - 1) {
//                i = 0;
//                j++;
//            }
//        }
//        return strs[0].substring(0, j);
//    }
//}
