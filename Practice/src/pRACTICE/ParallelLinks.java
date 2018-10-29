package pRACTICE;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelLinks {
	WebDriver d;
	
	@BeforeClass
	public void parallellinks()
	{
		d=new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		d.get("");
	}
	
	@Test
	public void linkstest()
	{
		List<WebElement>l=d.findElements(By.id(""));
		System.out.println("No of links:"+l.size());
		System.out.println("The links are");
		String links[]=new String[l.size()];
		int i=0;
		for(WebElement e:l)
		{
			links[i]=e.getText();
			System.out.println(e.getText());
			i++;
		}
		for(String t:links)
		{
			d.findElement(By.id("")).click();
			if(d.getTitle().equals(""))
			{
				System.out.println("");
			}
			else
			{
				System.out.println("");
			}
		}
		
	}
	
	
	
	
	
	

}
