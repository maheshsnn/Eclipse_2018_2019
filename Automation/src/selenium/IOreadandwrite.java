package selenium;

import java.io.File;
import java.io.FileInputStream;


import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class IOreadandwrite 
{
WebDriver d ;
	public static void readcell(int rowNo,int cellNo) throws Exception
	{
		
		FileInputStream fis=new FileInputStream("");
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		XSSFRow row=s.getRow(rowNo);
		XSSFCell cell=s.getRow(rowNo).getCell(cellNo);
		
				}
	public static void  writetocell(int rowNO,int CellNO,boolean valuee) throws Exception
	{
		FileInputStream fis=new FileInputStream("");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		XSSFRow row=s.getRow(rowNO);
		XSSFCell cell=s.getRow(rowNO).getCell(CellNO);
		if(cell==null)
		{
		XSSFCell cell2=row.createCell(CellNO);
		cell2.setCellValue(valuee);
					
		}
		else
		{
			cell.setCellValue(valuee);
		}
		fis.close();
		FileOutputStream fos=new FileOutputStream(new File(""));
		wb.write(fos);
		fos.close();
	}
	
	
	
}
