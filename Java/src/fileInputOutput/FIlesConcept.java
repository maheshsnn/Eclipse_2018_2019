package fileInputOutput;

import java.io.File;
import java.io.IOException;

public class FIlesConcept {

	public static void main(String[] args) throws Exception {
//	File f=new File("G:\\EclipseJava.txt");
//	f.mkdir();
//	File f1=new File(f,"mahesh.txt");
//	f1.createNewFile();
		File f=new File("G:\\AUTOMATION WORKSPACE");
		File f1=new File(f,"mahesh.txt");
		f1.createNewFile();
		String[] s=f.list();
	int count=0;
	for(String s1:s)
	{		
		File f2=new File(f,s1);
		if(f2.isFile())
		{
		count++;
			System.out.println(s1);
		}}
		System.out.println("The number of : "+ count);
	}
	

	}

