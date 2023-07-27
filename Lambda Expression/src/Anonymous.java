//Anonymous -- One more way of implementing Interface
// This is one more easy approadch insted of classes & objects 
// This is called Anonymous Inter class

class Computer
{
	public void config()
	{
		System.out.println("Ryzen 7 6800H, 16GB, 512GB ");
	}
}

//class Laptop extends Computer
//{
//	public void config()
//	{
//		System.out.println("Ryzen 7 6800H, 16GB, 512GB ");
//	}
//}

//Anonymous A Class which implements the interface or to create the sub class of the Computer 
 
public class Anonymous {

	public static void main(String[] args) {
	
		Computer pc = new Computer()
				{
					public void config()
					{
						System.out.println("Ryzen 7 6800H, 16GB, 512GB ");
					}
				};
				pc.config();

	}

}
