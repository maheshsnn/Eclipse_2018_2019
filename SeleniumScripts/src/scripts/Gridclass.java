package scripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Gridclass {
	
	
	WebDriver d;
	//String url ;
	@BeforeMethod
	public void gridsetup() throws MalformedURLException
	{
         
          
        
		
	}
	
	@BeforeClass
	public void mahesh(String browser) throws MalformedURLException
	{
		String nodeurl="http://192.168.1.5:5555/wd/hub" ;
		
		DesiredCapabilities capability=DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WIN8_1);
		d=new RemoteWebDriver(new URL(nodeurl), capability);
		System.out.println("executing in chrome browser");
		d.get("http://facebook.com");
		
		
	}
	
	@Test
	public void setupa() throws MalformedURLException
	{
	System.out.println(" Executing on FireFox");
    java.lang.String Node = "http://192.168.1.5:5555/wd/hub";
    DesiredCapabilities cap = DesiredCapabilities.firefox();
    cap.setBrowserName("firefox");
    cap.setPlatform(Platform.WIN8_1);
     d = new RemoteWebDriver(new java.net.URL(Node), cap);
    d.get("http://www.google.com");
	}
	

}
