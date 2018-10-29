package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class AddIntArrays {

	@Test
	public void meth1()
	{
		
		
		List<Integer>num1=Arrays.asList(1,2,3,4,5);
		List<Integer>num2=Arrays.asList(6,7,8,9,10);
		
		ArrayList<Integer>m=new ArrayList<Integer>();
		
		m.addAll(num1);
		m.addAll(num2);
		System.out.println(m);
		
		Collections.reverse(m);
		
		System.out.println(m);
		
		
		
		
	}
}
