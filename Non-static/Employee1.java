class Employee1
{
	int eid;
	String ename;
	String company;



	public String toString()
	{
		return "eid: "+ eid +"\n"+
			    "ename:"+ ename +"\n"+
				"company:"+company+"\n";
	}

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.eid=7258;
		e1.ename="KINGRK";
		e1.company="NIT";
		System.out.println(e1);
	}
}
