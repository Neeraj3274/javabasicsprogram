package package_mkt;

interface yup
{
	void yes();
}

interface ok extends yup
{
	void add();
}

public class Assignment68 implements ok
{

	public static void main(String[] args) 
	{
		Assignment68 s5=new Assignment68();
		s5.add();
		s5.yes();
		

	}

	
	public void yes() 
	{
		System.out.println("Abstract method");
	}

	
	public void add() 
	{
		System.out.println("2nd Abstract method");
	}

}
