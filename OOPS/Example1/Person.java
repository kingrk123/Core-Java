class Person 
{
	static final int eyes =2;
	static final int ears =2;
	static final int hands =2;
	static final int legs =2;

	String name;
	double height;
	double weight;

	public Person(String name, double height, double weight) 
	{
		this.name =name;
		this.height =height;
		this.weight =weight;

	}
	public static void main(String[] args) 
	{
		Person p1 = new Person ("Yuvi", 5.9, 85);
	}

}
