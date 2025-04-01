package package_mkt;

public class Assignment19 {
	
	static void where()
	{
		System.out.println("jai ho");
	}
	
	static void where(String message)
	{
		System.out.println("static method with ");
	}
	
	public void where(int a, int b)
	{
		System.out.println("oo stree kl aana");
	}
	
	public void where(long a, long b, long c)
	{
		System.out.println("parso milte h");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		where();
		where("method");
		
		Assignment19 m1=new Assignment19();
		m1.where(2, 4);
		m1.where(123456, 45678, 76548);;

	}

}
