package CollectionFramework;

import java.util.*;
public class TreeSet23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet ts=new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(26);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		
		System.out.println(ts);
		
		System.out.println(ts.higher(25));
		System.out.println(ts.ceiling(25));
		
		TreeSet ts1=new TreeSet();
		
		ts1.add(35);
		ts1.add(40);
		ts1.add(42);
		ts1.add(20);
		ts1.add(15);
		ts1.add(75);
		ts1.add(null);
		System.out.println(ts1);
		
		
		System.out.println(ts1.higher(20));
		System.out.println(ts1.ceiling(34));
		
		
		System.out.println(ts1.floor(30));
		System.out.println(ts1.lower(30));
		
		
	}

}