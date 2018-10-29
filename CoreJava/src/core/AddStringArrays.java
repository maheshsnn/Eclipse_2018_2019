package core;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class AddStringArrays
{
@Test
public void setup()
{
	String[]name1={"A","B","C"};
	String[]name2={"D","E","F"};
	
	ArrayList m=new ArrayList(Arrays.asList(name1));
	
     m.addAll(Arrays.asList(name2));
     
     Object[]c=m.toArray();
     
     System.out.println(Arrays.toString(c));

	
	
	
}
}
