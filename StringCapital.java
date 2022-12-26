                           /*  Print the capital letters from string */
package examples;
import java.util.Scanner;
public class StringCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Scanner sc=new Scanner(System.in);
	            System.out.println("Enter a Statement :" );
	            String word=sc.nextLine();
	            System.out.println("ALL The Capital Letters In The Statement Are :");
	            System.out.println("----------------------------------------------");
	            int len=word.length();
	            for (int i = 0; i < len; i++) 
	            {
				     if(Character.isUpperCase(word.charAt(i)))
				     {
				    	 System.out.println(word.charAt(i));
				     }
				}
	}

}
