import java.util.Scanner;
class Vowel
{
	public static void main(String[] args) 
	{
		System.out.println("enter a alphabet");
		Scanner s1=new Scanner(System.in);
		String s=s1.next();
		char a= s.charAt(0);
		if(a=='a'|| a=='e'|| a=='i' || a=='o' || a=='u')
			{
			System.out.println(a +" is a vowel");
			}
		else{
			System.out.println(a +" is an constant");
			}

		System.out.println(" thank you");
	}


}