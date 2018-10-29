package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Case_one {
/*	
	@Before
	public void beforemethod()
	{
		System.out.println("Before method");
	}
	@After
	public void aftermethod()
	{
		System.out.println("After method");
	}
	*/

@Given("^checking given in scenarioone$")
public void checking_given_in_scenarioone() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("one");

}

@When("^checking \"(.*?)\" and \"(.*?)\"$")
public void checking_and(String arg1, String arg2) throws Throwable {
System.out.println("two   "+arg1+ "and "+arg2); 

}

@Then("^checking scenarioone then$")
public void checking_scenarioone_then() throws Throwable {
 System.out.println("three");
}

@Given("^Checking given in scenariotwo$")
public void checking_given_in_scenariotwo() throws Throwable {
System.out.println("four");
}

@When("^checking \"(.*?)\" in scenariotwo$")
public void checking_in_scenariotwo(String arg1) throws Throwable {
  System.out.println("five   "+arg1);
}

@Then("^cheking them in scenariotwo$")
public void cheking_them_in_scenariotwo() throws Throwable {
 System.out.println("six");
}



























}