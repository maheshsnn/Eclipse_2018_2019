package target;

import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleFrames {
	WebDriver d;
	@Before
	public void setUp()

	{
	d=new FirefoxDriver();
	d.manage().window().maximize();
	
	}
	@After
	public void tearDown()
	{
		d.quit();
	}
	
	@Test
	public void testmultipleFrames() throws InterruptedException
	{
	d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	d.get("http://jqueryui.com/");
	assertEquals("jQuery UI",d.getTitle());
	d.findElement(By.linkText("Draggable")).click();
	d.switchTo().frame(0);
	Thread.sleep(5000);
	//assertTrue(d.findElement(By.xpath("Drag me around"))).isDisplayed();
	d.switchTo().defaultContent();
	Thread.sleep(500);
	d.findElement(By.linkText("Droppable")).click();
	d.switchTo().frame(0);
	//assertTrue(d.findElement(By.xpath("//div[@id='droppable']"))).isDisplayed();
    //assertTrue(d.findElement(By.id("")).isDisplayed());
	
	
	
	}}
	
	
	


