package targetPack;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Firefoxtest 
{

	WebDriver d;
	@Parameters("browser")
	@BeforeClass
	public void  zz(String browser)
	{

		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\Selenium My workspace\\lib\\chromedriver.exe");
			
			d=new ChromeDriver();
			
		}
		else if (browser.equalsIgnoreCase("FF"))
		{
			d=new FirefoxDriver();
		}
		
		else if (browser.equalsIgnoreCase("IE"))
		{
         System.setProperty("webdriver.ie.driver","E:\\Selenium My workspace\\lib\\IEDriverServer.exe");
			
			d=new InternetExplorerDriver();
		}

		
		
		
		
		//d=new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "E:\\Selenium My workspace\\lib\\chromedriver.exe");
//		d=new ChromeDriver();
		
	}
	
	
	@Test
	public void setup() throws Exception
	{
		d.get("https://www.facebook.com/login/");
		d.manage().window().maximize();
	d.findElement(By.id("email")).sendKeys("maheshsnn");
	d.findElement(By.id("pass")).sendKeys("Bijili@1816");
	d.findElement(By.xpath("//input[@id='u_0_2']")).click();
	
	Thread.sleep(500);
		d.findElement(By.xpath("//a/div/input")).click();
		Thread.sleep(500);
		
		Process p=new ProcessBuilder("E:\\Selenium My workspace\\TestNGPractice\\mahesh.exe").start();
		//Process p=new ProcessBuilder("C:\\SELENIUM\\AUTOIT.exe").start();
	}
}
