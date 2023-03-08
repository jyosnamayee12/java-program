class A2 
{
	public static void main(String[] args) 
	{
		int a=2,b=5;
		a=a++ + b++ + ++a + ++b;
		System.out.println(a);
		System.out.println(b);
	}
}
