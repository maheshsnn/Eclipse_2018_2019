package targetpack;

import org.junit.*;

public class JUnitAnnotationsDemo {
	@Before
	public void setUp()
	{
		System.out.println("This is @Before method");
	}
	@After
	public void tearDown()
	{
		System.out.println("This is @After method");
	}
	@BeforeClass
	public static void oneTimeSetUp()
	{
		System.out.println("This is @BeforeClass method");
	}
	@AfterClass
	public static void oneTimeTearDown()
	{
		System.out.println("This is @AfterClass method");
	}
	@Test
	public void testMeth1()
	{
		System.out.println("This is first @Test method");
	}
	@Test
	public void testMeth2()
	{
		System.out.println("This is second @Test method");
	}

}
