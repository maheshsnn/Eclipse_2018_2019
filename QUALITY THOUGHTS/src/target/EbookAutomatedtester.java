package target;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EbookAutomatedtester {

	public static void main(String[] args) throws Exception 
	{
		
	WebDriver d =new FirefoxDriver();
	d.get("http://book.theautomatedtester.co.uk/");
	d.findElement(By.id("q")).sendKeys("mahesh");
	d.findElement(By.linkText("Chapter1")).click();
	WebElement radio = d.findElement(By.id("radiobutton"));
	if (radio.isSelected())
	{
 System.out.println("Radiobutton already selected");
 
	}

	else
	{
		radio.click();
	
	}
	
	WebElement checkbox = d.findElement(By.name("selected(1234)"));
	
	if ( checkbox.isSelected())
	{
 System.out.println("checkbox already selected");
 
	}

	else
	{
		checkbox.click();
		
	}
     new Select(d.findElement(By.id("selecttype"))).selectByIndex(2);
     d.findElement(By.id("html5div")).clear();
     d.findElement(By.id("html5div")).sendKeys("mahesh");
     
     Thread.sleep(1000);
     
     d.quit();
	
	}

}
