package Project;
import java.util.*;

public class BoomrSaqib {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First value");
		int a = sc.nextInt();
		System.out.println("Enter the Second value");
		int b = sc.nextInt();
		System.out.println("Enter the Third value");
		int c = sc.nextInt();
		for(int i=0; i<c; i++) {
			int res =a+b*(int) Math.pow(b, i);
			System.out.println(res);
		}
	}
}
