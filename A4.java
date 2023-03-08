class A4 
{
	public static void main(String[] args) 
	{
		int a=-2,b=7;
		a=++a + ++b + a++ + a++;
		b=++b + a++ + b++;
		System.out.println(a);
		System.out.println(b);
	}
}
