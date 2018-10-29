package targetpack;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseOverDemo {
	WebDriver d;
	
	@Test
	public void mouseOver() throws Exception
	{
		d.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		d.manage().window().maximize();
		d.get("http://www.policybazaar.com/");
		assertEquals("Compare: Life |Car |Health |Travel Insurance, Child |Pension |Investment Plans Online",d.getTitle());
		Actions a=new Actions(d);
		a.moveToElement(d.findElement(By.linkText("Insurance"))).pause(2000).click(d.findElement(By.linkText("Life Insurance"))).build().perform();
		assertEquals("Compare Life Insurance Policies in India",d.findElement(By.tagName("h1")).getText());
		Thread.sleep(5000);
	}
	@BeforeMethod
	public void setUp()
	{
		d=new FirefoxDriver();
	}
	@AfterMethod
	public void tearDown()
	{
		d.quit();
	}

}
