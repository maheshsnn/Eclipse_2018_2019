package core;

import org.junit.Test;

public class ReverseString {
	//String buffer and string builders are used to reverse a string

	// difference between stringbuffer and stringbuilder is
	//stringbuilder is not threadsafe

	@Test

	public void  setup()
	{
	StringBuilder o=new StringBuilder("mahesh");
	o.reverse();
	System.out.println(o);
	}


}
