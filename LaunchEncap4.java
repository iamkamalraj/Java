class Alien1
{
	private int age;
	private String name;

	public Alien1(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
  
	/*
	 * public void setAge(int age) { this.age = age; } public void setName(String
	 * name) { this.name = name; }
	 */

	public String getName() 
	{
		return name;
	}
	 public int getAge() 
	 {
			return age;
		}

	







public class LaunchEncap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alien1 a=new Alien1(10, "Telusko");
		
		System.out.println(a.getAge());
		System.out.println(a.getName());
		

	}

}
