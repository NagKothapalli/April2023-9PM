package tCases;

import org.junit.Test;

import rComponents.ReusableComponents;
//             child              parent
public class TestCases extends ReusableComponents
{
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
	
	public final static String collegeName = "JNTU";
	public String stdName = "Ram";
}

class Yahoo
{
	public void modifiers()
	{
		System.out.println(TestCases.collegeName );
		TestCases tc = new TestCases();
	
	}
}












