package targetPack;

//import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Draganddropby {
	WebDriver d;
	@BeforeMethod
	public void meth1()
	{
		
		d=new FirefoxDriver();
		d.manage().window().maximize();
	}
	@AfterMethod
	public void meth2() 
	{
		d.quit();
	}
	@Test
	public void meth3() throws InterruptedException
	{
		d.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		d.get("http://jqueryui.com/");
		  Thread.sleep(5000);
		d.findElement(By.linkText("Draggable")).click();
		d.switchTo().frame(0);
		Actions a=new Actions(d);
		a.moveByOffset(1000,1000).perform();
	    Thread.sleep(5000);
	}
}
