package day1;

//412. Fizz Buzz
//Solved
//Easy
//Topics
//Companies
//Given an integer n, return a string array answer (1-indexed) where:
//
//answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//answer[i] == "Fizz" if i is divisible by 3.
//answer[i] == "Buzz" if i is divisible by 5.
//answer[i] == i (as a string) if none of the above conditions are true.
// 
//
//Example 1:
//
//Input: n = 3
//Output: ["1","2","Fizz"]
//Example 2:
//
//Input: n = 5
//Output: ["1","2","Fizz","4","Buzz"]
//Example 3:
//
//Input: n = 15
//Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
// 
//
//Constraints:
//
//1 <= n <= 104


//Runtime: 0ms
import java.util.AbstractList;
import java.util.List;


class Solution {
    public List<String> fizzBuzz(int n) {
        return new AbstractList<String>() {
            @Override
            public String get(int index) {
                index++;

                if (index % 3 == 0 && index % 5 == 0) {
                    return "FizzBuzz";
                }
                if (index % 3 == 0) {
                    return "Fizz";
                }
                if (index % 5 == 0) {
                    return "Buzz";
                }
                return Integer.toString(index);
            }

            @Override
            public int size() {
                return n;
            }
        };        
    }
}

//Runtime: 1ms
class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            boolean byThree = (i + 1) % 3 == 0;
            boolean byFive = (i + 1) % 5 == 0;

            if (byThree && byFive) 
                answer.add("FizzBuzz");
            else if (byThree)
                answer.add("Fizz");
            else if (byFive)
                answer.add("Buzz");
            else
                answer.add(Integer.toString(i + 1));
        }


        return answer;
    }
}