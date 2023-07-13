
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int digits[]= {5,6,7,8,9};
//		System.out.println(digits[2]); //opt is 7 for [2]. Array Stars from 0 so  0123
//		
//		System.out.println(digits[10]); // Error! ArrayINdexOutOfBoundException
				
//		int nums[]=new int[6]; // Specifying the size of the array 
//		
//		System.out.println(nums[4]); //Ans is 0 Because By Default integer value is 0 
//	
		
		//{5,6,7,8,9}
//		int nums[] = new int[5];
//		 nums[0]=5;					//Assigning Values to array
//		 nums[1]=6;
//		 nums[2]=7;
//		 nums[3]=8;
//		 nums[4]=9;
		 
//		 System.out.println(nums[0]); //8
//		 System.out.println(nums[1]);
//		 System.out.println(nums[2]);
//		 System.out.println(nums[3]);
		 
//		for(int i=0; i<5; i++) {
//			System.out.println(nums[i]);

		int nums[][] = new int[3][2];
		 nums[0][0]=5;					//Assigning Values to array
		 nums[0][1]=6;
		 nums[1][0]=7;
		 nums[1][1]=8;
		 nums[2][0]=9;
		
		
		
		 for(int  i=0; i<3; i++)
		 {
			 for(int j=0; j<2; j++)
			 {
					 
			 System.out.print(nums[i][j]+" "); //Enhanced for loops
		 }
			 System.out.println();
		}
		 
	}
	}
	

