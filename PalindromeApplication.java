import java.util.Scanner;
import java.util.Stack;
/**
 * A class that determines if a String is a palindrome.
 * @author Kendall E. Ladrillono
 *
 */
public class PalindromeApplication {

	public static void main(String[] args) {
		
		/**Prompts the user to enter a string. */
		System.out.println("Enter a string: "); 
		/**Instantiates a new scanner. */
		Scanner scan = new Scanner(System.in);
		/**New String object to hold String input. */
		String userString = scan.nextLine();
		/**New Stack object to hold characters. */
		Stack aStack = new Stack();
		/**For loop to iterate through String and push() each character to Stack. */
		for (int i=0; i < userString.length(); i++) 
		{
			aStack.push(userString.charAt(i));
		}// end for
		/**New String object to hold characters. */
		String compareString = "";
		/**While loop to pop() each character from Stack and store in compareString. */
		while(!aStack.isEmpty()) 
		{
			compareString += aStack.pop();
		}// end while
		/**Statement to determine if compareString is equal to userString, qualifying String as a palindrome.
		 */
		if(userString.equals(compareString)) 
		{
			System.out.println("This string is a palindrome.");
		}
		else 
		{
			System.out.println("This string is not a palindrome.");
		}
	}// end main

}// end class
