package targetpack;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.apache.commons.io.FileUtils;




public class ScreenshotDemo {
	WebDriver d;
		
	@Before
	public void init() throws  Exception
	{
		d = new FirefoxDriver();
				
	}
    @Test
    public void testScreenshot() throws Exception {
        
        d.manage().window().maximize();        
        d.get("http://www.google.com");
        d.findElement(By.name("q")).sendKeys("Selenium");
        
        //Current Date
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
        
        // then Augmenter will add the TakesScreenshot methods to the instance
        File scrFile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("F:\\Selenium_Scripts_Nov14\\Target\\Results\\"+dateFormat.format(date)+".png"));
        
        d.findElement(By.id("gbqfb")).click();
        Thread.sleep(5000);
        
        
    }
    @After
    public void stop()
    {
    	d.quit();
    }
}

