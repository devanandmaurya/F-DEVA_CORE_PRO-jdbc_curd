package net.corjava;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Updatedata_db_by_preparedsmt {
	public static void main(String[] args) {
		String jdbcURL = "jdbc:mysql://localhost:3306/devd";
		
		//String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String dbusername = "root";
	//	String dbusername = "HR";
		String dbpassword = "root";
	//	String dbpassword = "HR";
		String password = "deva@123";
		String username = "devadkp";
		String email = "rasd@123";

		try {
			Connection connection = DriverManager.getConnection(jdbcURL, dbusername, dbpassword);

			String sql = " update users set password = ? , email=? where  username=?";
			PreparedStatement smt = connection.prepareStatement(sql);

			smt.setString(1, password);
			smt.setString(2, email);

			smt.setString(3, username);

			int rows = smt.executeUpdate();
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
