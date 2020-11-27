class A 
{
	static void m1()
	{
		System.out.println("m1");
	}
	static int m2()
	{
		System.out.println("m2");
		return 10;
	}
	static int m3()
	{
		int a=10,b=20,c;
		c=a+b;
		return c;
	}
	public static void main(String[] args) 
	{
		m1();
		m2();
		int x=m2();
		System.out.println(x);
		System.out.println(m2());
		int y=m3();
		System.out.println(y);
		System.out.println(m3());

	}
}
