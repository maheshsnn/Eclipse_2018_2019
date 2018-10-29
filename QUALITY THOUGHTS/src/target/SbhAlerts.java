package target;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SbhAlerts {
WebDriver d;	
@Before
public void setup()
{
System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\lib\\chromedriver.exe ");
d=new ChromeDriver();
d.manage().window().maximize();

}
@After
public void tearDown()
{
d.quit();
}
@Test
public void testAlertDemo() throws InterruptedException
{
d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
d.get("https://retail.onlinesbi.com/retail/login.htm");	
d.findElement(By.className("phisingcontinueButton")).click();
d.findElement(By.id("Button2")).click();
Alert al=d.switchTo().alert();
assertEquals("Enter username",al.getText());
Thread.sleep(5000);
al.accept();
d.findElement(By.id("username")).sendKeys("maheshsnnn");
d.findElement(By.id("Button2")).click();
Thread.sleep(5000);
assertEquals("Enter password",al.getText());
Thread.sleep(5000);
al.accept();
d.findElement(By.id("label2")).sendKeys("sunny@1816");
d.findElement(By.id("Button2")).click();
Thread.sleep(5000);


}

}
