package projects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class secondclass {
	
	
	Reporter report=new Reporter();
	WebDriver d;
	@BeforeMethod()
	@Parameters("browser")
	public void mh(String browser)
	{
		if(browser.equalsIgnoreCase("ff"))
		{
			d=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "G:\\AUTOMATION WORKSPACE\\lib\\chromedriver.exe");
			 d=new ChromeDriver();
		}
			}
	
	@Test
	public void mm()
	{
		report.log("this is the log file of mm");
			d.get("http://facebook.com");
		
		
	}
	
	@AfterClass
	public void s()
	{
		d.close();
	}


}
