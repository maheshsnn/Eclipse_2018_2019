package target;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ennadupellipandiri {

	public static void main(String[] args) {
		WebDriver d=new FirefoxDriver();
		d.get("http://eenadupellipandiri.net/");
		d.findElement(By.partialLinkText("Register")).click();
		d.findElement(By.name("name")).sendKeys("mahesh");
		Select dd=new Select(d.findElement(By.name("registered_by")));
		dd.selectByIndex(2);
		WebElement checkbox=d.findElement(By.name("email_status"));
		if (checkbox.isSelected())
		{
			System.out.println("Checkbox already selected");
		}
		else
		{
			checkbox.click();
		}
		WebElement radio=d.findElement(By.id("gender"));
		if (radio.isSelected())
		{
			System.out.println("radio already selected");
		}
		else
		{
			radio.click();
		}
		Select db = new Select(d.findElement(By.name("dob_day")));
		db.selectByIndex(2);
		Select dc=new Select(d.findElement(By.id("can_speak_lang")));
		dc.selectByVisibleText("English");
		dc.selectByVisibleText("Telugu");
		
		d.quit();
		
		
		
	}

}

