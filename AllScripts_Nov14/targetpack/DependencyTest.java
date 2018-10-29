package targetpack;

import org.testng.annotations.Test;

public class DependencyTest {
	@Test
	public void meth1()
	{
		int x=10,y=0;
		int z=x/y;
		System.out.println("Z: "+z);
		System.out.println("this is meth1");
	}
	@Test(dependsOnMethods="meth1")
	public void meth2()
	{
		System.out.println("this is meth2");
	}

}
