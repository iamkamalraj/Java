import java.util.*;
public class ColDemo7 {

	public static void main(String[] args) {

    HashSet hs=new HashSet();
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);
		System.out.println(hs);
		
		if(hs.contains(50))
		{
			System.out.println("In hashset 50 is present");
		}
		if(!hs.contains(30))
		{
			System.out.println("30 is not present");
		}
    
		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add(100);
		lhs.add(50);
		lhs.add(150);
		lhs.add(25);
		System.out.println(lhs);
    
		}
}
