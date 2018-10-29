package target;

import java.util.concurrent.TimeUnit;




import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium 
{
	
WebDriver d ;
@Before
public void  setup()


{
	d=new FirefoxDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
}

@Test
public void testSelinium()
{
   d.get("http://seleniumhq.org");
   d.findElement(By.linkText("Download")).click();
      WebElement X=d.findElement(By.id("q"));
   X.sendKeys("mahesh");
   System.out.println("the value is"+X.getAttribute("value"));
      d.get("http://seleniumhq.org");
} 
   @Test
   public void testmahesh()
   {
	   d.get("http://book.theautomatedtester.co.uk/");
	   WebElement X=d.findElement(By.id("q"));
	   X.sendKeys("mahesh");
	   System.out.println("the value is"+X.getAttribute("value"));
	  	   d.findElement(By.xpath("html/body/div[2]/ul/li[1]/a")).click();
	  	   WebElement dd=d.findElement(By.id("radiobutton"));
	  	  if( dd.isSelected())
	  	  {
	  		  System.out.println("radiobutton is already selected");
	  	  }
	  	  else
	  	  {
	  		  dd.click();
	  	  }
   
	  	  Select dm=new Select(d.findElement(By.id("selecttype")));
	  	  dm.selectByIndex(2);
	  	 WebElement dx=d.findElement(By.id("radiobutton"));
	  	  if( dx.isSelected())
	  	  {
	  		  System.out.println("dx is already selected");
	  	  }
	  	  else
	  	  {
	  		  dx.click();
	  	  }
	  	  
	  	 d.findElement(By.id("html5div")).clear();
	  	 d.findElement(By.id("html5div")).sendKeys("mahesh sunny");
   } 	  
   
   
   @After
   public void teardown()
   {
	   d.quit();
   }
	   
   }
  
   
   
 
   
   

  
 
   
   
   


	

