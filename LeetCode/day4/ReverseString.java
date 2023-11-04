package day4;

import java.util.Arrays;

public class ReverseString {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
//     public static void main(String[] args) {
//         ReverseString reverseString = new ReverseString();

//         // Example 1
//         char[] input1 = {'h', 'e', 'l', 'l', 'o'};
//         reverseString.reverseString(input1);
//         System.out.println("Reversed string for input 1: " + Arrays.toString(input1));

//         // Example 2
//         char[] input2 = {'H', 'a', 'n', 'n', 'a', 'h'};
//         reverseString.reverseString(input2);
//         System.out.println("Reversed string for input 2: " + Arrays.toString(input2));
//     }
// }

