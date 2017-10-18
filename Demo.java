class Encapex{
	private char x;
	private String y;
	
	public char getX(){
		return x;
	}
	public String getY(){
		return y;
	}
	public void setX(char var1)
	{
		x=var1;
	}
	public void setY(String var2)
	{
		y=var2;
	}
}

public class Demo{
	public static void main(String args[])
	{
		Encapex ob=new Encapex();
		System.out.println("X="+ob.getX()+",Y="+ob.getY());
		ob.setX('T');
		ob.setY("Hello");
	        System.out.println("X="+ob.getX()+",Y="+ob.getY());
	}
}
	
