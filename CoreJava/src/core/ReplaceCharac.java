package core;

import org.junit.Test;

public class ReplaceCharac 

{
	
@Test

public void setup()
{
	
String name="mahesh";

//String m=name.replace("a", "x");


 
String m=name.replaceAll("[^h]", " ");

System.out.println(m);
}


}

