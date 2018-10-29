package pRACTICE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Xlstest 
{
	WebDriver d;
	
	public static void readcell(int rowNO,int cellNO) throws Exception
	{
		FileInputStream fis=new FileInputStream("");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		Row row=s.getRow(cellNO);
		XSSFCell cell=s.getRow(rowNO).getCell(cellNO);
		
	}
	public static void Writetocell(int rowNO,int cellNO,Boolean valuee) throws Exception
	{
		FileInputStream fis=new FileInputStream("");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		Row row=s.getRow(rowNO);
		XSSFCell cell=s.getRow(rowNO).getCell(cellNO);
		if(cell==null)
		{
			Cell cell2=row.createCell(cellNO);
			cell2.setCellValue(valuee);
		}
		else
		{
			cell.setCellValue(valuee);
		}
		fis.close();
		FileOutputStream fos=new FileOutputStream ("");
		wb.write(fos);
		fos.close();
		
	}
	
	
	
	

}
