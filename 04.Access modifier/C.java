public class C extends A
{
	public static void main(String[] args) 
	{
		A a=new A();
		System.out.println(a.x);
		//System.out.println(a.y);                    CE:y is private in class A
		System.out.println(a.z);
		System.out.println(a.p);

		C c=new C();
		System.out.println(c.x);
		//System.out.println(c.y);					 CE:y is private in class A
		System.out.println(c.z);
		System.out.println(c.p);

	}
}
