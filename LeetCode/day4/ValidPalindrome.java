package day4;

//125. Valid Palindrome
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.
//
// 
//
//Example 1:
//
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
//Example 2:
//
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.
//Example 3:
//
//Input: s = " "
//Output: true
//Explanation: s is an empty string "" after removing non-alphanumeric characters.
//Since an empty string reads the same forward and backward, it is a palindrome.
// 
//
//Constraints:
//
//1 <= s.length <= 2 * 105
//s consists only of printable ASCII characters.


public class ValidPalindrome {
	public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true; // An empty string is considered a palindrome
        }

        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); // Convert to lowercase and remove non-alphanumeric characters

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        return true; // It's a palindrome
    
    }
}

//public static void main(String[] args) {
//    ValidPalindrome palindromeChecker = new ValidPalindrome();
//    
//    // Example usage:
//    String s1 = "A man, a plan, a canal: Panama";
//    System.out.println(palindromeChecker.isPalindrome(s1)); // Output: true
//
//    String s2 = "race a car";
//    System.out.println(palindromeChecker.isPalindrome(s2)); // Output: false
//
//    String s3 = " ";
//    System.out.println(palindromeChecker.isPalindrome(s3)); // Output: true
//}
//}

