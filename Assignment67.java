package package_mkt;

interface yoyo
{
	abstract void add();
}

abstract class nice implements yoyo
{
	abstract void sub();
}

public class Assignment67 extends nice
{

	public static void main(String[] args) 
	{
		Assignment67 s1=new Assignment67();
		s1.add();
		s1.sub();
	}

	public void add() 
	{
		System.out.println("Abstract method");
	}

	void sub() 
	{
		System.out.println("2nd abstract method");
	}

}
