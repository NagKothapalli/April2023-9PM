package seleniumPractice;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ApsrtcAutomation
{
	ChromeDriver driver;
	Actions actions;
	public ApsrtcAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver();//it will open an empty google chrome browser //1234
		actions = new Actions(driver);
	}
	String expectedTitle = "Gmail";
	//ChromeDriver : get , getWindowHandle , getTitle , getCurrentUrl , findElement , findElements , 
	//WebElement : click , clear , sendKeys , getText , getAttribute , isDisplayed , isEnabled
	//By : ID , Name , class , cssSelector , linkText , PartialLinkText , tagName , xpath
	@Before
	public void launchGmailApplication()
	{
		System.out.println("Testcase : Launch Gmail Application");		
		driver.get("https://www.apsrtconline.in/"); 
	}
	@Test
	public void bookBusTicket()
	{
		System.out.println("Testcase : Book Bus Ticket");		
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		driver.findElement(By.xpath("//a[text()='22']")).click();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	}
	@Test
	public void handleAlerts()
	{
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		actions.sendKeys(Keys.TAB).build().perform();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@name='source']")).clear();
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	}
	
	@Test
	public void mouseOPerations()
	{
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//input[@name='source']"));
		actions.moveToElement(element).sendKeys("HYDERABAD").doubleClick().contextClick().build().perform();
	}
	
	
	
	
	
	
	
	
	
	
	

}
