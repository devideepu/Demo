public class Excep{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5};
		try{
			System.out.println(a[6]);
		}
		catch(IndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		finally{
			System.out.println("program over");
			}
	}
}
