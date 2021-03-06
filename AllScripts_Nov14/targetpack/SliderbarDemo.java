package targetpack;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SliderbarDemo {
	WebDriver d; 
	@Test
	    public void testSlider() throws Exception
	    {
	    	d.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
	    	d.manage().window().maximize();
	    	d.get("http://jqueryui.com/slider/");
	    	assertEquals("Slider | jQuery UI",d.getTitle());
	    	d.switchTo().frame(0); 	
	    	Actions a=new Actions(d);
	    	a.dragAndDropBy(d.findElement(By.xpath("//div[@id='slider']/span")), 200, 0).perform();
	    	
	    	Thread.sleep(4000);
	    }
	@BeforeMethod
	public void setUp()
	{
		d=new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", "F:\\Selenium_Scripts_Nov14\\Lib\\IEDriverServer.exe");
		//d=new InternetExplorerDriver();
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Scripts_Nov14\\Lib\\chromedriver.exe");
		//d=new ChromeDriver();
	}
	@AfterMethod
	public void tearDown()
	{
		d.quit();
	}

}
