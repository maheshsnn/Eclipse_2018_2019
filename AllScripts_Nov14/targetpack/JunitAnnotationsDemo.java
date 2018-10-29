package targetpack;

import org.junit.*;


public class JunitAnnotationsDemo {
	@BeforeClass
	public static void oneTimeSetup()
	{
		System.out.println("@BeforeClass method");
	}
	@AfterClass
	public static void oneTimeTeardown()
	{
		System.out.println("@AfterClass method");
	}
	@Before
	public void setUp()
	{
		System.out.println("@Before method");
	}
	@After
	public void tearDown()
	{
		System.out.println("@After method");
	}
	@Test
	public void testMeth1()
	{
		System.out.println("@Test1 method");
	}
	@Test
	public void testMeth2()
	{
		System.out.println("@Test2 method");
	}

}
