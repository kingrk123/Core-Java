class Example2 
{
	static int a=10;
	static int b=20;

	int x=30;
	int y=40;

	public static void main(String[] args) 
	{
		System.out.println("a:	"+a);
		System.out.println("b:	"+b);

		System.out.println("a:	"+Example2.a);
		System.out.println("b:	"+Example2.b);

		Example2 e=new Example2();
		System.out.println("x:	"+e.x);
		System.out.println("y:	"+e.y);

		System.out.println("a:	"+e.a);
		System.out.println("b:	"+e.b);

		//System.out.println("x:	"+Example2.x);
		//System.out.println("y:	"+Example2.y);

		Example2 e1=null;
		System.out.println(e1.a);
		System.out.println(e1.x);
	}
}
