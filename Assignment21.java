package package_mkt;

public class Assignment21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=12;
		
		assert age<=18:"Not able to drive to get driving licence";
		
		System.out.println("Lets go for a drive");
		
		age =20;
		assert age>=19:"what can we do to print this";
		System.out.println("this will not print untill the condition is true");

	}

}
