package coreConcepts;

import org.junit.Test;

public class GmailWithJunit
{
	//Junit : Unit Test Framework , which will be used to run individual test methods or all the test 
	      //methods in the class
	//************************ Test Cases ***************************
	@Test   // annotation 
	public void composeAndSendAnEmail() //Ram
	{
		//launch , login , compose , send , logout , close
		System.out.println("TestCase : Compose And Send An Email");
		launchApplication();
		loginToApplication();
		compose();
		send();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void replyToAnEmail() // Raj
	{
		//launch , login , open , reply , logout , close
		System.out.println("TestCase : Reply to An Email");
		launchApplication();
		loginToApplication();
		open();
		reply();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void forwardAnEmail() // Pasha
	{
		//launch , login , open , forward , logout , close
		System.out.println("TestCase : Forward An Email");
		launchApplication();
		loginToApplication();
		open();
		forward();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void deleteAnEmail() //John
	{
		//launch , login , open , delete , logout , close
		System.out.println("TestCase : Delete An Email");
		launchApplication();
		loginToApplication();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}
	//***************Reusable functions **********************
	private void launchApplication()
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
	private void closeApplication()
	{
		System.out.println("RC : Close Application");
	}	
	void compose()
	{
		System.out.println("RC : Compose Mail");
	}
	public void send()
	{
		System.out.println("RC : Send Mail");
	}	
	private void open()
	{
		System.out.println("RC : Open Mail");
	}
	void reply()
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
