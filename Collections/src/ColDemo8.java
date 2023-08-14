import java.util.*;
public class ColDemo8 
{

	public static void main(String[] args) 
	{
		
		List l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		System.out.println(l);
		
		for(int i=0; i<=l.size()-1;i++)
		{
			System.out.println(l.get(i));
		}
		System.out.println("**************************");
		//enhanced for loop - for-each
		
		for(Object o:l)
		{
			System.out.println(o);
		}
		
		System.out.println("*************************");
		
		LinkedList ll=new LinkedList();
		ll.add(100);
		ll.add(200);
		ll.add("iNeuron");
		ll.add("bengaluru");
		
		//Iterator itr1=ll.iterator();
		
		//while(itr1.hasNext())
		//{
			//LinkedList ll1=(LinkedList) itr1.next();
		//}
		
				
		System.out.println("********Listiterator****************");
		
		LinkedList ll2=new LinkedList();
		ll2.add(100);
		ll2.add(200);
		ll2.add("iNeuron");
		ll2.add("bengaluru");
		
		ListIterator litr=ll2.listIterator(ll2.size());
		
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
		LinkedList ll3=new LinkedList();
		ll3.add(100);
		ll3.add(200);
		ll3.add("iNeuron");
		ll3.add("bengaluru");
		
		System.out.println("******DITR*******");
		
		Iterator ditr=ll3.descendingIterator();
		
		while(ditr.hasNext())
		{
			System.out.println(ditr.next());
		}
			
	}

}
