package practice;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.steadystate.css.util.Output;

public class Webtables
{
	
WebDriver d ;

@BeforeMethod
@Parameters("browser") 
public void bef(String browser) throws Exception
{
	try{
if(browser.equalsIgnoreCase("ff"))
{
	
d= new FirefoxDriver();
}

d.manage().window().maximize();
d.get("http://appost.aponline.gov.in/PostalWebPortal/HomePage_AP.aspx");
d.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
//WebDriverWait wait=new WebDriverWait(d,200);
//WebElement e=wait.until(ExpectedConditions.elementToBeClickable(d.findElement(By.id(""))));
}
	catch(Exception e)
	{
	DateFormat dateFormat=new SimpleDateFormat("dd-mm-yyy hh-mm");
    Date date=new Date();
    File scrFile=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
   FileUtils.copyFile(scrFile,new File( "   "+dateFormat.format(date) +".png"));
    
    
	}
}

@AfterMethod
public void aft()
{
	d.close();
	}

@Test(priority=1)
public void tes() throws Exception
{
	Thread.sleep(5000);
List<WebElement>ROWS=d.findElements(By.xpath("//table[@id='DataGridPayOrderInfo']/tbody/tr"));
System.out.println("No of rows are " +ROWS.size());
List<WebElement>COLS=d.findElements(By.xpath("//table[@id='DataGridPayOrderInfo']/tbody/tr/td"));
System.out.println("No of coloumns are " +COLS.size());

int x,y ;
x=1 ;
for(WebElement row:ROWS)
{
	List<WebElement>coloumns=row.findElements(By.xpath("td"));
	y=1 ;
	for(WebElement z:coloumns)
	{
		System.out.println("ROWS*"+x+"COlms*"+y+ ",Text="+z.getText() );
		y++;
	}
	x++;
	}
try{}
catch(Exception e)
{
	DateFormat dateFormat=new SimpleDateFormat("dd-mm-yy");
	Date date=new Date();
	File scrFile=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File(""+dateFormat.format(date)+".png"));
	
	}

}


}
