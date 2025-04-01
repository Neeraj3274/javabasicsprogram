package package_mkt;

public class Mock_Practice3 {

	public static void main(String[] args) 
	{
		String input="mom";
		String output="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			output=output+c1;
		}
		
		System.out.println(output);
		
		if(input.equals(output))
		{
			System.out.println("It is a palindrome");
		}
		
		else
		{
			System.out.println("it is not a palindrome");
		}
		
		
		
		
	}

}
