class B 
{
	int x=10;
	int y=20;

	void m1()
	{
		System.out.println("In m1 method");
	}
	void printxy()
	{
		System.out.println(x);
		System.out.println(y);

		m1();
	}
	public static void main(String[] args) 
	{
		B a=new B();
		a.m1();
		a.printxy();
}
}