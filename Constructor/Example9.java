class Example9 
{
	void m1(){
		System.out.println("m1 start");
		m1();
		System.out.println("end of m1");
		}
	public static void main(String[] args) 
	{
		System.out.println("main start");
		Example9 e=new Example9();
		System.out.println("object is created");
		e.m1();
		System.out.println("main end");
		int x=e.m2();
		
			
	}
	int m2(){
			System.out.println("NSV x");
			return 50;
			}
	Example9(){
				System.out.println("Constructor Start");
				System.out.println("End of Constructor");
				}
}
