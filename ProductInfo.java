import java.util.Scanner;
class ProductInfo
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Programme To Display Product Information :");
        System.out.println("------------------------------------------");
        System.out.println("Enter The Product_Id");
        int a=sc.nextInt();
        System.out.println("Enter The Product Name");
        String b=sc.next();
        System.out.println("Enter The Product price");
        int c=sc.nextInt();
        System.out.println("Enter The Product Category");
        String d=sc.next();
        System.out.println("Enter The Brand of the Product");
        String e=sc.next();
        System.out.println("\n\nThe Information about the product you entered is :");
        System.out.println("Product_Id :" +a);
        System.out.println("Product Name : " +b);
        System.out.println("Product price is :" +c);
        System.out.println("Product Category is :" +d);
        System.out.println("Product Brand is :" +e);
     }
}