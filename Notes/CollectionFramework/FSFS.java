package CollectionFramework;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class FSFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		/*
		 * for(int i=0; i<al.size();i++) { System.out.println(al.get(i)); al.add(99);
		 * 
		 * }
		 */
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			//al.add(99);
		}
		
		CopyOnWriteArrayList cal= new CopyOnWriteArrayList();
		cal.add(100);
		cal.add(200);
		cal.add(300);
		Iterator itr1=cal.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
			cal.add(420);
		}

	}

}