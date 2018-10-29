package pRACTICE;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Multiplewindows {
	
	WebDriver d;
	
	@BeforeClass
	public void multiplewindows()
	{
		d=new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
				
	}
	@Test
	public void windows()
	{
		Set<String>w=d.getWindowHandles();
		System.out.println("No of handles"+w.size());
		System.out.println("The handles are");
		String handles[]=new String[w.size()];
		int i=0;
		for(String s:w)
		{
			handles[i]=s;
			System.out.println(s);
			i++;
		}
		d.switchTo().window(handles[1]);
		d.switchTo().window(handles[0]);
		
		
		
		
		
	}

}
