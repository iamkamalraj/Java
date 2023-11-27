package day27;



class Solution {
    int maxLen = 0;
    int lo = 0;

    public String longestPalindrome(String s) {
        char[] input = s.toCharArray();
        if (s.length() < 2) {
            return s;
        }

        for (int i = 0; i < input.length; i++) {
            expandPalindrome(input, i, i);
            expandPalindrome(input, i, i + 1);
        }
        return s.substring(lo, lo + maxLen);
    }

    public void expandPalindrome(char[] s, int j, int k) {
        while (j >= 0 && k < s.length && s[j] == s[k]) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            maxLen = k - j - 1;
            lo = j + 1;
        }
    }
}

//Intuition
//The problem requires us to find the longest palindromic substring within a given string.
//A simple approach is to check every possible substring within the given string and determine
//if it's a palindrome. However, this brute-force approach results in a time complexity of O(n^3),
//which is highly inefficient.
//
//A more efficient approach is to use dynamic programming, which allows us to optimize the solution
//to O(n^2). The key idea is to recognize that a palindrome reads the same backward as forward.
//Therefore, we can efficiently identify palindromes by expanding around a center. We start with
//a single character as a center and expand it in both directions, keeping track of the longest
//palindrome found.


//Approach
//Initialize two variables, maxLen and lo, to keep track of the maximum palindrome length
//and the starting index of the longest palindrome.
//Iterate through the characters of the input string.
//For each character, expand around the center, considering both odd and even-length palindromes.
//While expanding, check if the substring is a palindrome.
//If a longer palindrome is found, update maxLen and lo accordingly.
//After iterating through all characters, return the longest palindrome substring using the 
//lo and maxLen variables.

//Complexity
//Time Complexity: O(n^2) - We expand around each character once, leading to a quadratic time
//complexity.
//Space Complexity: O(1) - We use a constant amount of extra space.
//This optimized solution efficiently finds the longest palindromic substring in a given string.