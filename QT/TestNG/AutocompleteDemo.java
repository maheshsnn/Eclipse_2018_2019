package targetpack;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutocompleteDemo {
	 WebDriver d;
		
		@Test
		public void autocomplete() throws Exception
		{
			d.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
			d.manage().window().maximize();
			d.get("http://jqueryui.com/autocomplete/");
			assertEquals("Autocomplete | jQuery UI",d.getTitle());
			d.switchTo().frame(0);
			d.findElement(By.id("tags")).sendKeys("a");
			List<WebElement> s=d.findElements(By.className("ui-menu-item"));
			System.out.println("No of suggestions:"+s.size());
			System.out.println("**** Suggestions are **** ");
			//Print the suggestions
			for(WebElement e:s)
			{
				System.out.println(e.getText());
			}
			//Selecting 3rd suggestion
			if(s.size()>=3)
			{
				for(int i=0;i<3;i++)
				{
					d.findElement(By.id("tags")).sendKeys(Keys.ARROW_DOWN);
					Thread.sleep(2000);
				}
				d.findElement(By.id("tags")).sendKeys(Keys.ENTER);
				
			}
		
			Thread.sleep(4000);
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
