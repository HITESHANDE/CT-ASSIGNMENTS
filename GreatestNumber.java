import java.util.Scanner;
class GreatestNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("To Check whether a Number Is Greater or not");
		System.out.println("-------------------------------------------");
		System.out.println("Enter The First Number\n");
		int a=sc.nextInt();
		System.out.println("Enter The Second Number\n");
		int b=sc.nextInt();
		System.out.println("Enter The Third Number\n");
		int c=sc.nextInt();
		if (a>b && a>c) 
		{
		  System.out.println(a +" is Greater");	
		}
		else if (b>a && b>c) {
		  System.out.println(b +" is Greater");
		}
		else
		{
			System.out.println(c +" is Greater");
		}
	}
}