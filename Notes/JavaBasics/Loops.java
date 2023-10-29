package JavaBasics;

public class Loops {
	public static void main(String args[]) {
//		1.while loop
		int x=5;
		while(x<5) {
			System.out.println(x);
			x++;
		}
		
//		2.Do while
		int y=5;
		do{
			System.out.println(y); 
			y++;  
		}while(y<5);
		
//		3.for loop
		for(int z=0;z<5;z++) 
			System.out.println(z);
//		4.for each loop (Enhanced for loop)
		int []q = {10,20,30,40,50};
		for(int i=0;i<q.length;i++) {
			System.out.print(q[i]+" ");
		}
		//for the above code we need to convert into for each loop
		int []q1 = {10,20,30,40,50};
		for(int j:q1) {
			System.out.println(j+" ");
		}
//		5.Star Box
		int n=7;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||j==0||i==n-1||j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.println();
		}
//		6.break and continue
		for(int f=0;f<8;f++) {
			if(f==3)
				continue;
			if(f==6)
				break;
			System.out.println(f);
		}
		
		
		
		int a = 6;
		while (a<6) {
			System.out.println("Ok fine"); //
			a++;
		}
		
		int b = 6;
		do {
			System.out.println("Ok fine"); //ok fine
			b++;
		}while (b<6);
		
		for(int i=5;i<0;i--) {
			System.out.println(i);
		}
		
		int r[]= {0,1,2,3,4,5};
		for(int s: r) {
			System.out.println();
		}
	
		for(int i=0;i<10;i++) {
			if(i==3)
				break;
			System.out.println("food");
			if(i==0)
				continue;
			System.out.println("shelter");
		}
		
		
		
		
	}
}
