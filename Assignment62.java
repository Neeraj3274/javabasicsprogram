package package_mkt;

interface Gadha
{
	void walk();
}

interface Human
{
	void eat();
}

class Cat implements Gadha,Human
{
	public void walk()
	{
		System.out.println("Animal use to walk");
	}
	public void eat()
	{
		System.out.println("Human use to eat");
	}
	
	void bark()
	{
		System.out.println("Dog use to bark");
	}
}

public class Assignment62 extends Cat
{
    void run()
    {
    	System.out.println("Run");
    }
	public static void main(String[] args) 
	{
//		Assignment62 s1=new Assignment62();
//		s1.bark();
//		s1.eat();
//		s1.walk();
//		s1.run();
		Cat c1=new Cat();
		c1.bark();
		c1.eat();
		c1.walk();
		
	
	}

}
