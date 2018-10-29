package targetpack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Login_MySQL {
  private WebDriver driver;
  private String baseUrl;
 
  @BeforeMethod
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://192.168.1.7:8080/";
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @Test
  public void testLogin() throws Exception 
  {
    driver.get(baseUrl + "/abc-v01/");
    assertEquals("ABC Bank Login", driver.getTitle());
    //DB
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MySQL","root","password12");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from Login;");
		while (rs.next())
		{											
			String username = rs.getString("UserName");
			String upwd = rs.getString("Password");
		    driver.findElement(By.name("userName")).clear();
	        driver.findElement(By.name("userName")).sendKeys(username);
	        driver.findElement(By.name("password")).clear();
	        driver.findElement(By.name("password")).sendKeys(upwd);
	        String uname=driver.findElement(By.name("userName")).getAttribute("value");
	        String upassword=driver.findElement(By.name("password")).getAttribute("value");
	        driver.findElement(By.cssSelector("input.button")).click();
	   
	    if(uname.equals("") && upassword.equals(""))
	    {
	    	assertEquals("User Name is required.",driver.findElement(By.xpath("//div[@id='main']/div/form/font")).getText());
	    	assertEquals("Password is required.",driver.findElement(By.xpath("//div[@id='main']/div/form/font[2]")).getText());
	    	String sql1="UPDATE Login SET STATUS='Fail' WHERE UserName='"+username+"';";
			PreparedStatement st1=con.prepareStatement(sql1);
			st1.executeUpdate();
	    }
	    else if(uname.equals(""))
	    {
	    	String sql1="UPDATE Login SET STATUS='Fail' WHERE UserName='"+username+"';";
			PreparedStatement st1=con.prepareStatement(sql1);
			st1.executeUpdate();
	    	assertEquals("User Name is required.",driver.findElement(By.xpath("//div[@id='main']/div/form/font")).getText());
	    }
	    else if(upassword.equals(""))
	    {
	    	String sql1="UPDATE Login SET STATUS='Fail' WHERE UserName='"+username+"';";
			PreparedStatement st1=con.prepareStatement(sql1);
			st1.executeUpdate();
	    	assertEquals("Password is required.",driver.findElement(By.xpath("//div[@id='main']/div/form/font[2]")).getText());
	    }
	    else if(isElementPresent(driver,By.linkText("Log Out")))
	    {
	    	String sql1="UPDATE Login SET STATUS='Pass' WHERE UserName='"+username+"';";
			PreparedStatement st1=con.prepareStatement(sql1);
			st1.executeUpdate();
	    	//assertTrue(isElementPresent(By.linkText("Log Out")));
	        driver.findElement(By.linkText("Log Out")).click();
	    }
	    else
	    {
	    	String sql1="UPDATE Login SET STATUS='Fail' WHERE UserName='"+username+"';";
			PreparedStatement st1=con.prepareStatement(sql1);
			st1.executeUpdate();
	    	assertEquals("Invalid UserName and Password.",driver.findElement(By.xpath("//div[@id='main']/div/div/font")).getText());
	    }
	   
	    Thread.sleep(1000);
	}
    
		st.close();
		con.close();
	}
	catch(Exception ex)
	   {
		System.err.print("Exception: ");
		System.err.println(ex.getMessage());
	   } 
  }

  private boolean isElementPresent(WebDriver driver,By by)
	{
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		try
		{
			driver.findElement(by);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
  @AfterMethod
  public void tearDown() throws Exception {
    driver.quit();
   
   
  }

  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

  
  }


