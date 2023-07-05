class Alien5
{
   private int age;
   private String name;
   
   public int getAge() {
	return age;
}
public String getName() {
	return name;
}
public Alien5()
   {
	   this(10, "Telusko");
   }
   public Alien5(int age, String name)
   {
	   this.age=age;
	   this.name=name;
   }
   public Alien5(int age)
   {
	   this();
	   this.age=age;
   }
}
public class LaunchCT {

	public static void main(String[] args) {
		Alien5 a1=new Alien5();
		System.out.println(a1.getAge());
		System.out.println(a1.getName());
		
		Alien5 a2=new Alien5(20);
		System.out.println(a2.getAge());
		System.out.println(a2.getName());

	}

}
