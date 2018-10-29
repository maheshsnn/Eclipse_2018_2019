package projects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;




public class testlistenerclass extends TestListenerAdapter
{
	
	public void onTestSuccess(ITestResult tr) 
	{
		System.out.println("The cases which are succesfull are "+tr.getName());
	}

	public void onTestFailure(ITestResult tr) 
	{
		try
		{
		
		File scr=((TakesScreenshot)firtclass.d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("G:\\Auto\\projects\\target\\"+tr.getName()+".png"));
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	}
	
}
