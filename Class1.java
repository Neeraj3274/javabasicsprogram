package package_mkt;
class Class3
{
	Class3()
	{
		System.out.println("Constructor 3");
	}
	
}
class Class2 extends Class3
{
	Class2()
	{
		//super();
		System.out.println("Constructor 2");
	}
}


public class Class1 extends Class2
{
	Class1()
	{
		//super();
		System.out.println("Constructor 1");
	}
	public static void main(String[] args) 
	{
		new Class3();
		//new Class2();
	}
}
