package targetPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Draganddrop {
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
		d.findElement(By.linkText("Droppable")).click();
		d.switchTo().frame(0);
		Actions a=new Actions(d);
		a.dragAndDrop(d.findElement(By.id("draggable")),d.findElement(By.id("droppable"))).perform();
	    Thread.sleep(5000);
	}

}
