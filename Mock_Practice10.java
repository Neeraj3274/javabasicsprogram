package package_mkt;

class FlipkartLogic
{
	private String username="Neerajyhtr";
	
	public String getusername()
	{
		return username;
	}
	public void setusername(String username)
	{
		this.username=username;
	}
}

public class Mock_Practice10 {

	public static void main(String[] args) 
	{
		FlipkartLogic f1=new FlipkartLogic();
		f1.setusername("gkt@gmail.com");
		System.out.println(f1.getusername());
		
		
		
	}

}
