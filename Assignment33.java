package package_mkt;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment33 {

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		
		int rollno[]= new int[3];
		System.out.println("Enter the 1st number");
		   rollno[0]=s1.nextInt();
		   System.out.println("entre the 2nd number");
		   rollno[1]=s1.nextInt();
		   System.out.println("enter the 3rd number");
		   rollno[2]=s1.nextInt();
		   
		   System.out.print("Here is the array ->  ");
		   	System.out.println(Arrays.toString(rollno));
		
		
		
		
	}

}
