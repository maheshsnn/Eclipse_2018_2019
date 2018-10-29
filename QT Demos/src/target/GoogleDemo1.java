package target;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleDemo1 {

	public static void main(String[] args) throws Exception {
		//Launching browser
		WebDriver d=new FirefoxDriver();
		//Loading google page
		d.get("https://www.google.co.in/");
		//Return title
		String t1=d.getTitle();
		System.out.println("Page title is: "+t1);
		String t2="Google";
		if(t1.equals(t2))
		{
			WebElement tfield=d.findElement(By.id("gbqfq"));
			//d.findElement(By.id("gbqfq")).sendKeys("Selenium");
			//Type text
			tfield.sendKeys("Selenium");
			//Click on search button
			d.findElement(By.id("gbqfb")).click();
			System.out.println("The value of text field is:"+tfield.getAttribute("value"));
			
		}
		Thread.sleep(5000);
		//Close the window
		d.quit();

	}

}
