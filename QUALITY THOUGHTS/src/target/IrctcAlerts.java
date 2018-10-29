package target;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcAlerts {
	WebDriver d;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\SELENIUM\\lib\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
	}

	@After
	public void tearDown() {
		d.quit();
	}

	@Test
	public void testIrctcAlerts() throws InterruptedException {
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		d.findElement(By.id("loginbutton")).click();
		Thread.sleep(5000);
		Alert al = d.switchTo().alert();
		assertEquals("Enter User ID", al.getText());
		Thread.sleep(5000);
		al.accept();
		Thread.sleep(5000);

	}

}
