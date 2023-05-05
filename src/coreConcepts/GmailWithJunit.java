package coreConcepts;

import org.junit.Test;

public class GmailWithJunit
{
	//Junit : Unit Test Framework , which will be used to run individual test methods or all the test 
	      //methods in the class
	@Test   // annotation 
	public void composeAndSendAnEmail()
	{
		//launch , login , compose , send , logout , close
		System.out.println("TestCase : Compose And Send An Email");
	}
	@Test
	public void replyToAnEmail()
	{
		//launch , login , compose , send , logout , close
		System.out.println("TestCase : Reply to An Email");
	}
	@Test
	public void forwardAnEmail()
	{
		//launch , login , compose , send , logout , close
		System.out.println("TestCase : Forward An Email");
	}
	@Test
	public void deleteAnEmail()
	{
		//launch , login , compose , send , logout , close
		System.out.println("TestCase : Delete An Email");
	}
	
	
}
