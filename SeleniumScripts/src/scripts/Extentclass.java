package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extentclass
{

ExtentReports reports;
ExtentTest logger;
static WebDriver d;


@Test
public void mahesh()
{
	reports=new ExtentReports("G:\\Extentreports\\reports.html");
	logger=reports.startTest("validating test");
	
//	System.setProperty("webdriver.chrome.driver","G:\\AUTOMATION WORKSPACE\\lib\\chromedriver.exe");
//	d=new ChromeDriver();
	d=new FirefoxDriver();

	d.manage().window().maximize();
	logger.log(LogStatus.INFO, "windows maximized");
	d.get("http:facebook.com");
	logger.log(LogStatus.INFO, "sent url to the browser");
	d.findElement(By.id("email")).sendKeys("maheshsnn");
	logger.log(LogStatus.INFO, "entered username");
	d.findElement(By.id("pass")).sendKeys("Hello2D4y#");
	logger.log(LogStatus.INFO, "entered password");
	d.findElement(By.xpath("//*[@id='u_0_5']")).click();
	logger.log(LogStatus.INFO, "clicked on login button");
	String title=d.getTitle();
	logger.log(LogStatus.PASS, "title validating");
	Assert.assertTrue(title.contains("goole"));
	
	d.close();
	
	
}

@AfterMethod
public void tearup(ITestResult result) 
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
	String screenshotpath=Screenshotcapture.screenshot(result.getName());
	String image=logger.addScreenCapture(screenshotpath);
	logger.log(LogStatus.FAIL,"validation failue",image);
		
	}
	reports.endTest(logger);
	reports.flush();
	
}


}
