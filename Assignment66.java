package package_mkt;

abstract class Life
{
	 static void add()
	{
		System.out.println("Concrete method");
	}
	 static void sub()
	 {
		 System.out.println("2nd concrete method");
	 }
	 static void multi()
	 {
		 System.out.println("3rd concrete method");
	 }
	 static void divide()
	 {
		 System.out.println("4th concrete method");
	 }
}

public class Assignment66 extends Life
{

	public static void main(String[] args) 
	{
		//Assignment66 a3=new Assignment66();
		Life.add();
		Life.sub();
		Life.multi();
		Life.divide();
		
		
		
		
	}

}
