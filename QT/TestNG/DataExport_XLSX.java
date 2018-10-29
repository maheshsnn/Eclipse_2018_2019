package targetpack;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataExport_XLSX {
	@Test
	public void dataExport_xlsx() throws Exception
	{
		FileOutputStream fos = new FileOutputStream("F:\\Selenium_Sripts_Jan15\\Target\\Results\\DataExport_XLSX.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet s = wb.createSheet("Results");
		Row row = s.createRow(0);
		row.createCell(0).setCellValue("Selenium");
		wb.write(fos);
		fos.close();
	}

}
