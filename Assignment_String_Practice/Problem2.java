
public class Problem2 {

	public static void main(String[] args) {
		
		// Input "Think Twice"
		// Output knihT eciwT
				
		
		String s1="Think Twice";
		String s2=""; 
		
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			s2=s2+s1.charAt(i);
		}
		
		String s3=s2;
		String s4="";
		
		String a[]=s3.split(" ");
		
		for(int i=a.length-1;i>=0;i--)
		{
			s4=s4+a[i]+ " ";
		}
		System.out.println(s4);
		
		
		
		
	}

}
