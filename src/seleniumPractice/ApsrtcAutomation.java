package seleniumPractice;

import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApsrtcAutomation
{
	ChromeDriver driver;
	public ApsrtcAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver();//it will open an empty google chrome browser //1234
	}
	String expectedTitle = "Gmail";
	//ChromeDriver : get , getWindowHandle , getTitle , getCurrentUrl , findElement , findElements , 
	//WebElement : click , clear , sendKeys , getText , getAttribute , isDisplayed , isEnabled
	//By : ID , Name , class , cssSelector , linkText , PartialLinkText , tagName , xpath
	@Before
	public void launchGmailApplication()
	{
		System.out.println("Testcase : Launch Gmail Application");		
		driver.get("https://gmail.com"); 
	}

}
