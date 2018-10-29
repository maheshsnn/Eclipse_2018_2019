package pRACTICE;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Multiplewindows2 {
	WebDriver d;
	@BeforeClass
	public void multi()
	{
		d=new FirefoxDriver();
		d.get("http://www.facebooklogin.com");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	}
	@Test
	public void sell()
	{
	Set<String>w=d.getWindowHandles();
	System.out.println("No of handle"+w.size());
	System.out.println("the handles are");
	String handles[]=new String[w.size()];
	int i=0;
	for (String s:w)
	{
		handles[i]=s;
		System.out.println(s);
		i++;
	}
	d.switchTo().window(handles[1]);
	
	}

}
