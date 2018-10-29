package targetpack;

import org.testng.annotations.Test;

public class DependencyTest1 {
	@Test
	public void meth1()
	{
		int  x=10,y=0;
		int z=x/y;
		System.out.println("The value of z is:"+z);
		System.out.println("This is meth1");
	}
	@Test(dependsOnMethods="meth1")
	public void meth2()
	{
		System.out.println("This is meth2");
	}

}
