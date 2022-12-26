package examples;
import java.util.Scanner;
public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner sc=new Scanner(System.in);
	        System.out.println("Enter The Statement To Check Number Of Words:");
	        String str= sc.nextLine();
	        System.out.println("You Entered : "+str);
	        int cnt=1;
	        int ln=str.length();
	        for(int i=0;i<ln;i++)
	        {
	          if(str.charAt(i)==' ')
	          {
	            cnt++;
	          }
	        }
	        System.out.println("The string contains "+cnt+ " words.");
	}

}
