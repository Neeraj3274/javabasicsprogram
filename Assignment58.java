package package_mkt;

import java.util.HashMap;

public class Assignment58 {

	public static void main(String[] args) 
	{
		HashMap m=new HashMap();
		m.put("name", "neeraj");
		m.put("name1", "bhim");
		m.put("name2", "raju");
		m.put("name3", "manish");
		System.out.println(m);
		
		HashMap m1=new HashMap();
		m1.put("gender", 'm');
		m1.putAll(m);
		System.out.println(m1);
	System.out.println(m1.containsKey("name4"));
	
		
		
		
		
		
	}

}
