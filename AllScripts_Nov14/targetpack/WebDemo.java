package targetpack;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDemo {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.seleniumhq.org/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSample() throws Exception {
    driver.get(baseUrl + "/");
    assertEquals("Selenium - Web Browser Automation", driver.getTitle());
    driver.findElement(By.linkText("Projects")).click();
    assertEquals("Selenium Projects", driver.getTitle());
    driver.findElement(By.linkText("Download")).click();
    assertEquals("Downloads", driver.getTitle());
    driver.findElement(By.linkText("Documentation")).click();
    assertEquals("Selenium Documentation � Selenium Documentation", driver.getTitle());
    driver.findElement(By.linkText("Support")).click();
    assertEquals("Getting Help", driver.getTitle());
    driver.findElement(By.linkText("About")).click();
    assertEquals("About Selenium", driver.getTitle());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
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

