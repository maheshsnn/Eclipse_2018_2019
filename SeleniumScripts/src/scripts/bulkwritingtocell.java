package scripts;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class bulkwritingtocell {
	public static void main(String[] args) throws Exception 
	{
	
		
		
		String d="fsdfsfsfs" ;
	XSSFWorkbook wb=new XSSFWorkbook();
	XSSFSheet s=wb.createSheet("mahesh");
	
	Map<String ,Object[]>daata=new TreeMap<>();
	daata.put("1" ,new Object[] {d,"dfgdgd","dfgdfg"});
	
	
	Set<String>keyset=daata.keySet();
	int rownum=0;
	for(String key:keyset)
	{
		Row row=s.createRow(rownum++);
		if(row!=null)
		{
			rownum++;
		}
		Object[] objrr=daata.get(key);
		
		int colon=0 ;
		
		for(Object xx:objrr)
		{
			Cell cell=row.createCell(colon++);
			if(xx instanceof String)
			{
				cell.setCellValue((String)xx);
			}
					
		}
			
		FileOutputStream fos=new FileOutputStream("G:\\writeexcel.xlsx");
		wb.write(fos);
		fos.close();}
		
	}
	
		
		
	}


