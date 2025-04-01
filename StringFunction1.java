package package_mkt;

public class StringFunction1 {

	public static void main(String[] args) 
	{
		String name="Neeraj";
		int size=name.length();
		System.out.println(size);
		
		String n1=name.concat(" Yadav");
		System.out.println(n1);
		
		StringBuffer b1= new StringBuffer("Neha");
		b1.append(" pado");
		System.out.println(b1);
		
		

	}

}
