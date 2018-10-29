package practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class PRINTSSS {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw=new PrintWriter("G:\\output.txt");
		
		
		BufferedReader br=new BufferedReader(new FileReader("G:\\output.txt"));
		String line=br.readLine();

		
		while(line!=null)
		{
			boolean available=false;
			
			
			BufferedReader br2=new BufferedReader(new FileReader("G:\\output.txt"));
			String target=br2.readLine();
			
			while(target!=null)
			{
				if(line.equals(target))
				{
					available=true;
					break;
				}
				
			target=br2.readLine();
			}
			if(available==false)
			{
				
				pw.println();
			}
			line=br.readLine();
			
			
			
			
		}
		pw.flush();
		br.close();
		pw.close();
		
	}
	
}
