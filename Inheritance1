class Plane
{
	public void fly()
	{
		System.out.println("Plane is flying");
	}
	public void takeOff()
	{
		System.out.println("Plane is taking off");
	}
}

class CargoPlane extends Plane
{
	public void fly()
	{
		System.out.println("Cargo plane flies at lower height");
		
	}
	public void carryGoods()
	{
		System.out.println("Cargo plane carry goods");
	}
	
}
class PassengerPlane extends Plane
{
	public void fly()
	{
		System.out.println("passenger plane flies at medium height");
		
	}
	public void carryPassenger()
	{
		System.out.println("Passenger plane carry passenger");
	}
}


public class LaunchInheri {

	public static void main(String[] args) {
		
       Plane cp=new CargoPlane();
       cp.fly();
       cp.takeOff();
       //cp.carryGoods();
       ((CargoPlane) cp).carryGoods();
       
       Plane pp=new PassengerPlane();
       pp.fly();
       pp.takeOff();

	}

}
