
public class Problem5 {

	public static void main(String[] args) {
		
		//repeatedly occurring characters in the given String
		
		   String str = "Kamal Raj";
		      char[] carray = str.toCharArray();
		      System.out.println("The string is:" + str);
		      System.out.print("Repeatedly occuring characters in the string are: ");
		      for (int i = 0; i < str.length(); i++) {
		         for (int j = i + 1; j < str.length(); j++) {
		            if (carray[i] == carray[j]) {
		               System.out.print(carray[j] + " ");
		               break;
		            }
		         }
		      }
		   }
	
		}