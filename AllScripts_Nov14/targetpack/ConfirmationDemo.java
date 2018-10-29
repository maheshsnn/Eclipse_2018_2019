package targetpack;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationDemo {
    WebDriver d;
	
    @Test
    public void testConfirmations() throws Exception
    {
    	d.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
    	d.get("http://jsbin.com/enifaf");
    	//Click button
    	d.findElement(By.xpath("//button[@onclick='launchConfirm()']")).click();
    	//Confirmation
    	Alert al=d.switchTo().alert();
    	assertEquals("Press a button!",al.getText());
    	al.dismiss();
    	//Text
    	assertEquals("You pressed Cancel!",d.findElement(By.id("chosenButton")).getText());
    	
    	Thread.sleep(4000);
    	
    }
	@Before
	public void setUp()
	{
		//d=new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", "F:\\Selenium_Scripts_Nov14\\Lib\\IEDriverServer.exe");
		//d=new InternetExplorerDriver();
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Scripts_Nov14\\Lib\\chromedriver.exe");
		d=new ChromeDriver();
	}
	@After
	public void tearDown()
	{
		d.quit();
	}

}
