package targetpack;

import static org.testng.Assert.assertEquals;

import java.net.URL;
import java.util.concurrent.TimeUnit;






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class AjaxDemo {
WebDriver d;
	
    @Test(retryAnalyzer=Retry.class)
    public void testAjax() throws Exception
    {
    	d.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
    	d.get("http://www.veethi.com/places/india_banks-ifsc-micr-codes.html");
    	assertEquals("Bank IFSC Codes, MICR Codes: Find IFSC, MICR Codes for Major Banks in India",d.getTitle());
    	Select bank=new Select(d.findElement(By.id("selBank")));
    	bank.selectByIndex(4);
    	Select state=new Select(d.findElement(By.id("selState")));
    	state.selectByVisibleText("Andhra Pradesh");
    	Select city=new Select(d.findElement(By.id("selCity")));
    	city.selectByVisibleText("Hyderabad");
    	Select branch=new Select(d.findElement(By.id("selBranch")));
    	branch.selectByVisibleText("Sanjeeva Reddy Nagar");
    	Thread.sleep(4000);
    	
    }
    //Reading browse name from XML
    @Parameters({"browser"})
	@BeforeMethod
	public void setUp(String browser) throws Exception
	{
		if(browser.equals("FF"))
		{
			DesiredCapabilities b = DesiredCapabilities.firefox();
			//d = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),b);
			d=new FirefoxDriver();
			
		}
		else if(browser.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver","F:\\Selenium_Scripts_Sep14\\Lib\\IEDriverServer.exe");
			DesiredCapabilities b = DesiredCapabilities.internetExplorer();
			//d = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),b);
			d=new InternetExplorerDriver();
		}
		else if(browser.equals("GC"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Scripts_Sep14\\Lib\\chromedriver.exe");
			DesiredCapabilities b = DesiredCapabilities.chrome();
			//d = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),b);
			d=new ChromeDriver();
		}
			
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
	}
	@AfterMethod
	public void tearDown()
	{
		d.quit();
	}

}
