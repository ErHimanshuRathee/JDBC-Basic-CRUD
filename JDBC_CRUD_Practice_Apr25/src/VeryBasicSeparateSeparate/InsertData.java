package VeryBasicSeparateSeparate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class InsertData {

	public static void main(String[] args) {

		try {

//1. Load driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

//			2. establish connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SQL_Practice","root","himanshu");

//			3. create statement
			Statement st = conn.createStatement();

//			4. execute query
//			String insert_query = "INSERT INTO Student (SID, SNAME, BRANCH, PER) VALUES (12, 'Ram', 'CSE2', 99)";
			String insert_query = "INSERT INTO Student VALUES (10, 'Rummy', 'ISA', 84)";
			
			
//			String Update_query = "update Student set SNAME = 'RAATHI' where SID=2";
//			System.out.println("check");

			int check = st.executeUpdate(insert_query);
			if (check>0) {
				System.out.println("Data inserted...");
			} else {
				System.out.println("Not inserted!");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
