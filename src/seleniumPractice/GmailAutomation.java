package seleniumPractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class GmailAutomation
{
	String expectedTitle = "Gmail";
	@Test
	public void launchGmailApplication()
	{
		System.out.println("Testcase : Launch Gmail Application");
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();//it will open an empty google chrome browser
		driver.get("https://gmail.com"); // to call application url
		String session = driver.getWindowHandle(); // to get the session id
		System.out.println("My window session ID :" + session);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//Validation : Comparing the expected value with the actual value 
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Launch Application is Successfull");
		}
		else {
			System.out.println("Launch Application is Failed");
		}
		Assert.assertEquals(expectedTitle, actualTitle);
		driver.findElement(By.id("identifierId")).sendKeys("nag022");
		driver.findElement(By.tagName("button")).click();
	}
	public void loginApplication()
	{
		
	}
	

}
