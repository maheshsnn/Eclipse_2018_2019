package practice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class iterator {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		String Parent_window=driver.getWindowHandle();
		
		
		Set<String>allwindows= driver.getWindowHandles();
		Iterator<String> itr=allwindows.iterator();
		
		
		for(String childwindows:allwindows)
		{
			
			if(!Parent_window.equals(childwindows))
			{
				driver.switchTo().window(childwindows);
			}
		}
		
		while(itr.hasNext())
		{
			
			String childwindow=itr.next();
			
			if(!Parent_window.equals(childwindow))
			{
				driver.switchTo().window(childwindow);
			}
		}
		
		
		
		
	}

}
