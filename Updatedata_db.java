package net.corjava;
// execute update in sql 

// update users set password = ?, username=? , email=? where user_id= ?;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Updatedata_db {

	public static void main(String[] args) {
		String jdbcURL = "jdbc:mysql://localhost:3306/devd";
		
	//	String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		//String dbusername = "HR";
		String dbusername = "root";
		//String dbpassword = "HR";
		String dbpassword = "root";
		/*
		 * String username = "vijay";// these are dynamic value insert here success
		 * String password = "sded%$3"; String email = "devanand@gmail.com"; int user_id
		 * = 87;
		 */
		try {
			Connection connection = DriverManager.getConnection(jdbcURL, dbusername, dbpassword);

			String sql = "UPDATE USERS SET password ='ram@323' WHERE  username='deva'";
			Statement smt = connection.createStatement();
			int rows = smt.executeUpdate(sql);
			if (rows > 0) {
				System.out.println("updated successfully");
			}
			connection.close();
		} catch (SQLException ex) {
			System.out.println("This is not best output");
			ex.printStackTrace();
		}

	}

}
