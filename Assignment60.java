package package_mkt;

import java.util.Hashtable;

public class Assignment60 {

	public static void main(String[] args) 
	{
		Hashtable<String, Character> m = new Hashtable<String, Character>();
		m.put("gender1", 'm');
		m.put("gender2", 'f');
		m.put("gender3", 'f');
		m.put("gender4", 'm');
		System.out.println(m);
		
		Hashtable m1 = new Hashtable();
		m1.put("name1", "neeraj");
		System.out.println(m1);
		m1.putAll(m);
		System.out.println(m1);
		

		
		
		
		
		
	}

}
