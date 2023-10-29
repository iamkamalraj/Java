package OOPS;

class Fan{
	private int cost;
	private String Brand;
	
	public int getCost() {
		return cost;
	}
	public String getBrand() {
		return Brand;
	}
		public void setCost(int cost) {
		this.cost = cost;
	}
	public void setBrand(String Brand) {
		Brand = Brand;
	}
//	Fan(int cost,String Brand){         // -
//		this.cost=cost;                 //  |  Enhanced setter => Constructor
//		this.Brand = Brand;             // -
//	}
	
}
public class Encapsulation6 {
	public static void main(String args[]) {
		
		Fan f = new Fan();                     
//		f.setCost(5000);                        |
//		f.setBrand("Bajaj");                    |    for normal setters
//		System.out.println(f.getCost());        |
//		System.out.println(f.getBrand());      -
		
		Bank b = new Bank("A");
//		System.out.println(b.name);
		System.out.println(b.getName());
		
//		b.name="lol";
//		System.out.println(b.name);
//		b.setName("AYAAN");
//		System.out.println(b.getName());
//		b.setName("23");  //numbers cannot be someone's name. so we are setting conditions on setter
//		System.out.println(b.getName());
		
	
//		Fan f = new Fan(5000,"Bajaj");
//		System.out.println(f.getCost());
//		System.out.println(f.getBrand());
//		
//		
//		Shafwan s1 = new Shafwan();
//		System.out.println(s1.getAge());
//		System.out.println(s1.getName());
//		Shafwan s2 = new Shafwan(10);
//		System.out.println(s2.getAge());
//		System.out.println(s2.getName());
		
	}
}
	
	class Bank{                 
		private String name;
//		public void setName(String x) {
//			if(x=="AYAAN")
//				name=x;
//		}
		Bank(String x){
			if(x=="AYAAN")
				name=x;
			else
				System.out.println("Invalid");
		}
		
		public String getName() {
			return name;
		}
	}
	




class Shafwan{
	int age;
	String name;
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public Shafwan() { //3                              //1
		this(23,"Shaf");  //4                           //2
	}
	public Shafwan(int age, String name) {  //5          //3
		this.age=age;   //6 23                           //4 23
		this.name=name; //7 shaf                         //5 shaf
	}
	public Shafwan(int age) {   //1
		this();  //2
		this.age=age; //8  10
 	}
}
