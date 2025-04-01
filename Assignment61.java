package package_mkt;

class Mango
{
	void add()
	{
		System.out.println("It is a mango");
	}
}
class Banana extends Mango
{
	void sub()
	{
		System.out.println("It is a banana");
	}
}


public class Assignment61
{

	public static void main(String[] args) 
	{
		
		Banana m=new Banana();
		m.add();
		m.sub();
		
		
		
		
	}

}
