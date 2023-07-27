
@FunctionalInterface		//Whenever we are implementing Functional Interface we should use this in the top of the method
interface Demo
{
	void disp();		//If single method is called functional method //It is abstract method
				//One abstract method / Single Abstract Method (SAM) 
				//Functional Interface -- class -- ananumous inner class lambda expression
				//Implementaion of Functional Interface(Body) in Lambda Expression
}

class Alpha implements Demo
{
	public void disp()
	{
		System.out.println("I have given body");
	}
}


public class functionalInter {

	public static void main(String[] args) {
		
          Demo d=new Alpha();
          d.disp();

	}

}
