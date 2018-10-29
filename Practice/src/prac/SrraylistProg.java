package prac;

import java.util.ArrayList;
import java.util.Collections;

public class SrraylistProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SrraylistProg r=new SrraylistProg() ;
		r.arraylst();
	}

	public void arraylst()
	{
		ArrayList arraylist=new ArrayList();
		arraylist.add('a') ;
		arraylist.add('b') ;
		arraylist.add('c') ;
		arraylist.add('d') ;
		arraylist.add('d');
		
		/*Collections.reverse(arraylist);*/
		
		int l=arraylist.size();
		
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(arraylist.get(i).equals(arraylist.get(j)))
				{
					arraylist.remove(j);
				}
				
			}
			
			
		}
		System.out.println(arraylist);
		/*
		for(int i=l-1;i>=0;i--)
		{
			System.out.println(arraylist.get(i));
		}*/
		
		//System.out.println(arraylist);
		
			
	}
}
