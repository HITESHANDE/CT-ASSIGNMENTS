
              /* Write a Java program to check whether a given string ends with the contents of another string*/
package examples;
import java.util.Scanner;
public class StringEndsWith {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your First Word");
		String first = sc.nextLine();
		System.out.println("Enter Your Second Word");
		String second = sc.nextLine();
		System.out.println("Enter The letters to check whether the given string ends with  thouse letters : ");
		String endstr = sc.nextLine();
		System.out.println(" first string compared with end string : " + first.endsWith(endstr));
		System.out.println(" second string compared with end string : " + second.endsWith(endstr));
	}
}
