package package_mkt;

public class Mock_Interview2 
{	
	static int countofAlpha=0;

	public static void main(String[] args) 
	{
		String s1="Neeraj";
		char[] a1=s1.toCharArray();
		
		for(int i=0;i<s1.length();i++)
		{
			boolean s2=Character.isAlphabetic(a1[i]);
			countofAlpha++;
		}
		System.out.println(countofAlpha);
	}

}
