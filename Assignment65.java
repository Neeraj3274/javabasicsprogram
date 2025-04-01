package package_mkt;

abstract class jojo
{
	abstract void ok();
	
	abstract void yes();
	
	abstract void nice();
	
	void divide()
	{
		System.out.println("Concrete method");
	}
}

public class Assignment65 extends jojo
{

	public static void main(String[] args) 
	{
		
		Assignment65 a2=new Assignment65();
		a2.ok();
		a2.yes();
		a2.nice();
		a2.divide();
		
	}

	void ok() 
	{
		System.out.println("1st abstract method");
	}

	void yes() 
	{
		System.out.println("2nd abstract method");
	}

	
	void nice() 
	{
		System.out.println("3rd abstract method");
	}

}
