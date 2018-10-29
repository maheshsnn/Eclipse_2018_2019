package targetPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ATD {
	WebDriver d;
	@BeforeMethod
	public void before()
	{
     d=new FirefoxDriver();
     d.get("http://192.168.1.2");
     d.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
     d.manage().window().maximize();
	}
	@AfterMethod
	public void tearDown() throws Exception
	{
	Thread.sleep(5000);
	d.quit();
	}
	@Test
	public void sc1() 
	{
	d.findElement(By.id("login-username")).sendKeys("sc123");
	d.findElement(By.name("Password")).sendKeys("sc123");
	d.findElement(By.id("btnLogin")).click();
	d.findElement(By.xpath("//div[4]/div/a/img")).click();
	d.findElement(By.linkText("new")).click();
	
	
	
	
		
		
		
		
		
		
	}
	

}
