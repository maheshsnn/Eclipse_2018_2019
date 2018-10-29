package selenium;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AllinOneProgAutomatin {
	
	WebDriver d;
	
	
	
	
	@BeforeClass
	@Parameters("browser")
	public void bf(String browser)
	{

		if(browser.equalsIgnoreCase("ff"))
		{
			d=new FirefoxDriver();
		}
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("WebDriver.chrome.driver" ,".\\lib\\chromedriver.exe");
			d=new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("WebDriver.chrome.driver" ,".\\lib\\IEDriverServer.exe");
			d=new InternetExplorerDriver();
		}
	
//		WebDriverWait wait= new WebDriverWait(d,200);
//		WebElement e=wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		
	}
	
	
	@Test
	public void tes() throws Exception
	{	assertEquals("pass",getScreenshot());			
	}
	String getScreenshot() throws Exception
	{
		
		try{
			d.get("http://www.gmail.co.in/");
			   // d.findElement(By.xpath("//a[contains(text(),'Sign In')]]")).click();	
			    d.findElement(By.xpath("//input[@id='identifierI']")).sendKeys("maheshsnn");
					return "pass" ;
		}
		
		catch(Exception e)
		{
			DateFormat dateFormat=new SimpleDateFormat(" dd-mm-yy  HH-MM");
			Date date=new Date();
			
			File scrFile =((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("G:\\CreenshotsF\\mahesh "+ dateFormat.format(date)+".png"));
			
			
			return "fail";
		}
	}
	
	
	@Test
	public void linkss()
	{
		List<WebElement>l=d.findElements(By.xpath(""));
		System.out.println("No of links are" +l.size());
		System.out.println("The links are");
		String links[]=new String[l.size()];
		
		int i=0 ;
		for(WebElement e:l)
		{
			links[i]=e.getText();
			System.out.println(e.getText());
			i++ ;
		}
		for(String t:links)
		{
			d.findElement(By.linkText(t)).click();
			
		}
			
		
	}
	@Test
	public void winh()
	{
		Set<String>w=d.getWindowHandles();
		System.out.println("No of windows are" +w.size());
		System.out.println("The windows are");
		String handles[]=new String[w.size()];
		
		int i=0 ;
		for(String s:w)
		{
			handles[i]=s ;
			System.out.println(s);
			i++ ;
		}
		d.switchTo().window(handles[0]);
		
	}
	@Test
	public void wind()
	{
		List<WebElement>ROW=d.findElements(By.xpath("td\tr"));
		System.out.println("No of Rows are " +ROW.size());
		List<WebElement>COL=d.findElements(By.xpath(""));
		System.out.println("No of cols are"+COL.size());
		int x,y ;
		
		x=0 ;
		for(WebElement Rows:ROW)
		{
			List<WebElement>Coloumns=Rows.findElements(By.linkText("td"));
			
			y=0 ;
			for(WebElement Z:Coloumns)
			{
				System.out.println("Rows are"+x +"Coloumns are"+y +"Text ="+Z.getText());
			}
			y++ ;
			
		}
		x++ ;
		
	}
	@Test
	public void Readcell(int row,int col) throws Exception
	{
		FileInputStream fis=new FileInputStream("path") ;
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		XSSFRow rows=s.getRow(row);
		XSSFCell Cols=s.getRow(row).getCell(col);
		
	}
	@Test
	public void writecell(int row,int col,boolean valuee) throws Exception
	{
		FileInputStream fis=new FileInputStream("path") ;
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		XSSFRow rows=s.getRow(row);
		XSSFCell Cols=s.getRow(row).getCell(col);
		if(Cols==null)
				{
			
			XSSFCell Cols2=rows.createCell(col);
			Cols2.setCellValue(valuee);
			
				}
		else
		{
			Cols.setCellValue(valuee);
		}
		fis.close();
		FileOutputStream fos=new FileOutputStream("path") ;
		wb.write(fos);
		fos.close();
		
	}

}
