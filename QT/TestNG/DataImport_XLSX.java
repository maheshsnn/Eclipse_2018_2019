package targetpack;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataImport_XLSX {
	WebDriver d;
	@Test
	public void dataImport() throws Exception
	{
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.google.co.in/?gws_rd=ssl");
		assertEquals("Google",d.getTitle());
		
		FileInputStream fis=new FileInputStream("F:\\Selenium_Sripts_Jan15\\Target\\TestData\\DataImport_XLSX.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		for(int i=0;i<s.getLastRowNum()+1;i++)
		{
			d.findElement(By.id("gbqfq")).clear();
			//System.out.println(s.getRow(i).getCell(i));
			d.findElement(By.id("gbqfq")).sendKeys(s.getRow(i).getCell(0).getStringCellValue());
			Thread.sleep(2000);
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
