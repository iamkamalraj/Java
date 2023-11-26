package day26;

//921. Minimum Add to Make Parentheses Valid

//A parentheses string is valid if and only if:
//
//It is the empty string,
//It can be written as AB (A concatenated with B), where A and B are valid strings, or
//It can be written as (A), where A is a valid string.
//You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.
//
//For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
//Return the minimum number of moves required to make s valid.
//
// 
//
//Example 1:
//
//Input: s = "())"
//Output: 1
//Example 2:
//
//Input: s = "((("
//Output: 3
// 
//
//Constraints:
//
//1 <= s.length <= 1000
//s[i] is either '(' or ')'.



class Solution {
    public int minAddToMakeValid(String s) {
        int f = 0;
        int t = 0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                if(t > 0){
                    f += Math.abs(t);
                    t = 0;
                }
                t -= 1;
            }
            else if(c==')'){
                t += 1;
            }
        }
        f += Math.abs(t);
        return f;
    }
}


// Here's a step-by-step explanation:

// f is the final count representing the minimum number of additions needed.
// t is a temporary count of open parentheses. It starts at 0.
// The code iterates through each character in the input string s.
// If the character is '(', it checks if there are any temporary open parentheses (t > 0). If so, it adds the absolute value of t to f and resets t to 0. Then, it decrements t.
// If the character is ')', it increments t.
// After the loop, any remaining temporary open parentheses are added to f.
// The final count f is returned.
