package WrapperClass;

public class Example3 {
	//After java 1.5
	/*AutoUnBoxing=>Automatic conversion of Wrapper type to primitive type done by the compiler (intValue())
	 Ex: Integer I = new Integer(10);
	     int i2 = i1;
	  AutoBoxing=>Automatic conversion of primitive type to Wrapper type done by the compiler (valueOf())
 	 Ex: Integer I=10;
	 
	 */
	public static void main(String args[]) {
		Integer a=new Integer(10);
		Integer b = new Integer(10);
		System.out.println(a==b);
		System.out.println(a.equals(b));
	}
}
 