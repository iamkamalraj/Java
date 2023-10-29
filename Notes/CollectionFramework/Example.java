package CollectionFramework;
import java.util.*;
public class Example {
//	Array is used to store the data but it has 3 main drawbacks
//	1.it can store only homogeneous datas that is if int means every data should be int only
//	2.fixed array size only
//	3.it can store contiguous memory only
//	The biggest advantage is It is very fast and can store large amount of data 
//	To overcome these disadvantages java came up with legacy classes but it was also not feasible
//  That is when 7 Collections came ...
//  arraylist,linkedlist,arraydeque,priorityqueue,treeset,hashset,linkedhashset
//  this all classes are inside of java.util.***********
	public static void main (String args[]) {
		ArrayList a = new ArrayList();
		a.add(67);
		a.add("lol");
		a.add('h');
		System.out.println(a);
		//it can store mixed (heterogeneous) type of data , dynamically growing at the rear end , taking input as object
		//it solves 2problems but unfortunately it stores contiguous memory location
		//it can retain order of insertion , which is when you add two arraylist it will be in order only.... there are many methods
		
		//when to use array over arraylist
		//1.array is faster and more effecient than arraylist
		//2.when the size od data is known 
		//3.when the data is of homogeneous type
		//4.when data is primitive or object
		
		//index based inserion is allowed in arraylist but not recommended because it is time consuming
		// shifting will happen one by one... the time complexity will go big (n)
		
		LinkedList l = new LinkedList();
		l.add(67);
		l.add("lol");
		l.add('h');
		System.out.println(l);
		//LinkedList is of 3types single,doubly.circular... but java uses doubly linkedlist
		//here also have all advantages of arraylit and here index based insertion is recommended because shifting not take place here
		//we can add directly in front end , middle and back end also
		// it also has a offer method which is just like add but it can may or maynot add to the collection, if the memory is not available then it will not add
		
		ArrayDeque ad = new ArrayDeque();
		ad.add(67);
		ad.add(98);
		ad.add(69);
		System.out.println(ad);
		//it is double ended data structure where insertion can be done in the front end and the back end but not n the middle end
		//that is index based insertion is not allowed
		
		PriorityQueue p = new PriorityQueue();
		p.add(89);
		p.add(56);
		p.add(34);
		p.add(432);
		System.out.println(p);
		//it follows minheap datastructure... data will stored in following way
		//   89  =>   56   =>   34      => the output will 0th level , 1st level , 2nd level => 34,89,56,432
		// 56       89  34    89  56
		//                  432
		//duplicates are allowed but not recommended
		
		TreeSet t = new TreeSet();
		t.add(89);
		t.add(56);
		t.add(34);
		t.add(432);
		t.add(432);
		System.out.println(t);
		System.out.println(t.ceiling(34));
		System.out.println(t.higher(34));
		System.out.println(t.floor(89));
		System.out.println(t.lower(89));
		//it follows binary search tree data structure that is it will be stored in ascending order
		//it uses in order traversal which is lvr(left value right)
		//if the tree is balanced binary search tree then treeset is used
		//if the tree is skewed tree then the search is O(n) eg: 10,20,30,40,50
		//higher means will give the next highest value of the given value
		//ceiling means it will check if the given value is present in the collection mean it will return the same else it will give the next highest value
		//lower means will give the next lowest value of the given value
		//floor means it will check if the given value is present in the collection means it will return the same else it will give the next lowest value
		//null value and duplicates are not allowed 
		
		HashSet h = new HashSet();
		h.add(89);
		h.add(56);
		h.add(34);
		h.add(432);
		System.out.println(h);
		//hashset and linkedhashset internally follows hash table
		//in hash table each location(bucket) will have only one data
		//searching is very fast.. time complexity is O(1)
		
		LinkedHashSet lh = new LinkedHashSet();
		lh.add(89);
		lh.add(56);
		lh.add(34);
		lh.add(432);
		System.out.println(lh);
		//order of insertion is maintained , this is the only diffrence between hashset(jdk1.2) and linkedhashset(jdk1.4)
		
		
		
		//for displaying the data
		LinkedList ll = new LinkedList();
		ll.add(34);
		ll.add("Shafwan");
		ll.add('s');
		ll.add(true);
		ll.add(23);
		//using for loop , we can't use this way because the data is of object type...so for loop can't be used
		for(int i=0;i<ll.size();i++)
			System.out.println(ll.get(i));
		System.out.println("--------------------------	");
		//enhanced for loop (for each loop) , we can use but it's not recommended
		for(Object o:ll)
			System.out.println(o);
		System.out.println("---------------------------");
		//iterator , this iterator class is recommended for displaying the data
		Iterator i = ll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("----------------------------");
		ListIterator it = ll.listIterator(ll.size());
		while(it.hasPrevious()) 
			System.out.println(it.previous());
		//iterator class presents in all 7 collection classes...but some collection classes will have some extra methods of Iterator
		//like descending Iterator is there in Linkedlist but not in Arraylist
		System.out.println("-----------------------------");
		Iterator itt = ll.descendingIterator();
		while(itt.hasNext())
			System.out.println(itt.next());
		//works just like ListIterator , but when we need to perform like this in ArrayList we need to go with ListIterator only
			
		//Structural Modification => while accessing the data , we're attempting to modify it
		//inside the loop body after display , if we try to add means
//		for(Object o:ll) {
//			System.out.println(o);
//			ll.add(1);              // it will throw error     //it's a fail fast
//		}
//		System.out.println("---------------------------");
		
		
		
		//before java 1.2 there was no collections... so for array problems java gave solutions using vector,stack,dictionary 	 	
		//these things are called as legacy classes and it comes under Enumeration interface (like iterable interface for collections)
		//these classes are synchronize , that means multithreading cannot be used
		
	}
	
}
