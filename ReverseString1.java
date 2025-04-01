package package_mkt;

public class ReverseString1 {

	public static void main(String[] args)
	{
		String a="Auto";
		String b="";
		
		for(int i=a.length()-1; i>=0; i--)
		{
			char c1=a.charAt(i);
			b=b+c1;
			//System.out.print(b);
		}
		System.out.println("Input is ->" +a);
		System.out.println("Output is ->" +b);
		
//		if(a.equals(b))
//		{
//			System.out.println("Its a palindrome");
//		}
//		else
//		{
//			System.out.println("It is not a palindrome");
//		}
	}

}
