package rComponents;

import org.junit.Test;

public class ReusableComponents {

	//***************Reusable functions **********************
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");//50 lines of code might be here 
	}
	protected void loginToApplication()
	{
		System.out.println("RC : Login To Application");
	}
	public void logoutFromApplication()
	{
		System.out.println("RC : Logout From Application");//50 lines of code might be here 
	}
	protected void closeApplication()
	{
		System.out.println("RC : Close Application");
	}	
	protected void compose()
	{
		System.out.println("RC : Compose Mail");
	}
	public void send()
	{
		System.out.println("RC : Send Mail");
	}	
	protected void open()
	{
		System.out.println("RC : Open Mail");
	}
	public void reply()
	{
		System.out.println("RC : Reply to Mail");
	}
	protected void forward()
	{
		System.out.println("RC : Forward Mail");
	}
	public void delete()
	{
		System.out.println("RC : Delete Mail");
	}

}
