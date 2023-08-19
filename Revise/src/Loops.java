public class Loops {
	public static void main(String args[]) {
//		1.while loop
		int x=0;
		while(x<5) {
			System.out.println(x);
			x++;
		}	
//		2.Do while
		int y=0;
		do{
			System.out.println(y);
			y++;
		}while(y<5);
//		3.for loop
		for(int z=0;z<5;z++) 
			System.out.println(z);
//		4.for each loop (Enhanced for loop)
		
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
	}
}