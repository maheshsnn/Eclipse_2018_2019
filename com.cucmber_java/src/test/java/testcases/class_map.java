package testcases;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.Maps;

//import com.google.common.collect.Maps;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class class_map {

	WebDriver driver;

/*@Given("^Open gmail and start application$")
public void open_gmail_and_start_application() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("1");
	System.out.println("given folder");
	

	
	System.setProperty("webdriver.chrome.driver","G:\\lib\\Cucumber\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://accounts.google.com");
	
}*/

@When("^Entered username and password$")
public void entered_username_and_password(DataTable credentials) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("1");
	System.out.println("@When folder in class two");
	Thread.sleep(4000);
	
	//List<List<String>>dealvalues=credentials.raw();
	//driver.findElement(By.xpath("//*[@class='whsOnd zHQkBf']")).sendKeys(dealvalues.get(0).get(0));

	
	for(Map<String,String>al:credentials.asMaps(String.class, String.class))
	{
		driver.findElement(By.xpath("//*[@class='whsOnd zHQkBf']")).sendKeys(al.get("username"));
	}

}

@Then("^usershould be able to login into gmail$")
public void usershould_be_able_to_login_into_gmail() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("1");
	driver.quit();
}



}
