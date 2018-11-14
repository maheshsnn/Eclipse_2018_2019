package concepts;

public class Largestnum {
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");


//program to find the largest and second largest number 
		
		int[] al={1,1,1,2,2,3,4,5,7,8,9,5,1,2} ;

     int arr[] ={1,2,3,4,5,6,7,8,9} ;

	 int largest=arr[0];
	 int secondlargest =arr[0] ;

	 for(int i=0;i<=arr.length-1;i++){
	 
	 
	 if(arr[i]>largest)

		{
		//secondlargest=largest;
		largest=arr[i];
		}

		/*else if(arr[i]>secondlargest)
		{
		
		secondlargest=arr[i];		
		}*/
 
	 }

 System.out.println("the second largest number  is "  + secondlargest);
 System.out.println("the first largest number is " + largest) ;



	}
	}


