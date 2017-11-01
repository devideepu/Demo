class MyThread extends Thread
{
	int start,end,delay;
	MyThread(String name,int start,int end,int delay)	//Constructor to assign values when threads are intialized
	{
		setName(name);
		this.start=start;
		this.end=end;
		this.delay=delay;
	}
	public void run()	//A Default method which is used when a user defined thread created
	{
		for(int i=start;i<=end;i++)
		{
			System.out.println(getName()+" "+i);
			try
			{
				Thread.sleep(delay);
			}
			catch(InterruptedException ex)
			{
				System.out.println(getName()+" "+"Interrupted");
			}
		}
	}
}
