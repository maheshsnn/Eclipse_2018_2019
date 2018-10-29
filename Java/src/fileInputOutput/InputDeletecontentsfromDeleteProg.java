package fileInputOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class InputDeletecontentsfromDeleteProg {

	public static void main(String[] args) throws Exception
	{
	PrintWriter pw=new PrintWriter("G:\\output.txt");
	BufferedReader br1=new BufferedReader(new FileReader("G:\\input.txt"));
	String line=br1.readLine();
	
	while(line!=null)
	{
		boolean available=false ;
		
		BufferedReader br2=new BufferedReader(new FileReader("G:\\Delete.txt"));
		String target=br2.readLine();
		
		while(target!=null)
		{
			if(line.equals(target))
			{
				available=true ;
				break;
			}
			target=br2.readLine();
		}
		if(available=false)
		{
			pw.println(line);
		}
		line=br1.readLine();
			
		}
	System.out.println("done");
	
	    pw.flush();
	     br1.close();
	     pw.close();
		
	}
	

	}


