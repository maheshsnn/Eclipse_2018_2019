package selenium;

import static org.testng.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Windowshandling 
{
WebDriver d;

@BeforeClass
public void win()
{
	d=new FirefoxDriver();
	d.get("http://www.irctc.co.in/eticketing/loginHome.jsf");
	d.manage().window().maximize();
}
@AfterClass
public void cls()
{d.close();
	}
@Test
public void wind() throws Exception
{
	Actions al=new Actions(d);
	
al.moveToElement(d.findElement(By.xpath("//a[@id='irctc_tourism']/font"))).build().perform();
Thread.sleep(5000);
d.findElement(By.xpath("//a[contains(text(),'Tour Packages')]")).click();
Set<String>w=d.getWindowHandles();
System.out.println("No of handles:"+w.size());
System.out.println("Handles are:");
String handles[]=new String[w.size()];
int i=0;
for(String s:w)
{
	handles[i]=s;
	System.out.println(handles[i]);
	i++;
}
//Switch driver focus from parent window to child window
d.switchTo().window(handles[1]);
//assertTrue(d.findElement(By.linkText("Login")).isDisplayed());
boolean x=d.findElement(By.xpath("//a[contains(text(),'Login')]")).isDisplayed();
if(x=true)
{
	System.out.println("focous is in new window");}
}
}
