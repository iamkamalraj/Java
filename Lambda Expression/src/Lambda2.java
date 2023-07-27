interface Tablet
{
	int add (int num1,int num2);
}



public class Lambda2 {

	public static void main(String[] args) {
	
		Tablet tab =  (num1,num2) -> num1 + num2;
		 
		System.out.println(tab.add(1, 4));

	}

}
