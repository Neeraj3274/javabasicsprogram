package package_mkt;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment54 {

	public static void main(String[] args) 
	{
		Set<String> s1=new HashSet<String>();
		s1.add("Neeraj");
		s1.add("Manish");
		s1.add("Bhim");
		s1.add("Raju");
		System.out.println(s1);
		
			Iterator<String> itr=s1.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		
		
		
	}

}
