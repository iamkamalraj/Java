class Alien
{
	private int age;
	private String name;
	
	public void setAge(int x)
	{
		age=x;
	}
	public void setName(String x)
	{
		name=x;
	}
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	
}



public class LaunchEncap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alien a=new Alien();
		//a.age=-10;
		a.setAge(-10);
		System.out.println(a.getAge());
		System.out.println(a.getName());

	}

}
