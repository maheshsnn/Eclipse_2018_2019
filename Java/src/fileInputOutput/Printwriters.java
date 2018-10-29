package fileInputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Printwriters {

	public static void main(String[] args) throws Exception {
		FileWriter f=new FileWriter("G:\\Filewriter.txt");
		PrintWriter pw=new PrintWriter(f);
		pw.println("this is added from println writer method ");
		pw.println("this is the second string from println method");
		pw.flush();
		pw.close();
		FileReader f1=new FileReader("G:\\Filewriter.txt");
		BufferedReader br=new BufferedReader(f1);
		String line=br.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		

	}

}
