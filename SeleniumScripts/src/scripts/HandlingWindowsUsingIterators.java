package scripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindowsUsingIterators {
	static WebDriver d;

	public static void main(String[] args) 
	{
    d=new FirefoxDriver();
    
    String Parent=d.getWindowHandle();
    d.findElement(By.id("")).click();//this will open a new window
   Set<String>allHandles= d.getWindowHandles();
   
   Iterator <String>itr=allHandles.iterator();
   
   while(itr.hasNext())
   {
	String  childwind=itr.next();
	if(!Parent.equals(childwind))
	{
		d.switchTo().window(childwind);
	}
	   
   }
   d.switchTo().window(Parent);
    
		

	}

}
