abstract class my {
    public void mymethod() {
        System.out.print("Abstract");
    }
    public abstract void method2();
}

class child extends my{
	public void method2()
	{
		System.out.print("Child");
	}
}


public class poly {
    public static void main(String a[]) {
        //my m = new my() {};
        //m.mymethod();
        my m2=new child();
        m2.method2();
    }
}
