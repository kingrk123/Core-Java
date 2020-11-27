class Example8 
{
	int x=10;
	{
		System.out.println("x:"+x);
		System.out.println("y:"+this.y);
	}
	public static void main(String[] args) 
	{
		Example8 e=new Example8();
		System.out.println("x:"+e.x);
		System.out.println("y:"+e.y);
	}
	int y=20;
}
