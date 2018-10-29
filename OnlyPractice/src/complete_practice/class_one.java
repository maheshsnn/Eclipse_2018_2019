package complete_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class class_one {
	
	public static void main(String[] args) throws Exception {
		
		class_one tsr=new class_one();
		System.out.println(tsr.readcell().get("mahesh"));
	}
	
	
	
	
	public HashMap<String,String> readcell() throws Exception
	{
		
		HashMap<String,String>ll=new HashMap<String,String>();
		
		FileInputStream fis=new FileInputStream("G:\\rrrr.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheetAt(0);
		
		Iterator <Row>itr=s.iterator();
		
		while(itr.hasNext())
		{
			Row row=itr.next();
			
			Iterator<Cell>cell=row.iterator();
			
			while(cell.hasNext())
			{
				Cell cellitr=cell.next();
				
				cellitr.setCellType(CellType.STRING);
				
				ll.put(cellitr.getStringCellValue(), cell.next().getStringCellValue());
				
				
			}
			
		}
		fis.close();
		return ll;
		
		
		
		
		
	}

}
