package package_mkt;

abstract class Hello
{
	abstract void multi();
	
	abstract void Gud();
	
	void add()
	{
		System.out.println("Concrete method");
	}
	
	void sub()
	{
		System.out.println("Second concrete method");
	}
}



public class Assignment64 extends Hello
{

	public static void main(String[] args) 
	{
		Assignment64 s2=new Assignment64();
		s2.add();
		s2.sub();
		s2.multi();
		s2.Gud();
	}

	void multi() 
	{
		System.out.println("Abstract method");
	}

	void Gud() 
	{
		System.out.println("Second abstract method");
	}

}
