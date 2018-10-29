package targetpack;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class AjaxDemo {
	WebDriver d;
	@Test
	public void testAjax() throws Exception
	{
		d.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		d.get("http://www.veethi.com/places/india_banks-ifsc-micr-codes.html");
		assertEquals("Bank IFSC Codes, MICR Codes: Find IFSC, MICR Codes for Major Banks in India",d.getTitle());
		//Select Bank
		Select bank=new Select(d.findElement(By.id("selBank")));
		bank.selectByIndex(4);
		//Select State
		Select state=new Select(d.findElement(By.id("selState")));
		state.selectByVisibleText("Andhra Pradesh");
		//Select city
		Select city=new Select(d.findElement(By.id("selCity")));
		city.selectByVisibleText("Hyderabad");
		//Select city
		Select branch=new Select(d.findElement(By.id("selBranch")));
		branch.selectByVisibleText("Sanjeeva Reddy Nagar");
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
