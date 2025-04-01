package package_mkt;

public class StringFunction3 {

	public static void main(String[] args) 
	{
		String input="neeraj yadav";
		boolean b1=input.contains(" ");
		System.out.println(b1);
		
		System.out.println(input.equals("Neeraj"));
		
		System.out.println(input.equalsIgnoreCase("Neeraj yadav"));
		
		String name="Neeraj";
				System.out.println(name.matches("....."));
	}

}
