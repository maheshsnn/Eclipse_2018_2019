package complete_practice;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class screenshots_failure  implements ITestListener{
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
				
		DateFormat dateformat=new SimpleDateFormat("");
		Date date=new Date();
		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("path"));
		
	}
	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		DateFormat dateformat=new SimpleDateFormat("");
		Date date=new Date();
		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scr, new File("path"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
