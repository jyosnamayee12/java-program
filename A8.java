class A8 
{
	public static void main(String[] args) 
	{
		int a=-7,b=-8,c=9;
		a=--a + b-- + c--;
		b=b++ + c-- + a++ + ++a;
		c=a++ + c++ + ++c + b--;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
