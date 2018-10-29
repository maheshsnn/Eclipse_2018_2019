package complete_practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class windowiterators {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		
		String parentwindow=driver.getWindowHandle();
		Set<String>allhandles=driver.getWindowHandles();
		
		
		Iterator<String>itr=allhandles.iterator();
		
		while(itr.hasNext())
		{
			String childwind=itr.next();
			
			if(!parentwindow.equals(childwind))
			{
				driver.switchTo().window(childwind);
			}
			
		}
		
		
		
	}

}
