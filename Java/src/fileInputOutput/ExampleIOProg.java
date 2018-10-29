package fileInputOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class ExampleIOProg {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PrintWriter pw=new PrintWriter("G:\\EclipseJava\\File3.txt");
		BufferedReader br1=new BufferedReader(new FileReader("G:\\EclipseJava\\File1.txt"));
		String line=br1.readLine();
		
		while(line!=null){
			
		pw.println(line);
			line=br1.readLine();
		}
		
		br1=new BufferedReader(new FileReader("G:\\EclipseJava\\File2.txt"));
		line=br1.readLine();
		while(line!=null)
		{
			pw.println(line);
			line=br1.readLine();
		}
     pw.flush();
     br1.close();
     pw.close();
	}

}
