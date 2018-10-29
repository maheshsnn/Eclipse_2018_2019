package target;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindows {
	WebDriver d;
	@Before
	public void setUp()
	{
	//System.setProperty("Webdriver.chrome.driver","C:\\SELENIUM\\lib\\chromediver.exe");
	//d=new ChromeDriver();
	d=new FirefoxDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	@After
	public void tearDown() throws InterruptedException
	{
		d.quit();
		Thread.sleep(5000);
	}
	@Test
	public void testIrctcAlerts() throws InterruptedException
	{
	d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 	
	d.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	d.findElement(By.xpath("//a[@target='_blank']")).click();
	Set<String> w=d.getWindowHandles();
	System.out.println("No of handles:"+w.size());
	String handles[]=new String[w.size()];
	int i=0;
	for(String s:w)
	{
		handles[i]=s;
		System.out.println(handles[i]);
		i++;
	}
	d.switchTo().window(handles[1]);
	Thread.sleep(5000);
	assertTrue(d.findElement(By.linkText("Login")).isDisplayed());
	d.switchTo().window(handles[0]);
	Thread.sleep(10000);
    assertTrue(d.findElement(By.className("headings")).isDisplayed());
    Thread.sleep(5000);
    
}

	
	}
	
	
	


