package selenium;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ScreenshotScript
{
	WebDriver d;

	@Test
	public void mm() throws Exception
	{
		assertEquals("pass" , getScreenshot());
		
	}

	String getScreenshot() throws IOException 
	{
		try
		{
			
		return "pass";
	}
		catch(Exception e)
		{
			
			DateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy HH-MM");
			Date date= new Date();
			File scrFile=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("adasdasdasdasd"+dateFormat.format(date)+".png"));
			return "fail";
		}
	}
	
	
}
