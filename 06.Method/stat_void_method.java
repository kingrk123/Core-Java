class stat_void_method 
{
	static void m1(){
		System.out.println("In m1");
	}
	void m2(){
		System.out.println("In m2");
	}
	public static void main(String[] args) 
	{
		System.out.println("In main");
		m1();
		Example e=new Example();
		e.m2();
	}
}
