
class Alien4
{
	private int age;
	private String name;
	
	public Alien4(int age, String name)
	{
		this();
		this.age=age;
		this.name=name;
	}
	public Alien4()
	{
		age=28;
		name="Hyder";
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}
public class LaunchC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alien4 a1=new Alien4(10, "Telusko");
		System.out.println(a1.getAge());
		System.out.println(a1.getName());
		
		Alien4 a2=new Alien4();
		System.out.println(a2.getAge());
		System.out.println(a2.getName());

	}

}
