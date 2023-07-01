class Calculator{

	public int add(int num1, int num2)
	{
		int result = num1+num2;
		return result;
	}
}

public class Delegate {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		
		Calculator calc= new Calculator();
		
		int result = calc.add(num1,num2);	//delegate

		System.out.println(result);
	}

}
