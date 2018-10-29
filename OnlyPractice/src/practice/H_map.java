package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class H_map {
	
	public static void main(String[] args) {
		
		
		Map<Integer,Employee> hms=new HashMap<Integer,Employee>();
		
		
		Employee e1=new Employee("Mahesh", 23, "Male");
		Employee e2=new Employee("Bethi",26,"Female");
		
		hms.put(1, e1);
		hms.put(2, e2);
		
		for(Entry<Integer, Employee> m:hms.entrySet())
		{
			
			System.out.println("The key is   "+m.getKey() );
			
			Employee e=(Employee)m.getValue();
			
			System.out.println("The value is "+e.name +" "+e.age +" "+e.gender);
			
			
		}
		
	}

}
