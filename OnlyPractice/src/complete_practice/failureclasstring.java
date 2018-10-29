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
import org.testng.ITestResult;

public class failureclasstring {

	static WebDriver driver;
	
	public static String  scht(String string) throws Exception
	{
		DateFormat dateformat=new SimpleDateFormat("");
		Date date=new Date();
		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("path"));
		return string;
	}
	
}
