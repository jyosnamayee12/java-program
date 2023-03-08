import java.util.Scanner;
class Sum 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a num1");
		int a = scn.nextInt();
		System.out.println("enter a num2");
		int b = scn.nextInt();
		int sum=a+b;
		//System.out.println(sum);
		//String res="sum of" + a+"+"+b+"="+sum;
		//System.out.println(res);
		System.out.println("sum of" + a+"+"+b+"="+sum);
	}
}
