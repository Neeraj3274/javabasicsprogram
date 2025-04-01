package package_mkt;

class AmazonLogic
{
	private String username="mkt@grotechmind.com";
	
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username=username;
	}
}

public class Mock_Practice9 {

	public static void main(String[] args) 
	{
		AmazonLogic a1=new AmazonLogic();
		a1.setUsername("Neeraj@gmail.com");
		System.out.println(a1.getUsername());
		
		
		
		
	}

}
