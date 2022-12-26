   
                       /*Write a Java program to get the character at the given index within the String.*/
package examples;

import java.util.Scanner;

public class Indexcharacter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Programme To Get Character At The Given Index Number ");
		System.out.println("-----------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a Word ");
		String word = sc.nextLine();
		System.out.println("Enter The Index Position To Get The Character At That Position : ");
		int pos = sc.nextInt();
		if (pos >= 0 && pos < word.length()) {
			System.out.println(word.charAt(pos));
		} else {
			System.out.println("The Word Has Only " + word.length() + " Characters ");
		}
	}
}
