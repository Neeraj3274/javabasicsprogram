package package_mkt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Assignment52 {

	public static void main(String[] args) 
	{
		List<String> s1=new ArrayList<String>();
		s1.add("Ram");
		s1.add("Krishna");
		s1.add("Bhim");
		s1.add("Neeraj");
		s1.add("Raju");
//		s1.add(null);
//		s1.add(null);
		//s1.removeAll(s1);
// 	    s1.clear();
		System.out.println(s1);
		
				Iterator<String> ite=	s1.iterator();
				
				while(ite.hasNext())
				{
					System.out.println(ite.next());
				}
				
				ListIterator<String> itr	=s1.listIterator();
				System.out.println("After list iterator forward iteration ->");
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
				System.out.println("After list iterator backward iteration ->");

				while(itr.hasPrevious())
				{
					System.out.println(itr.previous());
				}
		
		
		
		
	}

}
