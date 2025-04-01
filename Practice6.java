package package_mkt;
class ParentClass
{
	void add()
	{
		System.out.println("Do addition with 2 numbers");
	
	}
}
public class Practice6 extends ParentClass
{
	void add()
	{
		//super.add();
		System.out.println("Do addition with 3 numbers");
		super.add();
	}
	public static void main(String[] args) 
	{
		Practice6 p1=new Practice6();
		p1.add();	
	}

}
