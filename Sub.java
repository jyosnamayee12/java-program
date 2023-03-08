import java.util.Scanner;
class Sub 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the first num:");
		int a=s1.nextInt();
		System.out.println("enter the second num:");
		int b=s1.nextInt();
		int c= a-b;
		String dif="difference of " +a +"-"+ b +"="+ c;
		System.out.println(dif);
		}
}
