package scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class excelscriptusingIterator 

{
	public static void main(String[] args) throws Exception
	{
		WebDriver d;
		ArrayList<String> username=readcell(0);
		ArrayList<String> password=readcell(1);
		d=new FirefoxDriver();
		d.get("https:\\facebook.com");
		for(int i=0;i<username.size();i++){
		d.findElement(By.id("email")).sendKeys(username.get(i));
		WebElement dd=d.findElement(By.id("email"));
		Thread.sleep(5000);
		d.findElement(By.id("pass")).sendKeys(password.get(i));
		d.findElement(By.id("pass")).clear();
		d.findElement(By.id("email")).clear();
		}
	}
	
	public static ArrayList readcell(int colno) throws Exception
	{
		
		FileInputStream fis=new FileInputStream("G:\\rrrr.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		
		ArrayList<String>lists=new ArrayList<String>();
		Iterator<Row> itr=s.iterator();
		while(itr.hasNext())
		{
		lists.add(itr.next().getCell(colno).getStringCellValue());
		}
		System.out.println(lists);
		return lists;
		
	}
	

}
