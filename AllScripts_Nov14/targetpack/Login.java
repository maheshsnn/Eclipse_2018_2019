package targetpack;

import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	WebDriver d; 
	@Test
	public void testLinks() throws Exception
	{
		d.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
    	d.manage().window().maximize();
    	d.get("http://192.168.1.7:8080/abc-v01/");
    	assertEquals("ABC Bank Login",d.getTitle());
    	d.findElement(By.name("userName")).clear();
    	d.findElement(By.name("userName")).sendKeys("admin");
    	//Store username
    	String uname=d.findElement(By.name("userName")).getAttribute("value");
    	d.findElement(By.name("password")).clear();
    	d.findElement(By.name("password")).sendKeys("admin");
    	//Store password
    	String password=d.findElement(By.name("password")).getAttribute("value");
    	d.findElement(By.cssSelector("input.button")).click();
    	//Blank user name and password
    	if(uname.equals("") && password.equals(""))
    	{
    		assertEquals("User Name is required.",d.findElement(By.xpath("//div[@id='main']/div/form/font")).getText());
    		assertEquals("Password is required.",d.findElement(By.xpath("//div[@id='main']/div/form/font[2]")).getText());
    	}
    	//Blank user name
    	else if(uname.equals(""))
    	{
    		assertEquals("User Name is required.",d.findElement(By.xpath("//div[@id='main']/div/form/font")).getText());
    	}
    	//Blank password
    	else if(password.equals(""))
    	{
    		assertEquals("Password is required.",d.findElement(By.xpath("//div[@id='main']/div/form/font[2]")).getText());
    	}
    	//Valid user name and password
    	else if(isElementPresent(d,By.linkText("Log Out")))
    	{
    		d.findElement(By.linkText("Log Out")).click();
    	}
    	//invalid user name and password
    	else
    	{
    		assertEquals("Invalid UserName and Password.",d.findElement(By.xpath("//div[@id='main']/div/div/font")).getText());
    	}
    	
    	    	
    	Thread.sleep(4000);
    
	}
	   
	private boolean isElementPresent(WebDriver driver,By by)
	{
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		try
		{
			driver.findElement(by);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}

	
	@BeforeMethod
	public void setUp()
	{
		//d=new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", "F:\\Selenium_Scripts_Nov14\\Lib\\IEDriverServer.exe");
		//d=new InternetExplorerDriver();
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Scripts_Nov14\\Lib\\chromedriver.exe");
		d=new ChromeDriver();
	}
	@AfterMethod
	public void tearDown()
	{
		d.quit();
	}

}
