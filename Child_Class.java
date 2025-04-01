package package_mkt;

class Parent_class
{
	static void login()
	{
		System.out.println("ok");
	}
	
	static void logout()
	{
		System.out.println("yaahhooo");
	}
	
	static void sensitive()
	{
		System.out.println("lop");
	}
	
	
}

public class Child_Class extends Parent_class

{
	
	static void testcase1()
	{
		System.out.println("polo");
	}
	
	static void testcase2()
	{
		System.out.println("nagar");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		login();
		testcase1();
		logout();
		testcase2();
		sensitive();
		
		

	}

}
