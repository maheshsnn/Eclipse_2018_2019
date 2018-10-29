package core;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AddingMultipleArrays
{
	
@Test
public void meth1()
{
	
	
String[]m={"A","B"};
String[]y={"c","D"};

ArrayList x=new ArrayList(Arrays.asList(m));

x.addAll(Arrays.asList(y));

Object[]c=x.toArray();

System.out.println(Arrays.toString(c));

}
}

