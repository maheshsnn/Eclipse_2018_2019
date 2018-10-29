package targetPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;
//import jxl.read.biff.BiffException;
//import static org.testng.Assert.assertEquals;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Jxl {
	
	 WebDriver d;
//	 @Parameters("browser")
//	@BeforeMethod
//	
//	public void setUp(String browser)
//	{
//		 if(browser.equalsIgnoreCase("FF"))
//			{
//				d=new FirefoxDriver();
//			
//	}}
//	@AfterMethod
//	public void meth2() 
//	{
//		//d.quit();
//		
//	}
	@Test
	public void meth3() throws Exception 
	{
		d.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		d.get("http://www.google.com");
		FileInputStream fis=new FileInputStream("C:\\New folder\\Mahesh.xls");
		Workbook wb=Workbook.getWorkbook(fis);
		Sheet s=wb.getSheet(0);
		d.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		for(int i=1;i<s.getRows();i++)
		{
			String value=s.getCell(0,i).getContents();
			d.findElement(By.id("lst-ib")).clear();
			d.findElement(By.id("lst-ib")).sendKeys(value);
		
		}	

		}

		
	}


