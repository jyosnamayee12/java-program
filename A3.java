class A3 
{
	public static void main(String[] args) 
	{
		int a=4,b=2;
		b= a++ + ++b + ++a;
		System.out.println(a);
		System.out.println(b);
	}
}
