class Example0 
{
	static int a=m1();
	static int m1(){
		System.out.println("Example SV a-variable is created");
		return 50;
		}
		static {
			System.out.println("Example SB-class is loaded");
			}

	public static void main(String[] args) 
	{
		System.out.println("Example main - execution start");
		Example0 e=new Example0();
	}
	static void m2(){
		System.out.println("Example m2");
			}
			Example0(){
				System.out.println("Example constructor-object is created");
				}
}
