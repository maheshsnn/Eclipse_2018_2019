package core;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class ArrayPrintingReversing {
	
	@Test
	
	public void meth1()
	{
	
	ArrayList<Character>k=new ArrayList();
	k.add('m');
	k.add('a');
	System.out.println(k);
	Collections.reverse(k);
	System.out.println(k);

}
	@Test
	public void meth2()
	{
		ArrayList<String>m=new ArrayList();
		m.add("mahesh");
		m.add("sravanthi");
		System.out.println(m);
		Collections.reverse(m);
		System.out.println(m);
	}
	
	@Test
	public void meth3()
	{
		ArrayList<Integer>m=new ArrayList();
		m.add(1);
		m.add(2);	
		System.out.println(m);
		Collections.reverse(m);
		System.out.println(m);
	}
	







}
