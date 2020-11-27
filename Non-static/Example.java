class Example 
{
	int x=10;
	int y=20;

	void m1(int p)
	{
		System.out.println("Passed value"+p);
		p=50;
		System.out.println("Modified Value"+p);
	}
	void m2(Example e)
	{
		System.out.println("Passed object original value");
		System.out.println(e.x+".."+e.y);
		e.x=5;
		e.y=6;
		System.out.println("Object values after modified");
		System.out.println(e.x+".."+e.y);
	}
	public static void main(String[] args) 
	{
		Example e1=new Example();
		int q=20;
		System.out.println("q value before calling m1() method"+q);
		e1.m1(q);
		System.out.println("q value after calling m1() method"+q);

		System.out.println("=====================");
		Example e2=new Example();
		System.out.println("e2 value before calling m2() method");
		System.out.println(e2.x+".."+e2.y);
		//e1.m1(e2);
		System.out.println("q value after calling m2() method");
		System.out.println(e2.x+".."+e2.y);

	}
}
