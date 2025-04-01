package package_mkt;

class AmazonLogic2
{
	private String userName="mkt@gmail.com";
	
	public String getUsername()
	{
		return userName;
	}
	public void setUsername(String useraname)
	{
		this.userName=userName;
	}
}

public class Mock_Interview {

	public static void main(String[] args) 
	{
		AmazonLogic2 s1=new AmazonLogic2();
		s1.setUsername("Neeraj@gmail.com");
		System.out.println(s1.getUsername());
	}

}
