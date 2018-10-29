package pRACTICE;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class Gmaillogin {
	
	WebDriver d;
	@AfterClass
	public void teardown()
	{
		d.quit();
	}
	@BeforeClass
	public void gmaillogin()
	{
		d=new FirefoxDriver();
		d.get("http://www.facebooklogin.com");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	}
	@Test
	public void gmailtest() throws Exception
	{
	
		
	for(int i=0;i<=5;i++)
	{
		d.findElement(By.id("email")).clear();
	d.findElement(By.id("email")).sendKeys(Gmailxslx.readcell(i,0));
	
	d.findElement(By.id("pass")).clear();
	
	d.findElement(By.id("pass")).sendKeys(Gmailxslx.readcell(i,1));
	
	Thread.sleep(3000);
	d.findElement(By.xpath("//label[@id='loginbutton']/input")).click();
	
    if(d.findElement(By.xpath("//h2[@class='uiHeaderTitle']")).isDisplayed())
	{
		Gmailxslx.writecell(i,3, false);
	}
	else
	{
		Gmailxslx.writecell(i,3, true);	
	}
		
	}}}
	
	
	
	
	

	


