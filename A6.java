class A6 
{
	public static void main(String[] args) 
	{
		int a=-2,b=3,c=4;
		a=a++ + --b + b++ +c++;
		b=c++ + b++ + a++;
		c=--c + ++a + b++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
