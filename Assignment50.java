package package_mkt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Assignment50 {

	public static void main(String[] args) 
	{
		Collection<Integer> c1=new ArrayList<Integer>();
		c1.add(123);
		c1.add(675);
		c1.add(245);
		c1.add(376);
		c1.add(245);
		System.out.println(c1);
		
		Iterator<Integer> i1=c1.iterator();
		System.out.println("Iterating through ->");
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		
	}

}
