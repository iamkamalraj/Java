package OOPS;

public class StringConcepts5 {
	public static void main(String args[]) {
		
//		There are two types of Strings
//		1.immutable(unchangeable) => String
//		2.mutable(changeable) => StringBuffer , StringBuilder 
//		
//		immutable string can be written in two ways
//		String lol = "shaf";  ==> the memory will be stored in scp[a area inside heap] (no duplicates)
//		String lol = new String("shaf"); ==> stored in heap area (dupicates are acceptable)
		
//		different ways to compare Strings
//		1.== , 2.equals() , 3.equalsIgnoreCase() , 4.compareTo()
		
		String s1 = "Hello";
		String s2 = "Hello";
//		System.out.println(s1.substring(0,4));
		String s3 = new String("Hello");
		String s4 = new String("hello");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.compareTo(s2));
		
//		some more inbuilt methods are like concat,toUpperCase,toLowerCase,charAt,substring,reverse,length,startsWIth,endsWith
	}
}

