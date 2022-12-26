
            /*Write a Java program to  test if a given string contains the specified sequence of char values….match()*/

package examples;

import java.util.Scanner;

public class StringContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Word ");
		String str = sc.nextLine();
		System.out.println("Enter The Second Word ");
		String str1 = sc.nextLine();
		System.out.println("Enter The Third Word ");
		String str2 = sc.nextLine();
		System.out.println("Enter a String To Check Whether Other Strings Contains it : ");
		String str3 = sc.nextLine();
		System.out.println("true if found else false");
		System.out.println("------------------------");
		System.out.println("Checking in First Word: " + str.contains(str3));
		System.out.println("Checking in second Word: " + str1.contains(str3));
		System.out.println("Checking in Third Word: " + str2.contains(str3));
	}
}
