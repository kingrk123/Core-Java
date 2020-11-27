class  DemoProgram
{
	static void m1()
	{
		System.out.println("m1 Function");
		m2();								 //Calling m2 Function
	}
	static void m2()
	{
		System.out.println("m2 Function");
	}
	public static void main(String[] args) 
	{ 
		{
			System.out.println("Block");
		}
		System.out.println("main");
		m1();							//Calling m1 Function
		
	}
}
