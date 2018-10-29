package targetPack;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Mouseovers {
	 WebDriver d;
//	 @Parameters("browser")
//	@BeforeMethod
//	
//	public void setUp(String browser)
//	{
//		 if(browser.equalsIgnoreCase("FF"))
//			{
//				d=new FirefoxDriver();
//			
//	}}
//	@AfterMethod
//	public void meth2() 
//	{
//		d.quit();
//		
//	}
	@Test
	public void meth3() throws InterruptedException  
	{
		WebDriver d=new FirefoxDriver();
	d.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	//d.get("http://www.policybazaar.com/");	
	d.get("https://google.com");
	
	Thread.sleep(5000);
	Actions a=new Actions(d);
//	a.moveToElement(d.findElement(By.className("ins"))).click(d.findElement(By.linkText("Life Insurance"))).build().perform();
//	Thread.sleep(5000);
//	
//	assertEquals("About Product",d.findElement(By.xpath("//html/body/section[1]/div[1]/section[2]/section[1]/div/h3")).getText());
//	
	
	d.findElement(By.id("lst-ib")).sendKeys("gm");
	Thread.sleep(5000);
	a.sendKeys(d.findElement(By.id("lst-ib")),Keys.ARROW_DOWN).build().perform();
	//a.sendKeys(d.findElement(By.id("lst-ib")),Keys.ARROW_DOWN).build().perform();
	Thread.sleep(5000);
	
	a.sendKeys(Keys.ENTER).build().perform();
	
WebElement  l=d.findElement(By.linkText("Gmail - Google"));

a.keyDown(Keys.CONTROL).sendKeys(l).build().perform();

//a.sendKeys(d.findElement(By.linkText("Gmail - Google")),Keys.CONTROL).build().perform();
a.sendKeys(Keys.ENTER);


	
	}
	

	
}
