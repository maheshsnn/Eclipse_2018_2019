package targetpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementsDemo {

	public static void main(String[] args) throws Exception {
		//Launch the browser
		WebDriver d=new FirefoxDriver();
		//Load the web page
		d.get("http://book.theautomatedtester.co.uk");
		//Get page title
		String t1=d.getTitle();
		String t2="Selenium: Beginners Guide";
		//Verify page title
		if(t1.equals(t2))
		{
			WebElement tfield=d.findElement(By.id("q"));
			//Type the text
			tfield.sendKeys("Selenium");
			System.out.println("The value of text field is:"+tfield.getAttribute("value"));
			//Click the link
			d.findElement(By.linkText("Chapter1")).click();
			WebElement radio=d.findElement(By.id("radiobutton"));
			//Check the status of radio button
			if(radio.isSelected())
			{
				System.out.println("Radio button is already selected");
			}
			else
			{
				radio.click();
			}
			WebElement checkbox=d.findElement(By.name("selected(1234)"));
			//Check the status of check box
			if(checkbox.isSelected())
			{
				System.out.println("Check box is already selected");
			}
			else
			{
				checkbox.click();
			}
			//Clear the contents of text area
			d.findElement(By.id("html5div")).clear();
			//Type the text
			d.findElement(By.id("html5div")).sendKeys("Selenium");
			//DD
			Select dd=new Select(d.findElement(By.id("selecttype")));
			dd.selectByIndex(2);
			WebElement e=dd.getFirstSelectedOption();
			System.out.println("Selected option is: "+e.getText());
		}
		
		Thread.sleep(5000);
		d.quit();
			

	}

}
