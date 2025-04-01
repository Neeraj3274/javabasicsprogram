package package_mkt;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment48 {

	public static void main(String[] args) 
	{
		Collection<String> c1= new ArrayList<String>();
		c1.add("Raju");
		c1.add("Kaju");
		c1.add("Maju");
		c1.add("Majnu");
		c1.add("Baba");
		c1.add("Neeraj");
		System.out.println(c1);
		
		Collection<String> c2=new ArrayList<String>();
		System.out.println(c2.add("Neeraj"));
//		c2.addAll(c1);
//		System.out.println(c2);
//		c2.remove("Majnu");
//		System.out.println("Updated ->" +c2);
//		c2.removeAll(c1);
//		System.out.println(c2); 
	}

}
