class C 
{
	int x=10;
	int y=20;
	void setxy()
	{
		this.x=50;
		this.y=60;
	}
	void printxy()
	{
		System.out.println("X: "+this.x);
		System.out.println("Y:  "+this.y);
	}
	void m1()
	{
		this.setxy();
		this.printxy();
	}
	public static void main(String[] args) 
	{
		C c=new C();
		c.m1();
	}
}
