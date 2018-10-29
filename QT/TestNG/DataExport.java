package targetpack;

import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.testng.annotations.Test;

public class DataExport {
@Test
public void dataExport() throws Exception
{
	FileOutputStream fos = new FileOutputStream("F:\\Selenium_Sripts_Jan15\\Target\\Results\\DataExport.xls");
	WritableWorkbook wwb=Workbook.createWorkbook(fos);
	WritableSheet ws=wwb.createSheet("Results",0);
	Label l1=new Label(0,0,"Selenium");
	//Label l2=new Label(0,1,"QTP");
	Label l3=new Label(0,2,"Sahi");
	Label l4=new Label(0,3,"RFT");
	ws.addCell(l4);
	ws.addCell(l1);
	//ws.addCell(l2);
	ws.addCell(l3);
	wwb.write();
	wwb.close();
}
}
