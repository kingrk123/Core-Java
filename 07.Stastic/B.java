class B 
{
	static int a=10;
	static int b=20;
	public static void main(String[] args) 
	{
		System.out.println(a);//10
		System.out.println(b);//20
		int a=50;
		System.out.println(a);//50
		//System.out.println(Example.a);
		System.out.println(B.a);//10
		System.out.println(b);//20
		//System.out.println(Example.b);
		System.out.println(B.b);//20
	}
}