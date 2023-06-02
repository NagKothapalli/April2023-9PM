package inheritanceByObject;

import org.junit.Test;
//             child              parent
public class TestCases //extends ReusableComponents
{	
	//Modifier DataType variableName = value;
	public int empNum = 22;
	//Modifier ClassName  objectName  = new Constructor();
	public ReusableComponents  rc = new ReusableComponents();
	//************************ Test Cases ***************************
	@Test   // annotation 
	public void composeAndSendAnEmail() //Ram
	{
		  //launch , login , compose , send , logout , close		
		  System.out.println("TestCase : Compose And Send An Email");
		  rc.launchApplication();
		  rc.loginToApplication();
		  rc.compose();
		  rc.send();
		  rc.logoutFromApplication();
		  rc.closeApplication();		 
	}
	@Test
	public void replyToAnEmail() // Raj
	{
		//launch , login , open , reply , logout , close
		System.out.println("TestCase : Reply to An Email");
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.reply();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public void forwardAnEmail() // Pasha
	{
		//launch , login , open , forward , logout , close
		System.out.println("TestCase : Forward An Email");
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.forward();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public void deleteAnEmail() //John
	{
		//launch , login , open , delete , logout , close
		System.out.println("TestCase : Delete An Email");
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.delete();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
}
