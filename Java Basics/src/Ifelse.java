
public class Ifelse {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int num1 = 55;
        int num2= 0;
        int num3= 0; 

        if(num1>num2 && num1>num3 ) 
        {
        	if(num2==0 && num3==0) { 			//Nested loops
        		System.out.println("Get Lost");
        		}
            System.out.println("Num1 is Correct");
            System.out.println(num1);
        }
        else if (num2>num1 && num2>num3) {
        	
            System.out.println("Correct 2");
            System.out.println(num2);

        } else
        {
            System.out.println(num3);
            System.out.println("Correct 3");
        }
    }

}
