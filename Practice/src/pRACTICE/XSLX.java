package pRACTICE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class XSLX {
	
	
	
	public static String readcell(int rowno,int cellno) throws Exception
	{
		FileInputStream fis=new FileInputStream("D:\\Mahesh.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		Row row=s.getRow(rowno);
		XSSFCell cell=s.getRow(rowno).getCell(cellno);
		String k=cell.toString();
		return k;
	}

	public static void writetocell(int rowNo,int cellNo,Boolean valuee) throws Exception 
	{
		
		FileInputStream fis=new FileInputStream("D:\\Mahesh.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		Row row=s.getRow(rowNo);
		XSSFCell cell=s.getRow(rowNo).getCell(cellNo);
		if(cell==null)

		{
			org.apache.poi.ss.usermodel.Cell cell2=row.createCell(cellNo);
			((org.apache.poi.ss.usermodel.Cell) cell2).setCellValue(valuee);
		}
		else
		{
			cell.setCellValue(valuee);
		}
		fis.close();
		FileOutputStream fos=new FileOutputStream("D:\\Mahesh.xlsx");
		wb.write(fos);
		fos.close();
		
	}

}