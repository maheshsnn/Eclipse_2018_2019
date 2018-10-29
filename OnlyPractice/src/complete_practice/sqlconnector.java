package complete_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class sqlconnector {
	
	public static void main(String[] args) throws Exception {
		
		
	Connection connect=	DriverManager.getConnection("", "", "");
	
	Statement st=connect.createStatement();
	
	ResultSet r=st.executeQuery("");
	
	ArrayList al=new ArrayList();
	
	while(r.next())
	{
		System.out.println(r.getInt(1)+""+r.getString(2));
   	 
   	 al.add(r.getInt(1)+""+r.getString(2));
	}
		
	
		
	}

}
