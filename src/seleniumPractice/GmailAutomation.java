package seleniumPractice;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomation
{
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
	}
	

}
