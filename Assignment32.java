package package_mkt;

import java.util.Arrays;

public class Assignment32 {

	public static void main(String[] args) 
	{
		int[] rollno=new int[4];
		rollno[0]=12;
		rollno[1]=22;
		rollno[2]=32;
		rollno[3]=42;
		
		int[] rollno1=new int[4];
		rollno1[0]=12;
		rollno1[1]=22;
		rollno1[2]=32;
		rollno1[3]=42;
		
//		if(rollno==rollno1)
//		{
//			System.out.println("Both are equal");
//		}
//		else
//		{
//			System.out.println("Both are not equal");
//		}
		
		boolean s1 =Arrays.equals(rollno, rollno1);
		System.out.println(s1);
		
		
		
		
	}

}
