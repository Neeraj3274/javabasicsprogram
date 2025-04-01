package package_mkt;

public class ArrayProblem1 {

	public static void main(String[] args) 
	{
		int array1[]= new int[4];
		
		array1[0]=70;
		array1[1]=80;
		array1[2]=90;
		array1[3]=100;
		
		int notocheck=100;
		for(int i=0; i<array1.length;i++)
		{
		if(notocheck==array1[i])
		{
			System.out.print("Yes 100 is a part of array");
			System.out.println(" and its index is ->" +i);
		}
		else 
		{
	//		System.out.println("its not a part of array");
		}
		
	}
	}
}
