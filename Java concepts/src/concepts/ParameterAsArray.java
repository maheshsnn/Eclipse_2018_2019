package concepts;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ParameterAsArray {
	public static void main(String[] args) throws Exception 
	{
		StringBuilder sb=new StringBuilder("telugudeshamparty");
		
		for(int i=2;i<=sb.length();i+=2)
			
		{	
			sb.setCharAt(i, 'x');
		}
		System.out.println(sb);
		
//		int a=153,sum=0,c=0,r;
//	    int	temp=a;
//		while(a>0){
//		r=a%10;
//        c=c+(r*r*r);
//		a=a/10;}
//		System.out.println(c);
//		if(temp==c)
//		{
//			System.out.println("Number is palindrome");
//			}
//		int n1=0,n2=1,n3,count=10 ;
//		System.out.println(n1+ "    "+ n2);
//	for(int n=0;n<=count;n++)
//		{
//			n3=n1+n2;
//			System.out.println(n3);
//			n1=n2;
//			n2=n3;
//		}
		
//		int n=454,sum=0,r;
//	    int	temp=n;
//		while(n>0){
//		r=n%10;
//		sum=(sum*10)+r ;
//		n=n/10;}
//		if(temp==sum)
//		{
//			System.out.println("Number is palindrome");
//			}
		
//		int fact=1,n=5;
//		for(int i=1;i<=n;i++)
//		{
//			fact=fact*i ;
//		}
//		System.out.println(fact);
		
//		
		
//		mah(10,20,30);
//		
//		int[]e={1,2,3,4,5,6,7,8,9};
//		for(int i=e.length-1;i>=0;i--){
//			System.out.println(e[i]);
//		}
//		
//		int[][] matr={{1,2,3},{4,5,6},{7,8,9}};
//		
//		for(int i=0;i<=matr.length-1;i++)
//		{
//			for(int j=0;j<=matr.length-1;j++)
//			{
//				System.out.print(matr[i][j]);
//			
//			}
//			System.out.println();
//		}
	
		
		
		
//		
//		String s="mahesh" ;
//		char[]ch=s.toCharArray();
//		for(int i=ch.length-1;i>=0;i--)
//		//for(char x:ch)
//			
//		{
//			System.out.println(ch[i]);
//	
//	}
		
	
}
	
//public static void mah(int...a)
//{
//	int total=0;
//	for(int x:a)
//	{
//		total=total+x;
//	}
//	System.out.println(total);
//	
//}
	
	//febinocci
	
}