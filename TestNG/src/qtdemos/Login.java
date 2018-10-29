package qtdemos;

//package targetpack;

import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	WebDriver d;
	@Test
	public void login() throws Exception
	{
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("http://192.168.1.7:8080/abc-v01/");
		assertEquals("ABC Bank Login",d.getTitle());
		//Enter user name
		d.findElement(By.name("userName")).sendKeys("admin");
		//Get User Name
		String uname=d.findElement(By.name("userName")).getAttribute("value");
		//Enter Password
		d.findElement(By.name("password")).sendKeys("admin");
		//Get password
		String password=d.findElement(By.name("password")).getAttribute("value");
		//Click on login
		d.findElement(By.xpath("//input[@value='Login']")).click();
		//Blank username & Blank password
		if(uname.equals("") && password.equals(""))
		{
			assertEquals("User Name is required.",d.findElement(By.xpath("//div[@id='main']/div/form/font")).getText());
			assertEquals("Password is required.",d.findElement(By.xpath("//div[@id='main']/div/form/font[2]")).getText());
		}
		//Blank username
		else if(uname.equals(""))
		{
			assertEquals("User Name is required.",d.findElement(By.xpath("//div[@id='main']/div/form/font")).getText());
		}
		//Blank password
		else if(password.equals(""))
		{
			assertEquals("Password is required.",d.findElement(By.xpath("//div[@id='main']/div/form/font[2]")).getText());
		}
		//Valid user name & valid password
		else if(isElementPresent(d, By.linkText("Log Out")))
		{
			d.findElement(By.linkText("Log Out")).click();
		}
		//Invalid username & invalid password
		else
		{
			assertEquals("Invalid UserName and Password.",d.findElement(By.xpath("//div[@id='main']/div/div/font")).getText());
		}
		
		Thread.sleep(4000);
	}
	
	public boolean isElementPresent(WebDriver driver, By by){
	    try{
	        driver.findElement(by);
	        return true;
	    }catch(NoSuchElementException e){
	        return false;
	    }
	}
	@BeforeMethod
	public void setUp()
	{
		d=new FirefoxDriver();
	}
	@AfterMethod
	public void tearDown()
	{
		d.quit();
	}

}
