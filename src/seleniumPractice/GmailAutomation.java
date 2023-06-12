package seleniumPractice;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class GmailAutomation
{
	ChromeDriver driver;
	public GmailAutomation()
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
		driver.get("https://gmail.com"); // to call application url //1234
		String session = driver.getWindowHandle(); // to get the session id
		System.out.println("My window session ID :" + session);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//Validation | Assertion : Comparing the expected value with the actual value 
		String actualTitle = driver.getTitle();		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Launch Application is Successfull");
		}
		else {
			System.out.println("Launch Application is Failed");
		}
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}
	//Open Browser - > Launch Gmail -> Login
	//Always Constructor will be executed first -> If any @Before Annotated method  -> @Test 
	//org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"link text","selector":"Try again"}
	@Test
	public void loginApplication() throws InterruptedException
	{
		//driver.findElement(By.id("identifierId")).sendKeys("nag022"); //1234
		driver.findElement(By.name("identifier")).sendKeys("nag022");
		driver.findElements(By.className("VfPpkd-vQzf8d")).get(1).click();
		//driver.findElement(By.linkText("Try again")).click();
		//driver.findElement(By.className("VfPpkd-Jh9lGc")).click();
		Thread.sleep(2000);
		//driver.findElements(By.tagName("a")).get(1).click();
	}
	//XPATH : 
	  
		//Fixed / Absolute / Static : /html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input
		//Relative :
		//Dynamic  :  
	@Test
	public void loginWithxpath()
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys("nag022");
	}
	@Test
	public void forgotEmail()
	{
		//driver.findElement(By.tagName("button")).click();
		driver.findElements(By.tagName("button")).get(0).click();
	}
	@Test
	public void createAccount()
	{
		driver.findElements(By.className("VfPpkd-vQzf8d")).get(2).click();
	}
	@Test
	public void learnMore()
	{
		//driver.findElement(By.linkText("Learn more")).click();
		driver.findElement(By.partialLinkText("Learn")).click();
	}
	@Test
	public void help()
	{
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
