package examples;

import java.util.Scanner;

public class EachWordCapital {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a statement with starting letters of each word as small : ");
		System.out.println("----------------------------------------------------------------");
		String message = sc.nextLine();
		// convert String char array
		char[] charArray = message.toCharArray();
		boolean foundSpace = true;

		for (int i = 0; i < charArray.length; i++) {

			// if the array element is a letter
			if (Character.isLetter(charArray[i])) {

				// checks for the space
				if (foundSpace) {

					// change the letter into uppercase
					charArray[i] = Character.toUpperCase(charArray[i]);
					foundSpace = false;
				}
			}

			else {
				// if the new character is not character
				foundSpace = true;
			}
		}
		System.out.println("The statement After Converting letters of each word as Capital is: ");
		System.out.println("-------------------------------------------------------------------");
		// convert the char array to the string
		message = String.valueOf(charArray);
		System.out.println(message);
		// we can also call like this
		/*
		 * String str=new String(charArray); System.out.println(str);
		 */
	}

}
