package prac;

import java.util.Collections;

public class StudentProgram {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		StudentProgram x=new StudentProgram();
		x.student();
		
	}
//this program is to find total of marks and average and grade 
	public void student()
	{
	int[] marks={65,75,85,95,98,99} ;
	
	int total=0 ;
	boolean result =true ;
	for(int i=0;i<marks.length;i++)
	{
		total=total+marks[i];
		System.out.println(total);//total marks printed 
	
	}
int avg=total/marks.length ;
System.out.println(avg);
if (avg<35)
	result= false ;
		
	
	if(result){
	if (avg>=65)
	{
		System.out.println("Grade :distinction");
	}
	else if(avg>=75)
	{
		System.out.println("Grade : first class");
		
	}
	else 
	{
		System.out.println("welcome again");
	}
	
}}
	

}