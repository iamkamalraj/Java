import java.util.Scanner;
public class Problem6 {

	public static void main(String[] args) {
		
		//Sort a String Alphabetically
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string:");
        String userInput = scan.nextLine();

        char[] charArray = userInput.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (Character.toLowerCase(charArray[j]) < Character.toLowerCase(charArray[i])) {
                    swapChars(i, j, charArray);
                }
            }
        }

        System.out.println("Sorted string " + String.valueOf(charArray));
    }


private static void swapChars(int i, int j, char[] charArray) {
    char temp = charArray[i];
    charArray[i] = charArray[j];
    charArray[j] = temp;
}

}
