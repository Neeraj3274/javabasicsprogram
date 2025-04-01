package package_mkt;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment49 {

	public static void main(String[] args) 
	{
		Collection<Integer> c1=new ArrayList<Integer>();
		c1.add(123);
		c1.add(324);
		c1.add(768765);
		c1.add(9000);
		c1.add(12000);
		
		Collection<Integer> c2=new ArrayList<Integer>();
		c2.add(11);
		System.out.println(c1.contains(11));
		c2.addAll(c1);
		System.out.println(c2.containsAll(c1));
		System.out.println(c2);
		
		
		
		
	}

}
