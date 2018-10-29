package targetpack;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiWindowDemo {
	WebDriver d;
	@Test
	public void testMultiwindow() throws Exception
	{
		d.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
		d.get("http://www.irctc.co.in/eticketing/loginHome.jsf");
		assertEquals("IRCTC Next Generation eTicketing System",d.getTitle());
		d.findElement(By.linkText("Tour Packages")).click();
		//Generating Handles
		Set<String> w=d.getWindowHandles();
		System.out.println("No of handles:"+w.size());
		System.out.println("Handles are:");
		String handles[]=new String[w.size()];
		int i=0;
		for(String s:w)
		{
			handles[i]=s;
			System.out.println(handles[i]);
			i++;
		}
		//Switch driver focus from parent window to child window
		d.switchTo().window(handles[1]);
		assertTrue(d.findElement(By.linkText("Login")).isDisplayed());
		Thread.sleep(2000);
		//Switch driver focus from child window to parent window
		d.switchTo().window(handles[0]);
		assertTrue(d.findElement(By.id("usernameId")).isDisplayed());
		Thread.sleep(4000);
		
	}
	@Before
	public void setUp()
	{
		d=new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", "F:\\Selenium_Sripts_Jan15\\Lib\\IEDriverServer.exe");
		//d=new InternetExplorerDriver();
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Sripts_Jan15\\Lib\\chromedriver.exe");
		//d=new ChromeDriver();
	}
	@After
	public void tearDown()
	{
		d.quit();
	}

}
