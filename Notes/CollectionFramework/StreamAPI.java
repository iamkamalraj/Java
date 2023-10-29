package CollectionFramework;
import java.util.*;

public class StreamAPI {
	public static void main (String args[]) {
		//in a list , should take even numbers then multiplied by 2 and add all
		//using normal loops and conditionals
		List<Integer> num = Arrays.asList(2,3,9,4,7,5,6);
//		int sum=0;
//		for(int i:num) {
//			if(i%2==0) {
//				i=i*2;
//				sum=sum+i;
//			}
//		}
//		System.out.println(sum);
		
		//using Stream API 
		int result= num.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(s,e)->s+e);
		System.out.println(result);
	}
}
