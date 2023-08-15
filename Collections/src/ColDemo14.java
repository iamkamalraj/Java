import java.util.*;

class Test
{
	public static void main(String[] args)
	{
		Hashtable hm = new Hashtable();//Default capacity is 11 hm.put(new Temp(5),"A");
		hm.put(new Temp(2),"B");
		hm.put(new Temp(6),"C");
		hm.put(new Temp(15),"D");
		hm.put(new Temp(23),"E");
		hm.put(new Temp(16),"f");
		
		System.out.println(hm);
	}
}
class Temp
{
		int i;
		Temp(int i){
			this.i=i;
		}
		public int hashCode(){
			return i;
		}
		
		public String toString(){
			return i+" " ;
	}
}

Note;
public class ColDemo14{
	public native int hashCode();//Code is not from java language it will binded during runtime
		
		@Override
		public String toString(){
		return getClass().getName()+ "@" +
		 
		Integer.toHexString(hashCode());
		}
	}

eg#1.
class Test{
	@Override
	public int hashcode(){
		return 10;
}
}
Test t1= new Test();//Test@A Test t2= new Test();//Test@A

class Student{
	int rollNo; Student(int rollNo){
		this.rollNo = rollNo;
	}
	@Override
	public int hashCode(){
		return rollNo;
	}
}
Student std1= new Student(10);//Student@A 
Student std2= new Student(100);//Student@64

*****************************************************
Example1:
class Student {
	public int hashCode()
	{
		return 100;
	}
}
 
//It is improper way of overriding hashCode() method because for every object we are generating same
hashcode.

Example2:
class Student {
	int rollno;
	public int hashCode() {
		return rollno;
	}
}
*****************************************************



