package package_mkt;

class Executive_Deva() 
{

	void add()
	{
		
		System.out.println("its inheritance");
	}
	
	void sub()
	{
		System.out.println("inhhhh");
	}
}



public class Mahan_Class extends Executive_Deva
{
	
	void ok()
	{
		System.out.println("han nji ");
	}
	
	void yeah()
	{
		System.out.println("uknow");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mahan_Class s1= new Mahan_Class();
		s1.ok();
		s1.yeah();
		
		s1.add();
		s1.sub();
		

	}

}
