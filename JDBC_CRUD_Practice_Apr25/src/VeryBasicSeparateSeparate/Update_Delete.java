package VeryBasicSeparateSeparate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

//import com.mysql.jdbc.Driver;

public class Update_Delete {

	public static void main(String[] args) {
		try {
//			1. Load Driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

//			2. Establish Conection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SQL_Practice", "root",
					"himanshu");

//			3.create statement
			Statement st = conn.createStatement();

//			4. Execute query
//			String update_query = "update Student set SID=122, SNAME='Honey singh', PER=100 where SID=1";
			String delete_query = "delete from student where SID=3";

			int update = st.executeUpdate(delete_query);
			if(update>0) {
				System.out.println("Yes data updated");
			} else {
				System.out.println("Data not updated....");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
