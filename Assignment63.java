package package_mkt;

abstract class Laptop
{
	abstract void add();
	
	void sub()
	{
		System.out.println("Non static method");
	}
}

public class Assignment63 extends Laptop
{

	public static void main(String[] args) 
	{
		Assignment63 a1=new Assignment63();
		a1.add();
		a1.sub();
		
	}

	void add() 
	{
		System.out.println("Abstract method");
		
	}
	
	

}
