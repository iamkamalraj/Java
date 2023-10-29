package CollectionFramework;

import java.util.*;
public class LinkedList23{

	public static void main(String[] args) 
	{
		LinkedList ll1=new LinkedList();
		
		ll1.add(28);
		ll1.add("Hyder");
		ll1.add('M');
		ll1.add("Bengaluru");
		
	    System.out.println(ll1);
	    
	    ll1.add(3, 70);
	    
	    System.out.println(ll1);
	    
	    ll1.addFirst("iNeuron");
	    ll1.addLast(100);
	    
	    System.out.println(ll1);
	    
	    LinkedList ll2=new LinkedList();
	    ll2.add("India");
	    ll2.offer("Bengaluru");
	    ll2.add("India");
	    
	    System.out.println(ll2);
	  
	    
	    
	    
	    
		
		

	}

}
