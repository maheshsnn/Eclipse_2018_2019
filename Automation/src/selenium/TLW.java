package selenium;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TLW 
{	
	WebDriver d ;
			
	@BeforeMethod
	@Parameters("browser")
	public void web(String browser)
	{
		
		if(browser.equalsIgnoreCase("FF"))
		{
				d=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("Webdriver.chrome.driver" , "D:\\Selenium\\lib\\chromedriver.exe");
			d=new ChromeDriver();
		}

		else if(browser.equalsIgnoreCase("IE"))
		{
			
			System.setProperty("Webdriver.Internetexplorer.driver" , "D:\\Selenium\\lib\\IEDriverServer.exe");
			d=new InternetExplorerDriver();
		}
		
	//d.manage().window().maximize();
	}
	
	
	@AfterMethod
	public void aft()
	{
	d.close();
	}
	
	////////////////////////////////////////////////////////////////
	
	    @Test(priority=1)
	    public void tes()
	    {
	    	System.out.println("/////////////////////////////////////////////////////");
		d.get("http://appost.aponline.gov.in/PostalWebPortal/HomePage_AP.aspx");
		List<WebElement>Row=d.findElements(By.xpath("//table[@id='DataGridPayOrderInfo']/tbody/tr"));
	     System.out.println("No of Rows are " +Row.size());
	 	List<WebElement>Cols=d.findElements(By.xpath("//table[@id='DataGridPayOrderInfo']/tbody/tr/td"));
	 	System.out.println("NO of Coloumns are "+Cols.size());
	 	
	 	int x,y ;
	 	x=1 ;
	 	for (WebElement row:Row)
	 	{
	 	List<WebElement>coloumns=row.findElements(By.tagName("td"));
	 	y=1;
	 	for(WebElement z:coloumns)
	 	{
	 	System.out.println("Rows *"+x   +" , columns *"+y    +",  Text="+z.getText());
	 	y++ ;
	 	}
	 	x++;
	    }
	 	}

	////////////////////////////////////////////////////////////////////////////////
	    @Test(priority=2)
	    public void links()
	    {
	    	System.out.println("/////////////////////////////////////////////////////");
		d.get("http://www.seleniumhq.org");
		List<WebElement>l=d.findElements(By.xpath("//li[starts-with(@id ,'menu')]"));
		System.out.println("No of links are "+l.size());
		System.out.println("The links are ");
		String links[]=new String[l.size()];
		int i=0;
		for(WebElement e:l)
		{
			links[i]=e.getText();
			System.out.println(e.getText());
			i++;
		}
		for(String t:links)
		{
			
		d.findElement(By.linkText(t)).click();
		boolean x=d.findElement(By.linkText(t)).isDisplayed();
			
		if(x==true)
		{
		System.out.println("Links are available ");
		}
		else
		{
		System.out.println("Links not available");
		}
	    }
		}
	    
   ////////////////////////////////////////////////////////////////////////
	    
	    @Test(groups="g" ,priority=3)
	    public void mnc() throws Exception
	    {
	    	System.out.println("/////////////////////////////////////////////////////");
	     d.get("https://www.irctc.co.in");
	    boolean s=d.findElement(By.xpath("//form[@id='loginFormId']/div/div")).isDisplayed();
	    if(s==true)
	    {
	    System.out.println("windows displayed");
	    }
	    else
	    {
	    	System.out.println("we are in wrong display");
	    }
	    
	    Actions al=new Actions(d);
	   al.moveToElement(d.findElement(By.xpath("//a[@id='irctc_tourism']/font"))).build().perform();
	    Thread.sleep(5000);
	    d.findElement(By.xpath("//a[contains(text(),'Tour Packages')]")).click(); 
        boolean j=d.findElement(By.xpath("//a[contains(text(),'Login')]")).isDisplayed();
	    if(j=true)
	    {
	    	System.out.println("The window showing is child window one");
	  	 }
                 
	   d.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	 	   
	    Set<String>w=d.getWindowHandles();
	    System.out.println("No of windows"+w.size());
	    System.out.println("The windows are");
	    String handles[]=new String[w.size()];
	    int i=0;
	    for(String S:w)
	    {
	    	handles[i]=S;
	    	System.out.println(S);
	    	i++;
	    	  	  	
	    }
	    d.switchTo().window(handles[1]);
	    
	    boolean p=d.findElement(By.xpath("//a[contains(text(),'Login')]")).isDisplayed();
	    if(p=true)
	    {
	    	System.out.println("The window showing is child window");
	  	 }
	    
	    d.switchTo().window(handles[0]);
	    
	    boolean t=d.findElement(By.xpath("//form[@id='loginFormId']/div/div")).isDisplayed();
	    if(t==true)
	    {
	    	
	      System.out.println("window showing is parent window");
	    }
	    d.findElement(By.cssSelector("#usernameId")).sendKeys("maheshsnn");
	    //d.findElement(By.cssSelector("input[name='j_password']")).sendKeys("pass");
	    d.findElement(By.cssSelector("#loginbutton")).click();
	    Alert A=d.switchTo().alert();
	    System.out.println(A.getText());
	    A.accept();
	    System.out.println("Alert got accepted succesfully");
	    d.close();
	    d.switchTo().window(handles[1]);
	    d.close();
	  
	    }
	   
	   
	    	
        }
