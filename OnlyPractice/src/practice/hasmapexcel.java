package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class hasmapexcel {
	
	
	
	public HashMap<String,String> mmm() throws IOException
	{
		HashMap<String,String>mm=new HashMap<>();
		
		FileInputStream fis=new FileInputStream("G:\\SymmetryCRM.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet s=wb.getSheetAt(0);
		
		
		Iterator<Row> itr=s.iterator();
		
		while(itr.hasNext())
		{
			Row row=itr.next();
			
			Iterator<Cell> cellitr=row.iterator();
			
			while(cellitr.hasNext())
			{
				Cell cell=cellitr.next();
				
				cell.setCellType(CellType.STRING);
				
			mm.put(cell.getStringCellValue(),cellitr.next().getStringCellValue());
				
			}
			
		}
		fis.close();
		return mm;
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		hasmapexcel s=new hasmapexcel();
	System.out.println(s.mmm().get("1"));

}
}