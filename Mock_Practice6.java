package package_mkt;

import java.util.Arrays;

public class Mock_Practice6 {

	public static void main(String[] args) 
	{
		int input[]=new int[5];
		
		 input[0]=12;
		 input[1]=22;
		 input[2]=32;
		 input[3]=42;
		 input[4]=52;
		 
		 int output[]=new int[input.length];
		 
		 for(int i=0,j=input.length-1;i<input.length;i++,j--)
		 {
			 output[j]=input[i];
		 }
		 System.out.println(Arrays.toString(input));
		 System.out.println(Arrays.toString(output));
		
		
		
		
	}

}
