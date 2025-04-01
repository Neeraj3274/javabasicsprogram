package package_mkt;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment35 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		String[] name=new String[3];
		for(int i=0; i<name.length;i++)
		{
			System.out.println("enter the value of index -> " +i);
			
			name[i]=s1.next();
			
			
		}
		
		String[] name1=new String[3];
		for(int j=0;j<name1.length;j++)
		{
			System.out.println("Enter the value of index ->" +j);
			
			name1[j]=s1.next();
		}
		
					boolean answer=Arrays.equals(name, name1);
					System.out.println(answer);
					s1.close();
		
	}

}
