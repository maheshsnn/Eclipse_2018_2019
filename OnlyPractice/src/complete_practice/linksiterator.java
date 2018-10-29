package complete_practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class linksiterator {
	static  WebDriver driver;
	
	@Test
	public void mm() throws InterruptedException{
		

		//System.setProperty("webdriver.chrome.driver", "G:\\lib\\chromedriver.exe");
		driver=new FirefoxDriver();
		
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		
		
		List<WebElement>alllinks=driver.findElements(By.xpath("//li[starts-with(@id,'menu_')]"));
		

for(int i=0;i<alllinks.size();i++)
{
	
	String s=alllinks.get(i).getText();
	
	driver.findElement(By.xpath("//li[starts-with(@id,'menu_+'s'+')]")).click();
System.out.println(alllinks.get(i).getText());
}
		
		
	/*	System.out.println(alllinks.size());
		

		for(int i=0;i<alllinks.size();i++)
		{
			
			
			String texts=alllinks.get(i).getText();
		
			WebDriverWait wait=new WebDriverWait(driver,100);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(texts)));
			
			Thread.sleep(2000);
		WebElement linkss=driver.findElement(By.linkText(texts));
		
		linkss.click();
		
		System.out.println("clicked on  "+texts);
		Thread.sleep(3000);
			
     
		
		}*/
		driver.close();
		
	}

}
