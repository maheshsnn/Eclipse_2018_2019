package prac;

 class Vararg 
{
	 
	 public static  void fun(String str,int...args)
	 {
	 	//int t=Integer.parseInt(args[0]);
	  	System.out.println(str);
	  	
	 	for(int a:args)
	 	{
	 	System.out.println(a);
	 		 	}}
public static void main(String[] args)	
{
//demo m= new demo();
	//Vararg m=new Vararg();
	fun("mmm",  10, 12);
}}