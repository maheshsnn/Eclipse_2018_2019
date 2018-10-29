package concepts;

public class ControlStatementsAll {

	public static void main(String[] args)
	{
		
		/*
		 Conditional statements
		 if else
		 switch statements
		 
		 iterating statements
		 
		 for loop
		 whileloop
		 do while loop
		 for each loop
		 
		 
		 transfer statements 
		 
		 break
		 continue
		 return
		 
		 examples for each below
		 
		 */
		
		/*forloop();
		ifloop();
		switchloop();
		switchlooptwo();
		whilelooop();
		dowhilelooop();
		contin();
		nestedfor();
		nestedwhilelooop();*/
		contin();
        
		

	}
	
	/*
	 in if else case  if if condition is true then it executes if loop else goes to else statement
	 */
	
	public static void ifloop()
	{
		
	int x,y ;
	x=4;
	y = 9;
	
	if (x<y)
	{
		System.out.println("x less than y");
	}
	else{
		System.out.println("x greater than y");
	}
	}
	
	
	/*
	 In switch loop   executes if the condition is available else prints default case 
	 
	 In swith loop if we want to execute string case should be described in string only
	 If we want to execute int case then integer case must be describes same for character also
	 */
	
	public static void switchloop()
	{
		
		
String i="mahesh" ;

		
		switch(i)
		{
			case "sreenu"  : System.out.println("first choice");
			break ;
			case "rajesh": System.out.println("second choice");
			break ;
			case "nani": System.out.println("third choice choice");
			break ;
			default:System.out.println("wrong chice");
			
			
		}
		
	}
	public static void switchlooptwo()
	{
		
		
int i=2 ;

		
		switch(i)
		{
			case 1  : System.out.println("first choice");
			break ;
			case 2: System.out.println("second choice");
			break ;
			case 3: System.out.println("third choice choice");
			break ;
			default:System.out.println("wrong chice");
			
			
		}
		
	}
	
	/*
	 for loop is in following format
	 
	 Initialization condition and increment
	 
	 
	 In for loop the loop continues until the condition ends 
	 */
	
	public static void forloop()
	{
	
		for(int i=0 ;i<=5;i++)
		{
			
			System.out.println(i);
		}
		
	}
	
	/*In while condition ,checks condition first laters executes the statements */
	
	public static void whilelooop()
	{
		
		int i=1 ;
		
		while(i<=10)
		{
			System.out.println(i);
			i++ ;
			
		}
	}
	
	/*
	 In dowhile statements execution first and later checks the condition 
	 */
	public static void dowhilelooop()
	{
		
		int i=1 ;
		
			do	{
			System.out.println(i);
			i++ ;
			
		}while(i<=10) ;

	}
	
	/*
	 In cotinue statements current iterations  are skipped and remaining continues means or conditions here are skipped 
	  
	 */
	public static void contin()
	{
		for (int i=0;i<=10;i++)
		{
			if(i==4 | i== 6)
			continue ;
				System.out.println(i);
			}
			
		}
	

/*
 Break need to go through classes 
 */
	public static void nestedfor()
	{
	for (int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			System.out.print(i*j);
			//j++ ;
		}
		//i++ ;
		//System.out.println();
	}
		
	}
	
	public static void nestedwhilelooop()
	{
		int i=1 ;
		System.out.println("tables");
		while(i<=10)
		{
			int j=1;
			while(j<=10)
			{
				System.out.println(i+"*" +j+"=" +(i*j));
				j++ ;
			}
			i++ ;
		}
	}
}
	
	
	
	
	
	
	


