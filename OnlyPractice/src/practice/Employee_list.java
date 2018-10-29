package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee_list {
	
	
	public static void main(String[] args) {
		
	
		
		
		List<Employee_list_sort>al=new ArrayList<Employee_list_sort>();
		
		
		al.add(new Employee_list_sort("xzhesh",30,"female"));
		al.add(new Employee_list_sort("bethi",22,"male"));
		al.add(new Employee_list_sort("sravanthi",24,"female"));
		al.add(new Employee_list_sort("veda",22,"male"));
		al.add(new Employee_list_sort("sahasra",29,"male"));
		al.add(new Employee_list_sort("akhil",25,"female"));
		
		Collections.sort(al);
		System.out.println(al);
		
		
	}

}
