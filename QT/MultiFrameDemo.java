package targetpack;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiFrameDemo {
	WebDriver d;
	@Test
	public void testMultiFrame() throws Exception
	{
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("http://selenium.googlecode.com/git/docs/api/java/index.html");
		assertEquals("Overview",d.getTitle());
		//Find no of frames
		List<WebElement> f=d.findElements(By.tagName("frame"));
		System.out.println("No of frames:"+f.size());
		//Switch driver focus to 1st frame
		//d.switchTo().frame(d.findElement(By.name("packageListFrame")));
		d.switchTo().frame(0);
		d.findElement(By.linkText("com.thoughtworks.selenium")).click();
		d.switchTo().defaultContent();
		//Switch driver focus to 2nd frame
		//d.switchTo().frame(d.findElement(By.name("packageFrame")));
		d.switchTo().frame(1);
		d.findElement(By.linkText("Selenium")).click();
		d.switchTo().defaultContent();
		//Switch driver focus to 3rd frame
		//d.switchTo().frame(d.findElement(By.name("classFrame")));
		d.switchTo().frame(2);
		assertEquals("Interface Selenium",d.findElement(By.xpath("//*[@title='Interface Selenium']")).getText());
		Thread.sleep(4000);
	}
	@Before
	public void setUp()
	{
		d=new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", "F:\\Selenium_Sripts_Jan15\\Lib\\IEDriverServer.exe");
		//d=new InternetExplorerDriver();
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Sripts_Jan15\\Lib\\chromedriver.exe");
		//d=new ChromeDriver();
	}
	@After
	public void tearDown()
	{
		d.quit();
	}

}
