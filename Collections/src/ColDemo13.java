
import java.util.*;

class ColDemo13
{
public static void main(String[] args) throws Exception
	{
		HashMap hm = new HashMap();
		Temp t= new Temp(); hm.put(t,"shri");
		 
		System.out.println(hm);//{temp=shri}
		
		t= null;//Making eligible for Garbage Collection
		System.gc();//Triggering garbage collector thread to clean 't' 
		Thread.sleep(5000);
		
		System.out.println(hm);//{temp=shri}
	
	}
}

class Temp
{
	@Override
	public String toString(){
	return "temp";
	}
	
	@Override
	public void finalize(){ System.out.println("cleaning temp object");
	}
}


//eg#2.
//import java.util.*;
//
//class Test
//{
//	public static void main(String[] args) throws Exception
//	{
//		WeakHashMap hm = new WeakHashMap();
//		Temp t= new Temp();
//		hm.put(t,"shri");
//		System.out.println(hm);//{temp=shri}
//		
//		t= null;//Making eligible for Garbage Collection
//		System.gc();//Triggering garbage collector thread to clean 't'
//		Thread.sleep(5000);
//		
//		System.out.println(hm);//{}
//		
//	}
//}
//class Temp
//{
//		@Override
//		public String toString(){
//		return "temp";
//		}
//		
//		@Override
//		public void finalize(){ System.out.println("cleaning temp object");
//	}
//}
//
//
