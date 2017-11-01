class Interface
{
	public static void main(String args[])throws Exception
	{
		char ch;
		common r;
		System.out.println("Enter your option\n1:Student\n2:Customer");
		ch=(char)System.in.read();
		if(ch=='1')
			r=new Student();
		else
			r=new Customer();
		r.accept();
		r.display();
			
	}
}
