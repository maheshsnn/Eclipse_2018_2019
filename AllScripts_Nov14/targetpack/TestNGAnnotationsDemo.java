package targetpack;

import org.testng.annotations.*;

public class TestNGAnnotationsDemo {
	@BeforeSuite
	public void meth1()
	{
		System.out.println("@BeforeSuite");
	}
	@AfterSuite
	public void meth2()
	{
		System.out.println("@AfterSuite");
	}
	@BeforeTest
	public void meth3()
	{
		System.out.println("@BeforeTest");
	}
	@AfterTest
	public void meth4()
	{
		System.out.println("@AfterTest");
	}
	@BeforeClass
	public void meth5()
	{
		System.out.println("@BeforeClass");
	}
	@AfterClass
	public void meth6()
	{
		System.out.println("@AfterClass");
	}
	@BeforeMethod
	public void meth7()
	{
		System.out.println("@BeforeMethod");
	}
	@AfterMethod
	public void meth8()
	{
		System.out.println("@AfterMethod");
	}
	@Test
	public void meth_x9()
	{
		System.out.println("@Test1");
	}
	@Test
	public void meth_y10()
	{
		System.out.println("@Test2");
	}

}
