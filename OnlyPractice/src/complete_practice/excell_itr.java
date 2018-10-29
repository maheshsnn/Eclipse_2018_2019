package complete_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class excell_itr {
	
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		ArrayList<String>username=mm(0);
		//ArrayList<String>passwrd=mm(1);
		
		
		System.setProperty("webdriver.chrome.driver", "G:\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		for(int i=0;i<username.size();i++)
		{		System.out.println("test login");
			//driver.findElement(By.xpath("//*[@type='email'][@id='email'][@name='email']")).clear();
			//driver.findElement(By.xpath("//*[@id='lst-ib']")).clear();
		Thread.sleep(2000);
		System.out.println("value of username    "+username.get(i));
		//	driver.findElement(By.id("lst-ib")).sendKeys(username.get(i));
			//driver.findElement(By.id("//*[@id='pass']")).clear();
			//driver.findElement(By.id("//*[@id='pass']")).sendKeys(passwrd.get(i));
			
		}
		driver.close();
		
	}
	public static ArrayList<String> mm(int col) throws Exception{
		
		FileInputStream fis=new FileInputStream("G:\\rrrr.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		
		ArrayList<String>al=new ArrayList<String>();
		
		Iterator<Row>itr=s.iterator();
		
		while(itr.hasNext())
		{
			al.add(itr.next().getCell(col).getStringCellValue());
		}
		//fis.close();
		return al;
		
	}

}
