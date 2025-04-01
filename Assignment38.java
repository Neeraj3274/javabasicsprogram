package package_mkt;

import java.util.Arrays;

public class Assignment38 {

	public static void main(String[] args) 
	{
		String s1="stop";
		String s2="spot";
		
		if(s1.length()!=s2.length());
		{
			System.out.println("It is not a anagram");
		}
	
		else
		{
			
			  char[] c1=s1.toCharArray();
			  char[] c2=s2.toCharArray();
			  
			  Arrays.sort(c1);
			  Arrays.sort(c2);
			  System.out.println("After sorting ->");
			  System.out.println(Arrays.toString(c1));
			  System.out.println(Arrays.toString(c2));
			  
			    boolean answer=	Arrays.equals(c1, c2);
			    System.out.println(answer);
			    
			    
			   if(answer==true)
			   {
				   System.out.println("It is anagram");
			   }
			   
			   else
			   {
				   System.out.println("it is not a anagram");
			   }
			    
		}
	
		}
		
		
		
	}


