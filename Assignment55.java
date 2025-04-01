package package_mkt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Assignment55 {

	public static void main(String[] args) 
	{
		
		ArrayList a1=new ArrayList();
		a1.add("Bhim");
		a1.add(98);
		a1.add(9.828);
		a1.add(true);
		a1.add(null);
		a1.add("Manish");
		a1.add("Manish");
		System.out.println(a1);
		
		Iterator itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
				ListIterator ite=a1.listIterator();
				System.out.println("After using listiterator forward->");
				while(ite.hasNext())
				{
					System.out.println(ite.next());
				}
				
				System.out.println("After using listiterator backward ->");
				while(ite.hasPrevious())
				{
					System.out.println(ite.previous());
				}
		
		
		
		
		
	}

}
