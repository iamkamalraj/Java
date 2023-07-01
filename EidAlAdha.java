
public class EidAlAdha {

	public static void main(String[] args) {
		
				
		int n=5;
		
		System.out.println(" \n Wishing \t u \t *Shafaan* \t a \tVery \t Happy \n");
		for (int i=0;i<n;i++)
		{
			for(int j=0; j<n; j++)
			{
				if( j==0 || i==0 || i==n-1 || i==(n/2) )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("    ");
			for(int j=0; j<n; j++)
			{
				if( j==0 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("");
			for(int j=0; j<n; j++)
			{
				if( j==0 || i==0&&j!=n-1 || i==n-1&&j!=n-1 || j==n-1&&i!=n-1&&i!=0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
									
			System.out.print("         ");
			for(int j=0; j<n; j++)
			{
				if( j==0 && i!=0 || i==0 && j!=0 && j!= n-1 || i==(n-1)/2 || j==n-1 && i!=0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("     ");
			for(int j=0; j<n; j++)
			{
				if( j==0 || i==n-1 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("         ");
			for(int j=0; j<n; j++)
			{
				if( j==0 && i!=0 || i==0 && j!=0 && j!= n-1 || i==(n-1)/2 || j==n-1 && i!=0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("    ");
			for(int j=0; j<n; j++)
			{
				if( j==0 || i==0&&j!=n-1 || i==n-1&&j!=n-1 || j==n-1&&i!=n-1&&i!=0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("    ");
			for(int j=0; j<n; j++)
			{
				if( j==0 || j==n-1 || i==n/2  )
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			
			
			System.out.print("    ");
			for(int j=0; j<n; j++)
			{
				if( j==0 && i!=0 || i==0 && j!=0 && j!= n-1 || i==(n-1)/2 || j==n-1 && i!=0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
						
					
					System.out.println();
		}
	}
}