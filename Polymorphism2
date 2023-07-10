
class Plane1
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

class CargoPlane1 extends Plane1
{
	public void fly()
	{
		System.out.println("Cargo plane flies at lower height");
		
	}
	public void takeOff()
	{
		System.out.println("Cargo plane requires longer runway to take off");
	}
	
}
class PassengerPlane extends Plane1
{
	public void fly()
	{
		System.out.println("Passenger plane flies at medium height");
		
	}
	public void takeOff()
	{
		System.out.println("Passenger plane requires medium size runway runway to takeOff");
	}
}
class FighterPlane extends Plane1
{
	public void fly()
	{
		System.out.println("Fighter plane flies at high height");
		
	}
	public void takeOff()
	{
		System.out.println("Fighter plane requires short runway to takeOff");
	}
}

class Airport
{
	public void permit(Plane1 p)
	{
		p.takeOff();
		p.fly();
	}
}



public class LaunchPlane {

	public static void main(String[] args) {
		
		CargoPlane1 cp=new CargoPlane1();
		FighterPlane fp=new FighterPlane();
		PassengerPlane pp=new PassengerPlane();
		
		
		Airport a=new Airport();
		a.permit(cp);
		a.permit(fp);
		a.permit(pp);
		
		
		
		
		/*
		 * Plane1 p; p=cp; p.takeOff(); p.fly();
		 * 
		 * 
		 * p=fp; p.takeOff(); p.fly();
		 * 
		 * p=pp; p.takeOff(); p.fly();
		 */
		
		
		

	}

}
