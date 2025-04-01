package package_mkt;

class Dog 
{
	void bite()
	{
		System.out.println("Dog use to Bite");
	}
}
	
class Mammal extends Dog
	{
		void walk()
		{
			System.out.println("Mammal use to walk");
		}
	}
	
 public class Animal extends Mammal
	{
		void eat()
		{
			System.out.println("Animal use to eat");
		}
	
	
	

	public static void main(String[] args) 
	{
		Animal a1= new Animal();
		a1.eat();
		a1.walk();
		a1.bite();

	}

}
