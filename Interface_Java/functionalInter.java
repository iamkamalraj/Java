
@FunctionalInterface
interface Demo
{
	void disp();
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
