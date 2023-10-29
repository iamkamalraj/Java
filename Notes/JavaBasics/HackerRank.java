package JavaBasics;
import java.util.Scanner;

public class HackerRank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
        System.out.println("Calculation Table");
//		int a = sc.nextInt();
//		for (int i = 1; i < 11; i++) {
//			System.out.println(a + " x " + i + " = " + a * i);
//		}
//           
            
//            System.out.println("================================");
//            for(int i=0;i<3;i++)
//            {
//                String s1=sc.next();
//                int x=sc.nextInt();
//                //Complete this line
//                if(x<10 && x>0)
//                	System.out.println(s1+" "+"00"+x);
//                if(x<100 && x>9)
//                	System.out.println(s1+" "+"0"+x);
//                if(x<1000 && x>99)
//                	System.out.println(s1+" "+x);
//            }
//            System.out.println("================================");
	    	
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sol=0;
            for(int i=0;i<c;i++) {
            	int ans=(int) Math.pow(b,i)+sol;
            	System.out.println(a+(b*ans));	
            	sol=sol+ans;
            }      
    }
}

