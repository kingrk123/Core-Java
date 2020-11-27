class Example4 
{
	int x=m1();
	int m1()
	{
		System.out.println("NSV x");
		return 50;
	}
	{
		System.out.println("NSB1");
	}
	Example4()
	{
		System.out.println("No-arg constructor");
		x=80;
		y=90;
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
		Example4 e=new Example4();
	}
	{
		System.out.println("NSB2");
	}
	int y=m2();
	int m2()
	{
		System.out.println("NSV y");
		return 60;
	}
}
