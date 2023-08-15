eg#1.
class Test{
	int i;
	Test(int i){
			this.i=i;
	}
	public static void main(String[] args){ Test t1=new Test(10);
		Test t2=new Test(100); System.out.println(t1);//Test@....
		System.out.println(t2);//Test@....
	}
}

Object==>toString() called.
Object==>hashCode() called.
In this caseObject class toString( )method got executed which is internally calls 
Object class hashCode( ) method.


eg#2.
class Test{
	int i;
	Test(int i){
		this.i=i;
	}
	public int hashCode(){
		return i;
	}
	public static void main(String[] args){
		Test t1=new Test(10);
		Test t2=new Test(100);
		System.out.println(t1);//Test@A System.out.println(t2);//Test@64
	}
}
Object==>toString() called.
Test ==>hashCode() called.
In this case Object class toString( ) method got executed which is internally calls
Test
class hashCode( ) method.

eg#3.
 
class Test{
	int i;
	Test(int i){
		this.i=i;
	}
	public int hashCode(){ return i;
	}
	public String toString(){ return i+"";
	}
	public static void main(String[] args){ Test t1=new Test(10);
		Test t2=new Test(100);
		System.out.println(t1);//10 System.out.println(t2);//100
	}
}

Output:
10
100
In this case Test class toString() method got executed and hashCode() wont be executed.
