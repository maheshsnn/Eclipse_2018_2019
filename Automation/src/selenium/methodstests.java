package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class methodstests {
	
	WebDriver driver;
	
	@BeforeSuite
	public void suites()
	{
		System.out.println("suites");
	}
	@BeforeClass
	public void classs()
	{
		System.out.println("Before class");
	}
	@BeforeMethod
	public void method()
	{
		System.out.println("Before method");
	}
	@BeforeTest
	public void text()
	{
		System.out.println("Before test");
	}
	
	@Test
	public void test1()
	{
		System.out.println(" test1");
	}
	@Test
	public void test2()
	{
		System.out.println(" test2");	
		WebDriverWait waits=new WebDriverWait(driver,500);
		waits.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Wait wait=new FluentWait(driver).withTimeout(10, TimeUnit.SECONDS).ignoring(Exception.class).pollingEvery(20, TimeUnit.SECONDS);
	}
	
	

}
