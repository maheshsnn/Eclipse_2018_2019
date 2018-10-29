package complete_practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class jsexecutorm {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
	
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	
	jse.executeScript("document.getElementById('').scrollIntoView()");
	jse.executeScript("document.getElementById('').click()");
	jse.executeScript("windows.scrollBy('0,200')");
	jse.executeScript("document.getElementById('').value='mahesh'");
	jse.executeScript("return document.getElementById('').InnerHtml");
	
	
	
	
	
	}
}
