package complete_practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class windowiterator_forloop {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		String parentwindow=driver.getWindowHandle();
		Set<String>allhandles=driver.getWindowHandles();
		
		for(String child:allhandles)
		{
			if(!parentwindow.equals(child))
			{
				driver.switchTo().window(child);
			}
		}
		
		
	}
	

}
