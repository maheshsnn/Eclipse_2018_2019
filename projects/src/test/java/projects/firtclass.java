package projects;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class firtclass {
	
	Reporter report=new Reporter();
	static WebDriver d;
	@Parameters("browser")
	@BeforeMethod()
		public void set(String browser)
	{
		if(browser.equalsIgnoreCase("ff"))
		{
			d=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.gecko.driver", "G:\\lib\\geckodriver.exe");
			 d=new FirefoxDriver();
		}
		
		
	}
	@Test
	public void mm()
	
	{
		report.log("log file test case mm");
		d.get("http://gmail.com");
		System.out.println("first class method");
	//	d.findElement(By.id("emai")).sendKeys("mahesh");
		//Assert.assertEquals("hi", "bye");
		
		d.get("https://symmetrycrm.com.au/#/");	
	}
	@AfterClass
	public void s()
	{
		d.close();
	}

}
