package selenium;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class stringconversions {

	public static void main(String[] args) {
		//String a="";

		  String nn="mahesh" ;
		  
/*		  char[] c = nn.toCharArray();
		  
		  for(int i=5;i<c.length;i--)
		  {
			  System.out.println(c[i]); 
			  
		  }*/
		  

		  System.out.println(nn.length());
		  
		 String n=nn.valueOf(nn.charAt(0));
		 System.out.println(n);
/*
		 
		 ArrayList <Character>al=new ArrayList<Character>();
		 
		 for(char n:c)
		 {
		al.add(n);
		 }
		 
		 
		 System.out.println(al);
		 
		 for(int i=0;i<al.size();i++)
		 {    
		for(int j=i+1;j<al.size();j++)
		{

		if(al.get(i).equals(al.get(j)))
		{
		al.remove(j);
		j--;

		}
		}

		    }
		 System.out.println(al);

		 for(char s:al)
		 {
		a+=s;


		 }

		 System.out.println(a);

		
//		StringBuilder sb=new StringBuilder();
//		for(Character cl:al)
//		{
//			sb.append(cl);
//		}
//		System.out.println(sb.toString());
		*/
		
		
	}

}
