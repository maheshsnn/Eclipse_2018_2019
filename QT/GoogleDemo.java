package targetpack;

import java.util.List;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GoogleDemo {
  private WebDriver d;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    d = new FirefoxDriver();
    baseUrl = "https://www.google.co.in/";
    d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testGoogleDemo() throws Exception {
    d.get(baseUrl + "/?gfe_rd=cr&ei=u2i8VKjzIqjV8geG94DYAQ&gws_rd=ssl");
    assertEquals("Google", d.getTitle());
    d.findElement(By.id("gbqfq")).clear();
    //ID
    //d.findElement(By.id("gbqfq")).sendKeys("selenium");
    //Name
    //d.findElement(By.name("q")).sendKeys("Selenium");
    //className
    //d.findElement(By.className("gbqfif")).sendKeys("Selenium");
    //LinkText
    //d.findElement(By.linkText("+You")).click();
    //Partial Link Text
    //d.findElement(By.partialLinkText("+")).click();
    //Xpath
    //d.findElement(By.xpath("//a[contains(text(),'+You')]")).click();
    //TagName
    List<WebElement> links=d.findElements(By.tagName("a"));
    System.out.println("No of links: "+links.size());
    //d.findElement(By.id("gbqfb")).click();
    Thread.sleep(6000);
  }

  @After
  public void tearDown() throws Exception {
    d.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      d.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      d.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = d.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

