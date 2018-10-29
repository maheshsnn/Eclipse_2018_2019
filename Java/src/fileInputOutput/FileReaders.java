package fileInputOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaders {

	public static void main(String[] args) throws Exception {
		FileReader f=new FileReader("G:\\Filewriter.txt");
		int i=f.read();
		while(i!=-1){
		
		System.out.print((char)i);
			i=f.read();}
		
		f.close();

	}

}
