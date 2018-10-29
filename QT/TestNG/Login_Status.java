package targetpack;

import static org.testng.Assert.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_Status {
	WebDriver d;
	@Test
	public void login() throws Exception
	{
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("http://192.168.1.7:8080/abc-v01/");
		assertEquals("ABC Bank Login",d.getTitle());
		//Reading user name and password from xl-sheet
		FileInputStream fis=new FileInputStream("F:\\Selenium_Sripts_Jan15\\Target\\TestData\\Login Test Data.xls");
		Workbook wb=Workbook.getWorkbook(fis);
		Sheet s=wb.getSheet("Sheet1");
		
		FileOutputStream fos = new FileOutputStream("F:\\Selenium_Sripts_Jan15\\Target\\Results\\Login_Results.xls");
		WritableWorkbook wwb=Workbook.createWorkbook(fos);
		WritableSheet ws=wwb.createSheet("Results",0);
		//Copy old sheet data to new sheet
		for(int i=0;i<s.getRows();i++)
		{
			for(int j=0;j<s.getColumns();j++)
			{
				Label l1=new Label(j,i,s.getCell(j, i).getContents());
				ws.addCell(l1);
			}
		}
			
		
		for(int i=1;i<s.getRows();i++)
		{
			//Enter user name
			d.findElement(By.name("userName")).clear();
			d.findElement(By.name("userName")).sendKeys(s.getCell(0,i).getContents());
			//Get User Name
			String uname=d.findElement(By.name("userName")).getAttribute("value");
			//Enter Password
			d.findElement(By.name("password")).clear();
			d.findElement(By.name("password")).sendKeys(s.getCell(1,i).getContents());
			//Get password
			String password=d.findElement(By.name("password")).getAttribute("value");
			//Click on login
			d.findElement(By.xpath("//input[@value='Login']")).click();
			//Blank username & Blank password
			if(uname.equals("") && password.equals(""))
			{
				assertEquals("User Name is required.",d.findElement(By.xpath("//div[@id='main']/div/form/font")).getText());
				assertEquals("Password is required.",d.findElement(By.xpath("//div[@id='main']/div/form/font[2]")).getText());
				Label l1=new Label(2,i,"Fail");
				ws.addCell(l1);
			}
			//Blank username
			else if(uname.equals(""))
			{
				assertEquals("User Name is required.",d.findElement(By.xpath("//div[@id='main']/div/form/font")).getText());
				Label l1=new Label(2,i,"Fail");
				ws.addCell(l1);
			}
			//Blank password
			else if(password.equals(""))
			{
				assertEquals("Password is required.",d.findElement(By.xpath("//div[@id='main']/div/form/font[2]")).getText());
				Label l1=new Label(2,i,"Fail");
				ws.addCell(l1);
			}
			//Valid user name & valid password
			else if(isElementPresent(d, By.linkText("Log Out")))
			{
				d.findElement(By.linkText("Log Out")).click();
				Label l1=new Label(2,i,"Pass");
				ws.addCell(l1);
			}
			//Invalid username & invalid password
			else
			{
				assertEquals("Invalid UserName and Password.",d.findElement(By.xpath("//div[@id='main']/div/div/font")).getText());
				Label l1=new Label(2,i,"Fail");
				ws.addCell(l1);
			}
			
		}	
		wwb.write();
		wwb.close();
				
		Thread.sleep(4000);
	}
	
	public boolean isElementPresent(WebDriver driver, By by){
	    try{
	        driver.findElement(by);
	        return true;
	    }catch(NoSuchElementException e){
	        return false;
	    }
	}
	@BeforeMethod
	public void setUp()
	{
		d=new FirefoxDriver();
	}
	@AfterMethod
	public void tearDown()
	{
		d.quit();
	}

}
