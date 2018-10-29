package complete_practice;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentreportsclass {
	
	ExtentReports report;
	ExtentTest logger;
	
	
	@AfterClass
	public void mm(ITestResult result) throws Exception
	{
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String screenshotpath=failureclasstring.scht(result.getName());
			
			String image=logger.addScreenCapture(screenshotpath);
			logger.log(LogStatus.FAIL, ""	, image);
			
		}
		
	}
	

}
