package practice;

public class Employee_list_sort implements Comparable<Employee_list_sort> {

	private String name;
	private int age;
	private String gender;
	
public 	Employee_list_sort(String name,int age,String gender)
	{
		
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	

	/*@Override
	public int compareTo(Employee_list_sort o) {
		int compares=name.compareTo(o.name);
		
		if(compares==0)	 
		{
			compares=Integer.compare(age, o.age);
		}
		return  compares ;
	}*/




	@Override
	public int compareTo(Employee_list_sort o) {
		// TODO Auto-generated method stub'
		
		int compare=name.compareTo(o.name);
		if(compare==0)
		{
			compare=Integer.compare(age, o.age);
			
		}
		
		return compare;
	}
	
	
	public String toString()
	{
		return "name:"+name  +";   age  :" +age+";   gender :"+gender     +"\n";
	}
	
	
}
