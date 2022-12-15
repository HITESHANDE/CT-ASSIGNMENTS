import java.util.Scanner;
class Math
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Programe to find Sum and Average of Given 5 Numbers :");
        System.out.println("---------------------------------------------------");
        System.out.println("Enter The First Number :");
        int a=sc.nextInt();
        System.out.println("Enter The Second Number :");
        int b=sc.nextInt();
        System.out.println("Enter The Third Number :");
        int c=sc.nextInt();
        System.out.println("Enter The Fourth Number :");
        int d=sc.nextInt();
        System.out.println("Enter The Fifth Number :");
        int e=sc.nextInt();
        int f=(a+b+c+d+e);
        int g=(f/5);
        System.out.println("Sum Of Given Numbers is : "+f);
        System.out.println("Average of Given Numbers is : "+g);
    }
}