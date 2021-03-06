package targetpack;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements {
	WebDriver d;
	@Before
	public void setUp()
	{
		d=new FirefoxDriver();
	}
	@Test
	public void testWebElements() throws Exception
	{
		d.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
		d.get("http://book.theautomatedtester.co.uk/");
		//Type text
		d.findElement(By.id("q")).sendKeys("Selenium");
		//Click on Chapter1 link
		d.findElement(By.linkText("Chapter1")).click();
		WebElement radio=d.findElement(By.id("radiobutton"));
		//Check status of radio button
		if(radio.isSelected())
		{
			System.out.println("Radio button is already selected");
		}
		else
		{
			radio.click();
		}
		WebElement checkbox=d.findElement(By.name("selected(1234)"));
		//Check status of check box
		if(checkbox.isSelected())
		{
			System.out.println("Check box is already selected");
		}
		else
		{
			checkbox.click();
		}
		//Select option from DD
		Select dd=new Select(d.findElement(By.id("selecttype")));
		dd.selectByIndex(2);
		WebElement e=dd.getFirstSelectedOption();
		System.out.println("Selected option is: "+e.getText());
		//Text area
		d.findElement(By.id("html5div")).clear();
		d.findElement(By.id("html5div")).sendKeys("Selenium");
		Thread.sleep(5000);
	}
	@After
	public void tearDown()
	{
		d.quit();
	}

	
}
