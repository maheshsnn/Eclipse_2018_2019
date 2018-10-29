package target;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {
	
public static void main(String[] args)
	{
	WebDriver d=new FirefoxDriver();
	d.get("https://www.google.co.in");
	d.findElement(By.id("gbqfq")).sendKeys("gmail login");
	d.findElement(By.id("gbqfb")).click();
    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	d.findElement(By.linkText("Gmail - Google")).click();
     WebElement S=d.findElement(By.id("Email"));
     S.sendKeys("maheshsnn@gmail.com");
       	System.out.println("the value is"+S.getAttribute("value"));
		d.findElement(By.id("Passwd")).sendKeys("bijili@1816");
	d.findElement(By.id("signIn")).click();
	  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 d.findElement(By.xpath("//*[@id=':j']/span")).click();
	// d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 d.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
	 d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 d.findElement(By.id("gb_71")).click();
	 d.quit();

	}

}
