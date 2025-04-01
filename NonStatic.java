package package_mkt;

public class NonStatic {
	
	void add()
	{
		System.out.println("yeaahhhhhh");
	}
	
	void sub()
	{
		System.out.println("aeeee");
	}
	
	void yes()
	{
		System.out.println("okkk");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonStatic n1=new NonStatic();
		n1.add();
		NonStatic n2=new NonStatic();
		n2.sub();
		NonStatic n3=new NonStatic();
		n3.yes();
		
		
		System.out.println("yup");
		System.out.println("chiiii");
		System.out.println("yaaakkkk");
		
		

	}

}
