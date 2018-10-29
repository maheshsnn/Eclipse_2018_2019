package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.apache.xerces.impl.xs.identity.Selector.Matcher;

public class Javap {

	public static void main(String[] args) throws Exception {
		
//		FileWriter f=new FileWriter("E:\\ahesh.txt");
//		BufferedWriter r=new BufferedWriter(f);
//		String o="mahesh test dat a";
//		f.write(o);
//		f.close();
//		r.close();


		FileReader f=new FileReader("E:\\ahesh.txt");
		BufferedReader r=new BufferedReader(f);
		//String o="mahesh test dat a";
		int linecount=0;
		String line;
		while((line=r.readLine()) != null){
			linecount=linecount+1;
			if(linecount>1){
			System.out.println(line);}
		}
//		Scanner n=new Scanner(System.in);
//	System.out.println("enter your name ");
//		String s =	n.nextLine();
//		System.out.println(s);
//		System.out.println("enter your ciry name ");
//		String o=n.next();
//		System.out.println(o);
//		mm();
//		//regular expressions
//		int count=0 ;
//		Pattern p=Pattern.compile("\\D");
//		java.util.regex.Matcher s=p.matcher("abcdefab123  cderabc");		
//		while(s.find())
//		{
//			count++;
//			System.out.println(s.start()+" .....  "+s.end()+"....."+s.group());
//							
//		}	
//		System.out.println("No of occurences"+count);	
		
		
		
		
		
//		int n1,n2,n3,count=10;
//		
//		n1=0 ;
//		n2=1 ;
//		System.out.println(n1  +"   " +n2);
//		for(int n=2;n<=count;n++)
//		{
//		n3=n1+n2 ;
//		System.out.println(n3);
//		n1=n2;
//		n2=n3;
//		
//		}
		
		///palindrome
		
//		int r, x=4445,sum=0 ;
//		int temp=x ;
//		while(x>0)
//		{
//		r=x%10 ;
//		sum=(sum*10)+r;
//		System.out.println(sum);
//		x=x/10;
//		}
//		//x++;
//		if(temp==sum)
//		{
//			System.out.println("NUmber is palindrome");
//		}
//		else
//		{
//		System.out.println("No is not palindrome");
//		}
//		
		
	
//	
//	int fact=1,num=5 ;
//	
//for(int i=1;i<=num;i++)
//{
//	fact=fact*i;
//	System.out.println(fact);
//	
//	}
//System.out.println(fact);
}
	public static  int mm()
	{
		int x=10,y=15,z;
		z=x+y;
		System.out.println(z);
		return z;
	}
}