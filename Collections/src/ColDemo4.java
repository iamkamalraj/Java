import java.util.*;
public class ColDemo4 {

	public static void main(String[] args) 
	{
		ArrayDeque ad=new ArrayDeque();
		
		ad.add(10);
		ad.add(20);
		ad.add("iNeuron");
		ad.add("Bengaluru");
		
		System.out.println(ad);
		ad.addFirst(100);
		ad.addLast(200);
		ad.add(10);
		
		System.out.println(ad);
	}

}
