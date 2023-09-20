package basics;

class Calculator {
	public void add(int a, int b) {
		int c = a + b;
		System.out.println("Addition of a+b is = " + c);

	}

	public void sub(int e, int f) {
		int g = e - f;
		System.out.println("Subraction of e-f is = " + g);
	}

	public static double div(double h, double i) {
		double k = h / i;
		return k;

	}

	public static double mod(double l, double m) {
		double n = l % m;
		return n;
	}

	public int mul(int o, int p) {
		int q = o * p;
		System.out.print("Multiplication of " + o + "*" + q + " is = ");
		return q;
	}
}

public class DemoCalc {

	public static void main(String[] args) {// void - add sub //double - Div,Mod

		Calculator calc = new Calculator();
		calc.add(5, 5);
		calc.sub(10, 5);
		System.out.println(calc.mul(5, 5));
		System.out.println("Division of h/i is = " + Calculator.div(4, 2));
		System.out.println("Modulus of l%m is = " + Calculator.mod(5, 2));

	}

}

************************************************************************************************************************************

package basics;

import java.util.*;

public class FindOddEven {
	public void oddEven(int a) {
		if (a % 2 == 1) {
			System.out.println("The given Number is Odd");
		} else {
			System.out.println("The given Number is Even");
		}
	}

	public void evenSeries(int b) {
		System.out.println("\nThe Even Series are ");
		for (int i = 1; i <= b; i++) {
			if (i % 2 == 0) {
				System.out.print(i + ",");
			}
		}
	}

	public void oddSeries(int b) {
		System.out.println("The Odd Series are ");
		for (int i = 0; i <= b; i++) {
			if (i % 2 == 1) {
				System.out.print(i + ",");
			}
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a Number ");
		int a = scan.nextInt();
		FindOddEven oe = new FindOddEven();
		oe.oddEven(a);
		oe.oddSeries(a);
		oe.evenSeries(a);

	}

}
*************************************************************************************************************************************************
package basics;

public class MethodConcepts {

	// void methods

	public void display11() {
		System.out.println("display11:this is non-static voidMethod ");
	}

	public static void display12() {
		System.out.println("display12:this is static voidMethod ");
	}
	// returnType methods

	public int display21() {
		System.out.println("display21 :this is non-static returnMethod ");
		return 6;
	}

	public static int display22() {
		System.out.println("display22 : this is static returnMethod ");
		return 7;

	}

	// parameterized methods
	public void display31(String a) {
		System.out.println("display31:this is non-static void with parameters");
		System.out.println("a = " + a);
	}

	public static void display32(String a) {
		System.out.println("display32:this is static void with parameters");
		System.out.println("a = " + a);
	}

	public String display33(String a) {
		System.out.println("display33:this is non-static returnMethod  with parameters");
		return a;
	}

	public static String display34(String b) {
		System.out.println("display34:this is static returnMethod  with parameters");
		return b;
	}

	public static void main(String[] args) {

		// calling methods
		
		MethodConcepts obj = new MethodConcepts();
		obj.display11();
		
		MethodConcepts.display12();
		
		System.out.println(obj.display21());
		
		System.out.println(MethodConcepts.display22());
		
		obj.display31("Kamal");

		MethodConcepts.display32("Kamal");
		
		System.out.println(obj.display33("Kamal"));
		
		
		System.out.println(MethodConcepts.display34("Kamal-34"));
		
	}

}

************************************************************************************************************************************
Hacker Rank #3

package basics;

import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		if (N % 2 != 0 || (N % 2 == 0 && N >= 6 && N <= 20)) {
			System.out.println("Weird");

		} else if (N % 2 == 0 && (N >= 2 && N <= 5) || N > 20) {
			System.out.println("Not Weird");
		}
	}
}

************************************************************************************************************************************
Hacker Rank #4
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        scan.nextLine(); // get rid of empty newline char
        double d = scan.nextDouble();
        scan.nextLine(); // get rid of empty newline char
        String s = scan.nextLine();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        scan.close();
    }
}

************************************************************************************************************************************
//Hacker Rank #5 Multiplication Tables
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<=10; i++){
            if(1<=i && i<=10){
                int result = N * i;
                System.out.println(N+" " + "x" + " " + i + " = "+ result);
                sc.close();
            }
        }
    }
}
************************************************************************************************************************************
//Hacker Rank #6

class Solution {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			int term = a;
			for (int j = 0; j < n; j++) {
				term += (Math.pow(2, j) * b);
				System.out.print(term + " ");
			}
			System.out.println();
		}
		in.close();
	}
}
************************************************************************************************************************************
#Hacker Rank #7

class Solution {
	public static void main(String[] argh) {
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();

			for (int i = 0; i < t; i++) {

				try {
					long x = sc.nextLong();
					System.out.println(x + " can be fitted in:");

					if (x >= -128 && x <= 127)// byte
						System.out.println("* byte \n* short \n* int \n* long");

					else if (x >= -32768 && x <= 32767)// short
						System.out.println("* short \n* int \n* long");

					else if (x >= -2147483648 && x <= 2147483647)// int
						System.out.println("* int \n* long");

					else if (x >= -9223372036854775808l && x <= 9223372036854775807l)// long
						System.out.println("* long");

					// Complete the code
				} catch (Exception e) {
					System.out.println(sc.next() + " can't be fitted anywhere.");
				}

			}
		}
	}
}
************************************************************************************************************************************
#Hacker Rank #8

import java.util.*;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i > 0) {
            if (sc.hasNext()) {
                String myStr = sc.nextLine();
                System.out.println(i + " " + myStr);
                i++;
            } else {
                i = -1;
            }
        }
        sc.close();
    }
}
************************************************************************************************************************************
#Hacker Rank #9
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int B = sc.nextInt();
		int H = sc.nextInt();

		sc.close();

		try {

			if (B > 0 && H > 0) {
				System.out.print(B * H);
			} else {
				throw new Exception("Breadth and height must be positive");
			}

		} catch (Exception e) {
			System.out.print(e);
		}
	}
}
************************************************************************************************************************************
#Hacker Rank #10

import java.util.*;
import java.security.*;

public class Solution {
	public static void main(String[] args) {

		DoNotTerminate.forbidExit();

		try {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			in.close();
			// String s=???; Complete this line below
			String s = Integer.toString(n);					//Updated Solution in this line

			if (n == Integer.parseInt(s)) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer.");
			}
		} catch (DoNotTerminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

	public static class ExitTrappedException extends SecurityException {

		private static final long serialVersionUID = 1;
	}

	public static void forbidExit() {
		final SecurityManager securityManager = new SecurityManager() {
			@Override
			public void checkPermission(Permission permission) {
				if (permission.getName().contains("exitVM")) {
					throw new ExitTrappedException();
				}
			}
		};
		System.setSecurityManager(securityManager);
	}
}
************************************************************************************************************************************
#Hacker Rank #11
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.time.DayOfWeek;
import java.time.LocalDate;

class Result{

 public static String findDay(int month, int day, int year) {
        LocalDate lt = LocalDate.of(year,month,day);
        return lt.getDayOfWeek().name();
    }
 }
 
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
************************************************************************************************************************************
#Hacker Rank #12
import java.util.*;
import java.text.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double amount = scanner.nextDouble();
		scanner.close();

		// US Dollar formatting
		NumberFormat usFormatter = NumberFormat.getCurrencyInstance(Locale.US);
		String usFormatted = usFormatter.format(amount);

		// Indian Rupee formatting
		Locale indiaLocale = new Locale("en", "IN");
		NumberFormat indiaFormatter = NumberFormat.getCurrencyInstance(indiaLocale);
//	    	indiaFormatter.setCurrencySymbol("Rs."); // Set currency symbol to "Rs."
		String indiaFormatted = indiaFormatter.format(amount);

		// Chinese Yuan formatting
		Locale chinaLocale = Locale.CHINA;
		NumberFormat chinaFormatter = NumberFormat.getCurrencyInstance(chinaLocale);
		String chinaFormatted = chinaFormatter.format(amount);

		// Euro formatting
		Locale franceLocale = Locale.FRANCE;
		NumberFormat franceFormatter = NumberFormat.getCurrencyInstance(franceLocale);
		String franceFormatted = franceFormatter.format(amount);

		// Print formatted values
		System.out.println("US: " + usFormatted);
		System.out.println("India: " + indiaFormatted);
		System.out.println("China: " + chinaFormatted);
		System.out.println("France: " + franceFormatted);
	}
}
************************************************************************************************************************************
#Hacker Rank #13

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;
import java.security.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		DoNotTerminate.forbidExit();

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine().trim());
			Object o;// Must be used to hold the reference of the instance of the class
						// Solution.Inner.Private
			Inner in = new Inner();
			o = in.new Private();
			Method method = o.getClass().getDeclaredMethod("powerof2", int.class);
			method.setAccessible(true);
			System.out.println(num + " is " + method.invoke(o, num));
			System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

		} // end of try

		catch (DoNotTerminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}// end of main

	static class Inner {
		private class Private {
			private String powerof2(int num) {
				return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
			}
		}
	}// end of Inner

}// end of Solution

class DoNotTerminate { // This class prevents exit(0)

	public static class ExitTrappedException extends SecurityException {

		private static final long serialVersionUID = 1L;
	}

	public static void forbidExit() {
		final SecurityManager securityManager = new SecurityManager() {
			@Override
			public void checkPermission(Permission permission) {
				if (permission.getName().contains("exitVM")) {
					throw new ExitTrappedException();
				}
			}
		};
		System.setSecurityManager(securityManager);
	}
}
************************************************************************************************************************************
//#Hacker Rank #14

import java.io.*;
import java.util.*;
import java.lang.reflect.*;
import static java.lang.System.in;

class Prime {
	void checkPrime(int... numbers) {
		for (int num : numbers) {
			if (isPrime(num)) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
	}

	boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}

public class Solution {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			int n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			int n3 = Integer.parseInt(br.readLine());
			int n4 = Integer.parseInt(br.readLine());
			int n5 = Integer.parseInt(br.readLine());
			Prime ob = new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1, n2);
			ob.checkPrime(n1, n2, n3);
			ob.checkPrime(n1, n2, n3, n4, n5);
			Method[] methods = Prime.class.getDeclaredMethods();
			Set<String> set = new HashSet<>();
			boolean overload = false;
			for (int i = 0; i < methods.length; i++) {
				if (set.contains(methods[i].getName())) {
					overload = true;
					break;
				}
				set.add(methods[i].getName());

			}
			if (overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
************************************************************************************************************************************
//#Hacker Rank #15
import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		System.out.println(A.length() + B.length());
		System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
		System.out.println(capitalizeFirstLetter(A) + " " + capitalizeFirstLetter(B));
		sc.close();
	}

	public static String capitalizeFirstLetter(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}

		char[] charArray = input.toCharArray();
		charArray[0] = Character.toUpperCase(charArray[0]);
		return new String(charArray);
	}
}
************************************************************************************************************************************
#Hacker Rank #16
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int start = in.nextInt();
		int end = in.nextInt();

		char[] array = S.toCharArray();
		for (int i = start; i <= end - 1; i++) {
			System.out.print(array[i]);
		}

	}
}
************************************************************************************************************************************
#Hacker Rank #17
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
      if (s.length()<k){
            return null;
        }
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        for (int i = 1; i <= s.length()-k; i++){
            String ngram = s.substring(i, i+k);
            if (ngram.compareTo(smallest)<0){
                smallest = ngram;
            }
            if (ngram.compareTo(largest)>0){
                largest = ngram;
            }
        }
        return smallest + "\n" + largest  
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
************************************************************************************************************************************
#Hacker Rank #18
import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String rev = "";
		/* Enter your code here. Print output to STDOUT. */
		for (int i = 0; i < A.length(); i++) {
			rev += A.charAt(A.length() - i - 1);
		}

		if (A.equals(rev)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

************************************************************************************************************************************
#Hacker Rank #19
import java.util.Scanner;

public class Solution {

	static boolean isAnagram(String a, String b) {

		String s = a.toLowerCase();
		String t = b.toLowerCase();
		int count[] = new int[26];
		for (char c : s.toCharArray()) {
			count[c - 97]++;
		}
		for (char c : t.toCharArray()) {
			count[c - 97]--;
		}
		for (int i = 0; i < 26 - 1; i++) {
			if (count[i] != 0)
				return false;

		}
		return true;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
************************************************************************************************************************************
#Hacker Rank #20
import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.
		s = s.trim();
		String str[] = s.split("[^a-zA-Z]+");
		if (s.length() == 0) {
			System.out.println(0);
		} else {
			System.out.println(str.length);
		}
		for (String word : str) {
			System.out.println(word);
		}
		scan.close();
	}
}
************************************************************************************************************************************
//#Hacker Rank #21
import java.util.Scanner;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		String pattern = null;
		while (testCases > 0) {
			try {
				pattern = in.nextLine();
			} catch (java.util.NoSuchElementException e) {
				break;
			}
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
		}
		in.close();
	}
}
//Sample Input
//3
//([A-Z])(.+)
//[AZ[a-z](a-z)
//batcatpat(nat
//		
//	
//Sample Output
//Valid
//Invalid
//Invalid
************************************************************************************************************************************
//#Hacker Rank #22 // Passes only test case one
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		//System.out.print("Enter a String: ");
		Scanner x = new Scanner(System.in);
		String str[] = new String[6];
		for (int i = 0; i < 6; i++) {
			str[i] = x.nextLine();
		}
		x.close();

		for (String item : str) {
			String text[] = item.split("[.]", 5);
			try {
				if (text.length == 4) {
					for (String i : text) {
						if (i.length() <= 3 && i.length() >= 1) {

							int num = Integer.parseInt(i);
							if (num <= 255 && num >= 0) {
								// System.out.println(i);
							} else {
								throw new NumberFormatException();
							}
						} else {
							throw new NumberFormatException();
						}
					}
				} else {
					throw new NumberFormatException();
				}
				System.out.println("true");
				} catch (NumberFormatException ex) {
				System.out.println("false");
			}
		}
	}
}
// Input
// 000.12.12.034
// 121.234.12.12
// 23.45.12.56
// 00.12.123.123123.123
// 122.23
// Hello.IP
	
// Output
// true
// true
// true
// false
// false
// false
************************************************************************************************************************************
//#Hacker Rank #22 // Passes All Test cases
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex {
    // Regular expression for validating IP address
    // The pattern checks for 4 groups of numbers (A.B.C.D)
    // Each group can be from 0 to 255 with leading zeros allowed, and the length of each group can't be greater than 3.
    // Note: We need to escape the backslashes in the Java string, so "\\" represents a single backslash in the regular expression.
    String pattern = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
}
//Sample Input
//
//000.12.12.034
//121.234.12.12
//23.45.12.56
//00.12.123.123123.123
//122.23
//Hello.IP
//
//Sample Output
//
//true
//true
//true
//false
//false
//false
************************************************************************************************************************************
//#Hacker Rank #23 
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex =  "\\b(\\w+)(\\s+\\1)+\\b";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = m.replaceAll("$1");
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}

// Sample Input

// 5
// Goodbye bye bye world world world
// Sam went went to to to his business
// Reya is is the the best player in eye eye game
// in inthe
// Hello hello Ab aB
	
// Sample Output

// Goodbye bye world
// Sam went to his business
// Reya is the best player in eye game
// in inthe
// Hello Ab
************************************************************************************************************************************
//#Hacker Rank #24

import java.util.Scanner;

class UsernameValidator {
	
	 // Write regular expression here.
	 
	public static final String regularExpression = "[a-zA-Z][a-zA-Z_0-9]{7,29}";
}

//solution - 1st -first character of the username must be an alphabetic character i.e. either lowercase character or uppercase character . regex expression for this - [a-zA-Z]
//
//2nd -The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters , uppercase characters and digits .
//regex expression for this - [a-zA-Z_0-9]
//
//
//3rd-The username consists of 8 to 30 characters inclusive. If the username consists of less than 8 or greater than 30 characters, then it is an invalid username.
//regex expression for this - {7,29}
//
//
//so over all regex expression will be-"[a-zA-Z][a-zA-Z_0-9]{7,29}" 

public class Solution {
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(scan.nextLine());
		while (n-- != 0) {
			String userName = scan.nextLine();

			if (userName.matches(UsernameValidator.regularExpression)) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
	}
}

//Sample Input 0

//8
//Julia
//Samantha
//Samantha_21
//1Samantha
//Samantha?10_2A
//JuliaZ007
//Julia@007
//_Julia007
//

//Sample Output 0
//
//Invalid
//Valid
//Valid
//Invalid
//Invalid
//Valid
//Invalid
//Invalid

//************************************************************************************************************************************
//#Hacker Rank #25
import java.util.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String line = in.nextLine();

			// Write your code here
			Pattern pattern = Pattern.compile("<([^<>/]+)>([^<>]+)</(\\1)>");
			Matcher matcher = pattern.matcher(line);
			if (matcher.find()) {
				System.out.println(matcher.group(2));
				while (matcher.find()) {
					System.out.println(matcher.group(2));
				}
			} else {
				System.out.println("None");
			}

			testCases--;
		}
	}
}

//Sample Input
//
//4
//<h1>Nayeem loves counseling</h1>
//<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
//<Amee>safat codes like a ninja</amee>
//<SA premium>Imtiaz has a secret crush</SA premium>
//
//Sample Output
//
//Nayeem loves counseling
//Sanjay has no watch
//So wait for a while
//None
//Imtiaz has a secret crush

//!!!!!!Explanation!!!!!
//For example
//
//Nayeem loves counseling
//<([^<>/]+)> to match HTML start tag. The parentheses is to put the content into a group. In the example, it is h1. [^<>/] means we don't want to have any of thoses characters <, >, /.
//
//([^<>]+) to match the content between 2 tag
//
//to match HTML end tag. (\1) to match the same content as in the first group. In the example, it is h1

//************************************************************************************************************************************
//#Hacker Rank #26
import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        for (int i = 0; i < n-1; i++) 
    {
        int minIdx =i;
       for (int j = i+1; j < n; j++) 
       {
          String s1 = s[minIdx];
          String s2 = s[j];
          BigDecimal b1 = new BigDecimal(s1);
          BigDecimal b2 = new BigDecimal(s2);
          if(b1.compareTo(b2)<0)
          {
              minIdx = j;
          }
       }
       String temp = s[i];
       s[i] = s[minIdx];
       s[minIdx] = temp;
    }

        

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}

// Sample Input

// 9
// -100
// 50
// 0
// 56.6
// 90
// 0.12
// .12
// 02.34
// 000.000
	
// Sample Output

// 90
// 56.6
// 50
// 02.34
// 0.12
// .12
// 0
// 000.000
// -100
//************************************************************************************************************************************
//#Hacker Rank #27

import java.io.*;
import java.math.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String n = bufferedReader.readLine();
		if (new BigInteger(n).isProbablePrime(1)) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}

		bufferedReader.close();
	}
}
//Sample Input
//13
//
//Sample Output
//prime
//************************************************************************************************************************************
//#Hacker Rank #29
import java.util.*;

public class Solution {

  public static void main(String[] args) {
	   
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
      a[i] = scan.nextInt();
      }
      scan.close();

      // Prints each sequential element in array a
      for (int i = 0; i < a.length; i++) {
          System.out.println(a[i]);
      }
  }
}

//Sample Input
//
//5
//10
//20
//30
//40
//50
//Sample Output
//
//10
//20
//30
//40
//50

//An array is a simple data structure used to store a collection of data in a contiguous block of memory. Each element in the collection is accessed using an index, and the elements are easy to find because they're stored sequentially in memory.
//
//Because the collection of elements in an array is stored as a big block of data, we typically use arrays when we know exactly how many pieces of data we're going to have. For example, you might use an array to store a list of student ID numbers, or the names of state capitals. To create an array of integers named  that can hold four integer values, you would write the following code:
//
//int[] myArray = new int[4];
//This sets aside a block of memory that's capable of storing  integers. Each integer storage cell is assigned a unique index ranging from  to one less than the size of the array, and each cell initially contains a . In the case of , we can store integers at indices , , , and . Let's say we wanted the last cell to store the number ; to do this, we write:
//
//myArray[3] = 12;
//Similarly, we can print the contents of the last cell with the following code:
//
//System.out.println(myArray[3]);
//The code above prints the value stored at index  of , which is  (the value we previously stored there). It's important to note that while Java initializes each cell of an array of integers with a , not all languages do this.
//
//Task
//
//The code in your editor does the following:
//
//Reads an integer from stdin and saves it to a variable, , denoting some number of integers.
//Reads  integers corresponding to  from stdin and saves each integer  to a variable, .
//Attempts to print each element of an array of integers named .
//Write the following code in the unlocked portion of your editor:
//
//Create an array, , capable of holding  integers.
//Modify the code in the loop so that it saves each sequential value to its corresponding location in the array. For example, the first value must be stored in , the second value must be stored in , and so on.
//Good luck!
//
//Input Format
//
//The first line contains a single integer, , denoting the size of the array.
//Each line  of the  subsequent lines contains a single integer denoting the value of element .
//
//Output Format
//
//You are not responsible for printing any output to stdout. Locked code in the editor loops through array  and prints each sequential element on a new line.

//************************************************************************************************************************************
//#Hacker Rank #Q30
import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		Integer arr1[] = { 1, 2, 3 };
		String arr2[] = { "Hello", "World" };
		Printer<Integer> print1 = new Printer<>(arr1);
		// print1.print();
		Printer<String> print2 = new Printer<>(arr2);
		// print2.print();

	}

	public static class Printer<T> {
		T[] thingtoprint;

		public Printer(T[] thingtoprint) {
			this.thingtoprint = thingtoprint;
			for (T i : thingtoprint) {
				System.out.println(i);
			}
		}
		// public void print(){
		// for(T i :thingtoprint){
		// System.out.println(i);
		// }
		// }

	}
}


//output
// 1
// 2
// 3
// Hello
// World


// Generic methods are a very efficient way to handle multiple datatypes using a single method. This problem will test your knowledge on Java Generic methods.

// Let's say you have an integer array and a string array. You have to write a single method printArray that can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.

// You are given code in the editor. Complete the code so that it prints the following lines:

// 1
// 2
// 3
// Hello
// World
// Do not use method overloading because your answer will not be accepted.

//**************************************************************************************************************************************************************
//#Hacker Rank #Q31
import java.io.*;
import java.util.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        //upto 4 because after 3 postition , including 4 , 5 only hourglass can be made, draw a matrix with x ,y values you will understand
        int greatest=-100;
        int hourg=0;
       
        for(int x=0;x<4;x++){
            for(int y=0;y<4;y++){
                hourg+=arr.get(x).get(y)+arr.get(x).get(y+1)+arr.get(x).get(y+2);
                hourg+=arr.get(x+1).get(y+1);
                hourg+=arr.get(x+2).get(y)+arr.get(x+2).get(y+1)+arr.get(x+2).get(y+2);
             
                if(hourg>greatest){
                greatest=hourg;
                }
                
                hourg=0;
            }
            
  
            
        }
        System.out.println(greatest);
        bufferedReader.close();
    }
}

//Sample Input
//
//1 1 1 0 0 0
//0 1 0 0 0 0
//1 1 1 0 0 0
//0 0 2 4 4 0
//0 0 0 2 0 0
//0 0 1 2 4 0
//
//Sample Output
//
//19
//
//Question
//You are given a 6*6 2D array. An hourglass in an array is a portion shaped like this:
//
//a b c
//  d
//e f g
//For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:
//
//1 1 1 0 0 0
//0 1 0 0 0 0
//1 1 1 0 0 0
//0 0 0 0 0 0
//0 0 0 0 0 0
//0 0 0 0 0 0
//Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:
//
//1 1 1     1 1 0     1 0 0
//  1         0         0
//1 1 1     1 1 0     1 0 0
//The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.
//
//In this problem you have to print the largest sum among all the hourglasses in the array.
//
//Input Format
//
//There will be exactly  lines, each containing  integers seperated by spaces. Each integer will be between  and  inclusive.
//
//Output Format
//
//Print the answer to this problem on a single line.
//**************************************************************************************************************************************************************
//#Hacker Rank #Q32
mport java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++)
    {
        arr[i] = sc.nextInt();
    }
    int count = 0;

    for(int i=0; i<n; i++)
    {
        int sum = 0;
        for(int j=i; j<n; j++)
        {
            sum = sum + arr[j];
            if(sum<0)
            {
                count++;
            }
        }
    }
    System.out.println(count);
}
}

Sample Input

// 5
// 1 -2 4 -5 1
	
// Sample Output
// 9

// We define the following:

// A subarray of an -element array is an array composed from a contiguous block of the original array's elements. For example, if , then the subarrays are , , , , , and . Something like  would not be a subarray as it's not a contiguous subsection of the original array.
// The sum of an array is the total sum of its elements.
// An array's sum is negative if the total sum of its elements is negative.
// An array's sum is positive if the total sum of its elements is positive.
// Given an array of  integers, find and print its number of negative subarrays on a new line.

// Input Format

// The first line contains a single integer, , denoting the length of array .
// The second line contains  space-separated integers describing each respective element, , in array .

// Constraints

// Output Format

// Print the number of subarrays of  having negative sums.

// Sample Input
// 5
// 1 -2 4 -5 1
	
// Sample Output
// 9
// Explanation

// There are nine negative subarrays of :
// Thus, we print  on a new line.
//**************************************************************************************************************************************************************
//#Hacker Rank #Q32
