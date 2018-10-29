package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Table {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream fis=new FileInputStream("G:\\rrrr.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		ArrayList<String> al=new ArrayList<String>();
		
		Iterator<Row> itr=s.iterator();
		
		while(itr.hasNext())
		{
			//String col=itr.next().getCell(0).getStringCellValue();
			//al.add(col);
			System.out.println(itr.next().getCell(0));
		}
		//System.out.println(al);

	}

}
