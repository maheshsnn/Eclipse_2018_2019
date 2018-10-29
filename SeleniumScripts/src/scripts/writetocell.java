package scripts;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writetocell {
	public static void main(String[] args) throws Exception
	{
		//mm();
		System.out.println("dasd");
//	mm("1",new Object[] {"ID","Name","username"});
	mm("2","1","mahesh","bethi");
	mm("3","1","mahesh","bethi");
		
	}
	public static void mm(String a,String b,String c,String d) throws Exception
	{
		
		
	XSSFWorkbook wb=new XSSFWorkbook();
	XSSFSheet s=wb.createSheet("mahesh");
	
	Map<String ,Object[]> datas=new LinkedHashMap();
	datas.put(a,new Object[]  { b,c,d });
//    datas.put("2",new Object[]  { "1","mahesh","9" });
//    datas.put("3",new Object[]  { "2","mahesh","9" });
	
	Set<String>heyset= datas.keySet();
	int rownumm=0;
	
	for(String key:heyset)
	{
		Row row=s.createRow(rownumm++);
		Object[] objarr=datas.get(key);
		int coloun=0;
		for(Object obj:objarr)
		{
			Cell col=row.createCell(coloun++);
			if(obj instanceof String)
			{
				col.setCellValue((String) obj);
			}
				else if(obj instanceof Integer)
				{
					col.setCellValue((Integer) obj);
				}
				
			}
		}

		FileOutputStream fos=new FileOutputStream("G:\\writeexcel.xlsx");
		wb.write(fos);
		fos.close();}
	
	
	
	
	
		
	}
	
	


