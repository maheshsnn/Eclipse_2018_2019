package selenium;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;




import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WatConditions
{
	WebDriver d;
	
	
	@BeforeMethod
	@Parameters("browser")
	public void mm(String browser) throws Exception
	{
		if(browser.equalsIgnoreCase("ff"))
		{
			d=new FirefoxDriver();
		}
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("WebDriver.chrome.driver" ,"G:\\AUTOMATION WORKSPACE\\lib\\chromedriver.exe");
			d=new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("WebDriver.chrome.driver" ,"G:\\AUTOMATION WORKSPACE\\lib\\IEDriverServer.exe");
			d=new InternetExplorerDriver();
		}
		
		//webaDriver wait condition
		WebDriverWait wait=new WebDriverWait(d,200);
		WebElement e=wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		
		
		d.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		d.manage().window().maximize();
		
		
		
		//script to scroll the scroll bar of the browser up and down
		
	((RemoteWebDriver)d).executeScript("windows.scrollBy(0,200)", "");
	
	
	
	
	
	}
	@Test()
	public static void mm(int rowNO,int colNO) throws Exception
	{
		FileInputStream fis=new FileInputStream("path of the file name") ;
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		XSSFRow row=s.getRow(rowNO);
		XSSFCell cell=s.getRow(rowNO).getCell(colNO);
		}
	@Test
	public static void mm(int rowNO,int colNO ,boolean valuee) throws Exception
	{
		FileInputStream fis=new FileInputStream("path of the file name") ;
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		XSSFRow row=s.getRow(rowNO);
		XSSFCell cell=s.getRow(rowNO).getCell(colNO);
		if(cell==null)
		{
			XSSFCell cell2=row.createCell(colNO);
			cell2.setCellValue(valuee);
		}
		else
		{
			cell.setCellValue(valuee);
		}
		fis.close();
		FileOutputStream fos=new FileOutputStream("");
		wb.write(fos);
		fos.close();
		
		}
	
	@Test
	public void m() throws Exception
	
	{
		assertEquals("pass" ,getScreenshot()) ;
	}

	String getScreenshot() throws Exception
	{
	try
	{
		// handling links
		
		((RemoteWebDriver)d).executeScript("windows.scrollBy(0,200)","");
		
		
		List<WebElement>l=d.findElements(By.id(""));
		System.out.println("The number of links are "+ l.size());
		System.out.println("the links are");
		String links[]=new String[l.size()];
		
		int i=0 ;
		
		for(WebElement e:l)
		{
			links[i]=e.getText();
			System.out.println(e.getText());
			i++;
			
		}
		for(String s:links)
		{
			d.findElement(By.linkText(s)).click();
			
		}
		/////////////////////////////////
		
		//handling windows
		
		Set<String>w=d.getWindowHandles();
		System.out.println("The No.of windows are"+w.size());
		System.out.println("the windows are ");
		String handles[]=new String[w.size()];
		int j=0 ;
		for(String s:w)
		{
			handles[j]=s;
			System.out.println(handles[j]);
		j++;
		}
		d.switchTo().window(handles[1]);
		
		/////////////////////////////////////
		
		//handling webTable
		
		List<WebElement>ROWS=d.findElements(By.xpath(""));
		System.out.println("The no of rows are"+ROWS.size());
		List<WebElement>COL=d.findElements(By.xpath(""));
		System.out.println("The no of rows are"+COL.size());
		
		int x,y ;
		
		x=0 ;
		for(WebElement row:ROWS)
		{
			List<WebElement>coloumns=d.findElements(By.xpath("td")) ;
			y=0 ;
			for(WebElement Z:coloumns)
			{
				System.out.println("Rows"+x+ "COlS" +y+ "text="+Z.getText());
				y++ ;
			}
			x++ ;
		}
		
		
		
		return "pass" ;
		
	}
	
	catch(Exception e)
	{
		DateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy hh-mm");
		Date date=new Date();
		File ScrFile=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(ScrFile, new File(""+dateFormat.format(date)+""+".png"));
		return "fail" ;
	}	
				
	}
	
	//xml file writing 
	
	
//	<?xml version="1.0" encoding="UTF-1.8"?>
//	<Suite name="" parallel="methods">
//	<parameter="browser"   value="ff">
//	<test name="test">
//	<groups>
//	<run>
//	<include name=""/>
//	</run>
//	</groups>
//	<classes>
//	<class name=""/>
//	</classes>
//	</test>
//	</suite>
	
	
	
	
	
	

}
