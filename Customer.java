class Customer implements common
{
	int cno,qty,rate;
	String cname,product;
	public void accept()
	{
		cno=20;
		cname="Prabha";
		product="Laptop";
		qty=2;
		rate=35000;
	}
	public void display()
	{
		System.out.println("Customer Details:\ncno\tcname\tproduct\tqty\trate\n"+cno+"\t"+cname+"\t"+product+"\t"+qty+"\t"+rate);
	}
}
