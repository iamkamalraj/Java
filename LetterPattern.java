//
//public class LetterPattern {
//
//	public static void main(String[] args) {
//	
//		int n=5;
//		
//		for(int j=0; j<n; j++)
//		{
//			for (int i=0; i<n; i++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//
//	}
//
//}
 
public class LetterPattern {

	public static void main(String[] args) {
	
		int n=8;
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if (i==j || i+j==n-1 )
				System.out.print("*");
				else
					System.out.print(" ");
			}
				System.out.println();
			}
		
		}
}

	
