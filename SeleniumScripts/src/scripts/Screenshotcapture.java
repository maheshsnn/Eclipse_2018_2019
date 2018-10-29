package scripts;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshotcapture 
{


public static String screenshot(String screenshotname) {
	try {
		DateFormat dateFormat=new SimpleDateFormat("dd/mm/yyyy hh:mm");
		Date date=new Date();
		String dest="G:\\Extentreports\\"+screenshotname+dateFormat.format(date)+".png";
		File scr=((TakesScreenshot)Extentclass.d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File(dest));
		return dest;
	}
	catch (Exception e) {
		
		e.printStackTrace();
		return e.getMessage();
	}
}




	
}
