package package_mkt;

public class Practice1 {

	
	void Practice1(int a, int b)
	{
		System.out.println("it is a constructor");
	}
	
	void Practice1(long a, float b)
	{
		System.out.println("it is constructor 2");
	}
	
	void Practice1(boolean a, boolean b)
	{
		System.out.println("true");
	}
	
	static void add()
	{
		System.out.println("it is not a contructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Practice1 m1=new Practice1();
		m1.Practice1(10, 12);
		m1.Practice1(111111, 1234567);
		m1.Practice1(true, false);
		
		Practice1.add();

	}

}
