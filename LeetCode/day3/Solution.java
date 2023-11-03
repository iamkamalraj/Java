package day3;


public class Solution {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charCount = new int[26]; // Assuming input contains only lowercase alphabets

        // Count occurrences of characters in string s
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
        }

        // Decrement the character count for each character in string t
        for (int i = 0; i < t.length(); i++) {
            charCount[t.charAt(i) - 'a']--;
            if (charCount[t.charAt(i) - 'a'] < 0) {
                return false; // More occurrences of a character in t than in s
            }
        }

        return true; // Both strings are anagrams
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Are '" + s1 + "' and '" + t1 + "' anagrams? " + isAnagram(s1, t1));

        String s2 = "rat";
        String t2 = "car";
        System.out.println("Are '" + s2 + "' and '" + t2 + "' anagrams? " + isAnagram(s2, t2));
    }
}

