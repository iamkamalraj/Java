class Fan
{
	private int cost;
	private String brand;
	
	public void setCost(int cost)
	{
		this.cost=cost;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	
	public int getCost()
	{
		return cost;
	}
	public String getBrand()
	{
		return brand;
	}
}



public class LaunchEncap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fan f1=new Fan();
		f1.setCost(1000);
		
		f1.setBrand("Bajaj");
		System.out.println(f1.getCost());
		System.out.println(f1.getBrand());
		
	}

}
