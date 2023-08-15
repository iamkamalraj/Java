import java.util.*;
class Test
{
	public static void main(String[] args) throws Exception
	{
		Employee e = new Employee();
		;;;;;;;;
		;;;;;;;;
		;;;;;;;;
		
		e = null;//Garbage object
		System.gc();//Informing JVM to active GC thread to clean garbage object
		Thread.sleep(5000);
	}
}

class Employee
{
	@Override
	public void finalize(){
		System.out.println("Cleaning the object");
	}
}
