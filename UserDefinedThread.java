class UserDefinedThread
{
	public static void main(String args[])
	{
		MyThread f=new MyThread("First",1,10,1000);
		MyThread s=new MyThread("	Second",26,30,2000);	//Creating two threads.
		s.start();
		f.start();
	}
}
