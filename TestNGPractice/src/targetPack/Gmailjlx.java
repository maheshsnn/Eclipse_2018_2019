package targetPack;

//import org.junit.Test;
import java.io.FileInputStream;
//import java.util.List;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;
import jxl.Sheet;
import jxl.Workbook;
//import jxl.read.biff.BiffException;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Gmailjlx {

	WebDriver d;
	@BeforeMethod
	public void meth1()
	{
		
		d=new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS); 
			}
	@AfterMethod
	public void meth2() 
	{
		d.quit();
		
	}
	@Test
	public void meth3() throws  Exception
	{
		d.get("http://www.gmail.com");
	
		
		assertEquals("Gmail",d.getTitle());
		//RFeading user name and password from xl-sheet
		FileInputStream fis=new FileInputStream("C:\\New folder\\sunny.xls");
		Workbook wb=Workbook.getWorkbook(fis);
		Sheet s=wb.getSheet("Sheet1");
		for(int i=1;i<s.getRows();i++)
		{
			//Enter user name
			d.findElement(By.id("Email")).clear();
			d.findElement(By.id("Email")).sendKeys(s.getCell(0,i).getContents());
			
			//Get User Name
			String uname=d.findElement(By.id("Email")).getAttribute("value");
			//Enter Password
			d.findElement(By.id("Passwd")).clear();
			d.findElement(By.id("Passwd")).sendKeys(s.getCell(1,i).getContents());
			
			//Get password
			String password=d.findElement(By.id("Passwd")).getAttribute("value");
			//Click on login
			d.findElement(By.id("signIn")).click();
			
			//Blank username & Blank password
			if(uname.equals("") && password.equals(""))
			{
				assertEquals("Enter your email address.",d.findElement(By.id("errormsg_0_Email")).getText());
				//assertEquals("Enter your password.",d.findElement(By.id("errormsg_0_Passwd")).getText());
			}
			//Blank username
			else if(uname.equals(""))
			{
				assertEquals("Enter your email address.",d.findElement(By.id("errormsg_0_Email")).getText());
			}
			//Blank password
			else if(password.equals(""))
			{
				assertEquals("Enter your password.",d.findElement(By.id("errormsg_0_Passwd")).getText());
			}
					//Valid user name & valid password
			else if(d.findElement(By.xpath("//span[@class='gb_da gbii']")).isEnabled())
			{
				Thread.sleep(5000);
				d.findElement(By.xpath("//span[@class='gb_da gbii']")).click();
				d.findElement(By.linkText("Sign out")).click();
			}
			//Invalid username & invalid password
			else
			{
				assertEquals("   The email or password you entered is incorrect.",d.findElement(By.xpath("errormsg_0_Passwd")).getText());
			}
			
		}	//(d.findElement(By.xpath("//span[@class='gb_da gbii']")))
		
				
		Thread.sleep(4000);
	}
	
	

	
	
	}
	
	
	
		
		
		
	
