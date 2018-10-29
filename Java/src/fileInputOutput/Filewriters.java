package fileInputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriters {

	public static void main(String[] args) throws Exception {
		
		//File writer will create a file and writes data to it 
		// The main disadvantage if file writer is  we have to insert line separator which will not work in most of the systems 
		FileWriter f=new FileWriter("G:\\Filewriter.txt");
		f.write('c');
		f.write('\n');
		f.write("mahesh bethi bijili");
		f.write('\n');
		char[] ch={'a','b','c','d'};
		f.write(ch);
		f.flush();
		f.close();
		

	}

}
