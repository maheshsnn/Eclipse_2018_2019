package targetpack;

import static org.testng.Assert.*;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class D {
    WebDriver d;
	
    @Test
    public void testFrame() throws Exception
    {
    	assertEquals("Pass",results());
    	
    }
    public String results() throws Exception
    {
    	try
    	{
    	d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	d.manage().window().maximize();
    	d.get("http://appost.aponline.gov.in/PostalWebPortal/HomePage.aspx");
    	//assertEquals("Selenium - Web Browser Automation",d.getTitle());
    	//table[@id="tblMGNREGAReport"]/tbody/tr
    	List<WebElement> tr=d.findElements(By.xpath("//table[@id='DataGridPayOrderInfo']/tbody/tr"));
    	System.out.println("NUMBER OF ROWS IN THIS TABLE = "+tr.size());
    	
    	List<WebElement> td=d.findElements(By.xpath("//table[@id='DataGridPayOrderInfo']/tbody/tr/td"));
		System.out.println("NUMBER OF Columns IN THIS TABLE = "+td.size()/tr.size());
		
		int row_num,col_num;
        row_num=1; 
        for(WebElement trElement : tr)
        {
            List<WebElement> td1=trElement.findElements(By.xpath("td"));
           
            col_num=1;
            for(WebElement tdElement : td1)
            {
                System.out.println("Row # "+row_num+", Col # "+col_num  + ", Text=" +tdElement.getText());
                col_num++;
                if(row_num == 4 && col_num == 1)
                {
                	assertEquals("ANANTAPUR1",tdElement.getText()); 
                }
            }
            row_num++;
            
        }
		
    	//WebElement table=d.findElement(By.id("DataGridPayOrderInfo"));
    	/*List<WebElement> r=table.findElements(By.tagName("tr"));
    	System.out.println("Rows in a table"+r.size());
    	
    	List<WebElement> c=table.findElements(By.tagName("td"));
    			//xpath("//tr/td[starts-with(@className,'form')]"));
    			//(By.xpath[starts-with(@className,'formhd')]);//("formhdEnrollmentInfo"));
    	System.out.println("col in a table"+c.size());*/
    	
    	return "Pass";
    	
    	
    	}
    	catch(Exception ex)
    	{
    		//Current Date
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm");
    		Date date = new Date();
    		System.out.println(dateFormat.format(date));
            
            // then Augmenter will add the TakesScreenshot methods to the instance
            File scrFile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("D:\\Selenium\\TargetPack\\Results"+dateFormat.format(date)+".png"));
            return "Fail";
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
