package xcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class utility 
{
	public static  void readtcell(int rowNo,int ColNo) throws Exception
{
	FileInputStream fis=new FileInputStream("");	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet s=wb.getSheetAt(0);
	XSSFRow row=s.getRow(rowNo);
	XSSFCell cell=s.getRow(rowNo).getCell(ColNo);
	}
public static void writeToCell(int rowNo,int ColNo,boolean valuee) throws Exception
{
FileInputStream fis=new FileInputStream("");	
XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet s=wb.getSheetAt(0);
XSSFRow row=s.getRow(rowNo);
XSSFCell cell=s.getRow(rowNo).getCell(ColNo);
if(cell==null)
{
XSSFCell cell2=row.createCell(ColNo)	;
cell2.setCellValue(valuee);

}
else
{
	cell.setCellValue(valuee);	
}
fis.close();
FileOutputStream fos=new FileOutputStream("");
wb.write(fos);
fos.close();



}


	

}
