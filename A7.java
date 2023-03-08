class A7 
{
	public static void main(String[] args) 
	{
		int a=5,b=6,c=10;
		a=c-- + b++ + --c + ++a;
		b=++c +  a++ + ++b + b--;
		c=a-- + b-- + ++c + ++b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
