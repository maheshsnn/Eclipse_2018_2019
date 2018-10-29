package selenium;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={1,2,3,4,5,6,7,8,9};
		for(int i=arr.length-1;i>0;i--)
			
		{
			System.out.println(arr[i]);
		}
		
		
		String sr="mahesh";
		char[] ch=sr.toCharArray();
		
		
		for(int i=ch.length-1;i>=0;i--)
		{
			
			
			System.out.println(ch[i]);
		}
		
		StringBuilder sb=new StringBuilder("Telangana");
		
		for(int i=2;i<=sb.length();i+=2)
		{
		
		sb.setCharAt(i,'x');
		}
		System.out.println(sb);
		
		
int n,sum,r,temp ;
		n=454 ;
		sum=0;
		temp=n ;
		while(n>0){
	 r=n%10;
	 sum=(sum*10)+r ;
	 n=n/10 ;
	 System.out.println(sum);
	 }
	if (temp==sum)
	{	
   System.out.println("The number is palindrome");		
	}
 else
 {
	 System.out.println("The number is not palindrome");
 }
	
	
		
		/*int n1,n2,n3,count=10 ;
		n1=0 ;n2=1;
		System.out.println("n1="+n1 +" "+"n2="+n2);
      for(int i=2;i<=count;i++)
      {
    	  n3=n1+n2;
    	  System.out.println(n3);
    	  n1=n2;
    	  n2=n3;
      }*/
		
		/*int n=5,fact=1;
		for (int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);*/
		
		//int[][] x= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=1;i<10;i++)
		{
			for(int j=0;j<i;j++)
			{
		
			System.out.print("*");
			
		}
			System.out.println();
			}
		
}}
