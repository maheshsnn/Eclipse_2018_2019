package target;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Pellipandirianotations {

WebDriver d	;
@Before
public void setup()

{
	d=new FirefoxDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
	
	
}

 @Test
public void testPellipandirianotations()
{
	 
	 d.get("http://eenadupellipandiri.net");
	 
	 String S=d.getTitle();
	 String R="Eenadu Telugu Matrimony, exclusive online matrimony for Telugus";
	 assertEquals(R,S);	 
	 d.findElement(By.partialLinkText("Register ")).click();
	 d.findElement(By.name("name")).sendKeys("mahesh");
	 Select dd=new Select(d.findElement(By.name("registered_by")));
	 dd.selectByIndex(3);
	 d.findElement(By.name("email")).sendKeys("maheshsnn@gmail..com");
	 WebElement checkbox=d.findElement(By.name("email_status"));
	 if (checkbox.isSelected())
	 {
	 System.out.println("checkbox is already selected");
	 }
	 else
	 {
		 checkbox.click();
	 }
	 d.findElement(By.name("placeofbirth")).sendKeys("mandamarri");
	 WebElement radiobutton=d.findElement(By.name("gender"));
	 if(radiobutton.isSelected())
	 {
		 System.out.println("radio button is already selected");
	 }
	 else
	 {
		 radiobutton.click();
	 }
	 
	 Select dc=new Select(d.findElement(By.name("dob_day")));
	 dc.selectByIndex(6);
	 Select dg=new Select(d.findElement(By.name("dob_month")));
	 dg.selectByIndex(5);
	 Select dw=new Select(d.findElement(By.name("dob_year")));
	 dw.selectByIndex(5);
	 Select da=new Select(d.findElement(By.name("tob_hour")));
	 da.selectByIndex(6);
	 Select db=new Select(d.findElement(By.name("tob_minute")));
	 db.selectByIndex(5);
	 Select df=new Select(d.findElement(By.name("tob_mod")));
	 df.selectByIndex(1);
	 Select x=new Select(d.findElement(By.name("marital_status")));
	 x.selectByIndex(1);
	 WebElement radio=d.findElement(By.id("childrenN"));
	 if(radio.isSelected())
	 {
		 System.out.println("radio  is already selected");
	 }
	 else
	 {
		 radio.click();
	 }
	 
	 Select Y=new Select(d.findElement(By.name("height")));
	 Y.selectByIndex(5);
	 d.findElement(By.name("weight")).sendKeys("65");
	 Select V=new Select(d.findElement(By.id("can_speak_lang")));
	 V.selectByValue("Telugu");
	 V.selectByValue("English");
	 
	 d.findElement(By.name("personalvalues")).sendKeys("maheshsnn@gmail.com hyderabad mandamrri 78-102/1 raman colony adilabad");
	 
	 
	
}
	
@After
public void tearDown()
{
 d.quit();
	
}
	 
	 
 }


















