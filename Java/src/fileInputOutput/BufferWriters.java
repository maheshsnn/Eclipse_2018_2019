package fileInputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriters {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileWriter f=new FileWriter("G:\\Filewriter.txt");
		BufferedWriter br=new BufferedWriter(f);
		br.write("this is added using buffered reader");
		br.newLine();
		char[]ch={'a','b','c'};
		br.write(ch);
		br.flush();
		br.close();

	}

}
