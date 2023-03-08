import java.util.Scanner;
class Div 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter a num");
		int a=s1.nextInt();
		System.out.println("enter another num");
		int b=s1.nextInt();
		int c=a/b;
		String s2="division of " +a +" / " +b +" = " +c;
		System.out.println(s2);

	}
}
