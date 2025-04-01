package package_mkt;

import java.util.Arrays;

public class Assignment37 {

	public static void main(String[] args) 
	{
		int input[]=new int[5];
		
		input[0]=10;
		input[1]=20;
		input[2]=30;
		input[3]=40;
		input[4]=50;
		
		int output[]=new int[input.length];
		
		for(int i=0,j=0;i<input.length;i++,j++)
		{
			output[j]=input[i];
		}
		
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(output));
		
		
		
	}

}
