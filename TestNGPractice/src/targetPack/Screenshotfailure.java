package targetPack;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import static org.testng.Assert.assertEquals;

public class Screenshotfailure {
	
	
	WebDriver d;
	@BeforeMethod
	public void setup()
	{
		d=new FirefoxDriver();
	}
	@AfterMethod
	public void teardown()
	{
		d.quit();
	}
	@Test
	public void test() throws IOException
		{
			assertEquals("pass",getScreenshot());
		}	
			String getScreenshot() throws IOException
			{
			try
			{
			d.navigate().to("https://www.facebook.com/login/");	
			d.findElement(By.id("emai")).clear();
			return "pass";
			}
			catch(Exception e)
			{
			DateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy HH-mm");
			Date date=new Date();
			File scrFile=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile,new File("C:\\Users\\hai\\Documents\\mah\\image"+dateFormat.format(date)+".png"));
			return "fail";
			
			}}}
	
	

	
	
	
