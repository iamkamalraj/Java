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
