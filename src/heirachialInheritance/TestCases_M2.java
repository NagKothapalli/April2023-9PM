package heirachialInheritance;

import org.junit.Test;

public class TestCases_M2 extends ReusableComponents
{
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
}
