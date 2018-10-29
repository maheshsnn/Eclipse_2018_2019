package pRACTICE;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.xpath.operations.String;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid {
	WebDriver driver;
	public String URL ,Node;
	
	@Test
	public void grid() throws Exception
	{
	   
		java.lang.String URL = "http://www.google.com";
		//d.get("http://www.google.com");
         System.out.println(" Executing on FireFox");
          java.lang.String Node = "http://192.168.2.51:5555/wd/hub";
          DesiredCapabilities cap = DesiredCapabilities.firefox();
          cap.setBrowserName("firefox");
          cap.setPlatform(Platform.WIN8_1);
          
          driver = new RemoteWebDriver(new java.net.URL(Node), cap);
          // Puts an Implicit wait, Will wait for 10 seconds before throwing exception
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          
          // Launch website
         // driver.navigate().to(URL);
          driver.manage().window().maximize();
          
          //driver.quit();

}}
