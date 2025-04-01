package package_mkt;

public class Mock_Practice {

	public static void main(String[] args) 
	{
		try
		{
			int a=10;
			int b=2;
			int c=a/b;
			System.out.println(c);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Exception has been handled");
		}
		
		finally
		{
			System.out.println("Will print definitely");
		}
		
		
		
		
		
	}

}
