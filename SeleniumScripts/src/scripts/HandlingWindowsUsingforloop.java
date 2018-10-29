package scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindowsUsingforloop {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		WebDriver d=new FirefoxDriver();
		
		String parent=d.getWindowHandle();
		
		d.findElement(By.xpath("")).click();
		Set<String>allhandles=d.getWindowHandles();
		int count=allhandles.size();
		for(String child:allhandles)
		{
			if(!parent.equals(child))
			{
			d.switchTo().window(child);
		}
		
	}
d.switchTo().window(parent);
}}
