class Example1
{
	static int a=10;
	public static void main(String[] args) 
	{
		int a=50;
		Example.a=a;
		System.out.println(a);
		System.out.println(Example.a);
	}
}
