
class Beta2
{
	void disp()
	{
		try
		{
		System.out.println("Disp method");
		System.exit(0);
		}
		finally
		{
		   System.out.println("Finally");
		}
	}
}


public class LaunchE12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Beta2 b=new Beta2();
		b.disp();

	}

}
