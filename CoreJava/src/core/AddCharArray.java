package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class AddCharArray {
	
	@Test
	
	public void setup()
	{
		
		char[]name1={'A','c','B'};
		//char[]name2={'D','E','F'};
		Arrays.sort(name1);
		
		for(char s: name1)
		{
			System.out.println(s);
		}
		
		System.out.println();
		
		
		
	
	
		
		
		
		
		ArrayList<Character>m=new ArrayList<Character>();
		m.add('B');
		m.add('A');
		m.add('D');
		m.add('F');
		m.add('G');
        System.out.println(m);
		Collections.reverse(m);
		System.out.println(m);
		
		
		System.out.println();
		
		
		
		
		ArrayList<String>y=new ArrayList<String>();
		y.add("mahesh");
		y.add("Sravanthi");
		
        System.out.println(y);
		Collections.reverse(y);
		System.out.println(y);
		
		
		System.out.println();
		
		ArrayList<Integer>h=new ArrayList<Integer>();
		h.add(1);
		h.add(2);
		h.add(3);
		System.out.println(h);
		
		
		
		
		
		
		
		
	}

}
