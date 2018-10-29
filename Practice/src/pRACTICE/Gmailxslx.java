package pRACTICE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Gmailxslx {
	
	public static String readcell(int rowNo,int cellNo) throws Exception
	{
		FileInputStream fis=new FileInputStream("E:\\mallli.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		Row row=s.getRow(rowNo);
		XSSFCell cell=s.getRow(rowNo).getCell(cellNo);	
		String k=cell.toString();
		return k;
	}
	
	public static void writecell(int rowNo,int cellNo,boolean valuee) throws Exception
	{
		FileInputStream fis=new FileInputStream("E:\\mallli.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		Row row=s.getRow(rowNo);
		XSSFCell cell=s.getRow(rowNo).getCell(cellNo);
		if (cell==null)
		{
		Cell cell2=row.createCell(cellNo);
		cell2.setCellValue(valuee);
		}
		else
		{
			cell.setCellValue(valuee);
		}
		fis.close();
		FileOutputStream fos=new FileOutputStream("E:\\mallli.xlsx");
		wb.write(fos);
		fos.close();
		
		
		
	}

}
