package VeryBasicSeparateSeparate;

//import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchData {
	public static void main(String[] args) {
	//1- Load Driver
	try {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		//2- Establish connection
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SQL_Practice","root","himanshu");
	
//3- Create statement 
Statement st = conn.createStatement();
String sql_query = "select * from Student";

// 4. Execute query 
	ResultSet rs = st.executeQuery(sql_query);

//
	while(rs.next()) {
		int s_id  = rs.getInt(1);
		String s_name = rs.getString(2);
		//or we can access by column name
		String s_branch = rs.getString("BRANCH");
		String s_per = rs.getString(4);
		
		System.out.println("Study ID = "+s_id + 
				"\nStudent Name = "+ s_name + 
				"\nStudent Branch = "+s_branch+
				"\nStudent Percentage = "+ s_per);
		System.out.println("================================");
		
	}
	conn.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
	
}
}