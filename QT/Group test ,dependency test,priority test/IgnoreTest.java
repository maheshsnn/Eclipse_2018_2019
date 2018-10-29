package targetpack;

import org.testng.annotations.Test;

public class IgnoreTest {
	@Test
	public void meth1()
	{
		System.out.println("This is meth1 ");
	}
	@Test
	public void meth2()
	{
		System.out.println("This is meth2 ");
	}
	@Test(enabled=false)
	public void meth3()
	{
		System.out.println("This is meth3 ");
	}
	@Test
	public void meth4()
	{
		System.out.println("This is meth4 ");
	}

}
