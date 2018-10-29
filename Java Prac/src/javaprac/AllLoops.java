package javaprac;

public class AllLoops {

	public static void main(String[]args){
	
	
	{
		//first prog
		System.out.println("hello world");
	}
	
	
	//using if
	int a,b,result ;
	a=10;
	b=10;
	result=a+b;
	
	{
		System.out.println("result="+result);
	}
	
		if (a==b)	
		{
			System.out.println("It is=" +true);
		}
		
		else if(a<b)
		{
			System.out.println("It is=" +false);
		}
		
		else if(a>b)
		{
			System.out.println("It is=" +false);
		}
		
		
		//using for
		
		for (a=0;a<=10;a++)
		{
			System.out.println("the value is="+a);
		}
		
		//using while
		
		while(b>=0)
		{
			System.out.println("b="+b);
			b--;
		}
		while(a>=0)
		{
			System.out.println("a="+a);
			a--;
		}
		
		
		//do while
		
		
		do
		{
			System.out.println("result="+result);
			result--;
		}
		while(result>=0);
		
		
		//arrays
		
		
		int[] x=new int[5];
		x[1]=5;
		x[2]=4;
		x[3]=3;
		
		
		for(int temp:x)
		
		{
			
			System.out.println("x="+temp);
		}
		
		
		//strings
		
		String[] w=new String[5] ;
				
				w[0]="3";
		        w[3]="4";
		        
		        for (String tempr:w)
		        {
		        	System.out.println("w="+tempr);
		        	
		        }
		        
		        
		        //&&  ||
		        
		        int s=10;
		        int d=-10;		
		        
		        if(s>=0 && d>=0)
		        {
		        	System.out.println("Both are positive");
		        }
		        else  if(s>=0||d>=0)
                 {
	               System.out.println("atleat one number is positive");
	               
                 }
		        else
		        {
		        	System.out.println("Both numbers are negative");
		        }
		        
		       		
		
	}
	
}