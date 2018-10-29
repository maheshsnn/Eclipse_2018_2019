package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class exetntreports {

	ExtentReports reports=new ExtentReports("");
	
	WebDriver driver;
	
	ExtentTest logger;
	
	@Test
	public void mm()
	{
		
		
	
		logger=reports.startTest("");
		
		Actions a=new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath(""))).click().build().perform();
		
		
	}
	
}
