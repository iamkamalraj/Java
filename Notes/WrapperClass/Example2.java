package WrapperClass;

public class Example2 {
	public static void main(String args[]) {
		//byte(byte,String)
		//short(short,String)
		//int(int,String)
		//long(long,String)
		//float(float,String,double)
		//double(double,String)
		//boolean(boolean,String)
		//char(char)
		//In all wrapper class toString() is overridden to return the content
		
		//Usage of wrapper class =>utility method(helper methods/static methods)
		/*
		usage of wrapper class
		1. valueOf() method (primitive/String to Wrapper)
		We can use the valueOf() method to create a Wrapper object for a given primitive or String.
		ex: Integer i1 = Integer.valueOf("10"); //10
		    Integer i2 = Integer.valueOf(10): //10 
		    
		    we can also use constructor way for making wrapper class like
		    Integer a = new Integer(2);

		2. xxxValue() method (Wrapper/String to Primitive)
		We can use xxxValue() methods to get the primitive for the given Wrapper Object. 
		ex: Character c1 = new Character('c');
		    char c2 = c1.charValue();

		3. parsexxx() method (String to primitive)
		We can use parsexxx() methods to convert String to primitive.
		ex: int i1 = Integer.parseInt("10");
			boolean b1 = Boolean.parseBoolean("TruE");
		 
		4. toString() method (primitive/Wrapper to String)
		We can use the toString() method to convert the Wrapper object or primitive to String. 
		ex: Integer i = Integer.toString(10);
		*/
	}
	
}
