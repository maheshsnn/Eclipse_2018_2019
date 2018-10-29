package complete_practice;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryanalysers implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		int count=0;
		int retrynumber=3;
		
		if(count<retrynumber)
		{
			count++;
			return true;
		}
		
		return false;
	}
	

}
