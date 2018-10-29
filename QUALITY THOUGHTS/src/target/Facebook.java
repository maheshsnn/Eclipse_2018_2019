package target;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	WebDriver d;
	@Before
	public void setup()
	{
		d=new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
	}
	
	@Test
	public void testFacebook()
{
	d.get("https://www.facebook.com");
	
	WebElement X=d.findElement(By.id("email"));
	X.sendKeys("maheshsnn@gmail.com");
	System.out.println("the valu is"+X.getAttribute("value"));
	WebElement Y=d.findElement(By.id("pass"));
	Y.sendKeys("bijili@1816");
	System.out.println("the value is"+Y.getAttribute("value"));
	WebElement Z=d.findElement(By.id("persist_box"));
	if (Z.isSelected())
	
	{
		System.out.println("Z is selected");
	}
	else
	{
		Z.click();
		
	}
	
	Select dd=new Select(d.findElement(By.id("month")));
	dd.selectByIndex(3);
	Select dc=new Select(d.findElement(By.id("day")));
	dc.selectByIndex(3);
	Select db=new Select(d.findElement(By.id("year")));
	db.selectByIndex(3);
	WebElement A = d.findElement (By.id("u_0_d"));
	if(A.isSelected())
	{
		System.out.println("A is selected");
	}
	else
	{
		A.click();
	}
    }
	
	@After
	public void tearDown()
	{
		d.quit();
	}
	

	
	
	

	



}
