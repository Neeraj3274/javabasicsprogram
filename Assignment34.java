package package_mkt;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment34 {

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		
		int[] rollno=new int[3];
//		    rollno[0]=s1.nextInt();
//		    rollno[1]=s1.nextInt();
//		    rollno[2]=s1.nextInt();
		for(int i=0;i<rollno.length;i++)
		{
			System.out.println("Please enter th value at index ->" +i);
			
			
			rollno[i]=s1.nextInt();
		}
		
		    
		int[] rollno1=new int[3];
//		rollno1[0]=s1.nextInt();
//		rollno1[1]=s1.nextInt();
//		rollno1[2]=s1.nextInt();
		for(int j=0;j<rollno1.length;j++)
		{
			System.out.println("Please enter th value at index ->" +j);
			
			
			rollno1[j]=s1.nextInt();
		}
		
		boolean answer=Arrays.equals(rollno, rollno1);
		System.out.println(answer);
		s1.close(); 
		
		
		
		
	}

}
