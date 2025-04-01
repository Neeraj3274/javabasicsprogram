package package_mkt;
class SuperClass
{
	void add()
	{
		System.out.println("method is getting override");
	}
}


public class Superkeyword extends SuperClass
{
	public void add()
	{
		super.add();
		System.out.println("method is checking");
	}
	public static void main(String[] args) 
	{
			Superkeyword s1= new Superkeyword();
			
			s1.add();
			
//			SuperClass s2=new SuperClass();
//			s2.add();
	}

}
