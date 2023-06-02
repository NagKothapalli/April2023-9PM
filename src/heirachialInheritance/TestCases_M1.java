package heirachialInheritance;

import org.junit.Test;
//              child                   parent
public class TestCases_M1 extends ReusableComponents
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

}
