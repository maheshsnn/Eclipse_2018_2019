package xcel;

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

public class readcells {
	
	public static void main(String[] args) throws IOException {
		
		readcells mu=new readcells();
	System.out.println(mu.readcell().get("mahesh"));
		
	}
	
	public  HashMap<String,String> readcell() throws IOException
	{
		
		HashMap<String,String>hmaplist=new HashMap<>();
		
	 FileInputStream fis=new FileInputStream("G:\\rrrr.xlsx");
	 
	 XSSFWorkbook wb=new XSSFWorkbook(fis);
	 
	 XSSFSheet s=wb.getSheetAt(0);
	 
	 Iterator<Row>itr=s.iterator();
	 
	 while(itr.hasNext())
	 {
		 Row row=itr.next();
		 
		 Iterator<Cell>cellitr=row.iterator();
		 
		 while (cellitr.hasNext())
		 {
			 Cell cells=cellitr.next();
			 
			cells.setCellType(CellType.STRING);
			
			
			hmaplist.put(cells.getStringCellValue(), cellitr.next().getStringCellValue()); 
			 
		 }
	 }
	return hmaplist;
	 
	 
	}

}
