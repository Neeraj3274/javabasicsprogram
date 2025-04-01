package package_mkt;

import java.util.Scanner;

public class Assignment27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner D1=new Scanner(System.in);
		System.out.println("Please enter 1 for chrome browser");
     	System.out.println("2 for mozilla browser");
		System.out.println("3 for safari browser");
		
		int input =     D1.nextInt();
		
		
		switch(input)
		{
		case 1:
			   System.out.println("Launching the chrome browser");
			   break;
			   
		case 2:
			   System.out.println("Launching the mozilla browser");
			   break;
			   
		case 3:
			   System.out.println("Launching the safari browser");
			   break;
	    default:
	    	          System. out.println("Not available cases for this");
	    	          break;
		}   
		          D1.close();

	}

}
