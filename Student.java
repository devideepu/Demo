class Student implements common
{
	int sno;
	String sname;
	int tfee;
	public void accept() //overriden function
	{
		sno=10;
		sname="Devi";
		tfee=1500;
	}
	public void display()
	{
		System.out.println("Student Details: \nRoll\tname\ttfee\n"+sno+"\t"+sname+"\t"+tfee);
	}
}
