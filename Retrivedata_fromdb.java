package net.corjava;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Retrivedata_fromdb {

	public static void main(String[] args) {
		String jdbcURL = "jdbc:mysql://localhost:3306/devd";
		
		//String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String dbusername = "root";
	//	String dbusername = "HR";
		String dbpassword = "root";
		//String dbpassword = "HR";
		/*
		 * String username = "vijay";// these are dynamic value insert here success
		 * String password = "sded%$3"; String email = "devanand@gmail.com"; int user_id
		 * = 87;
		 */
		try {
			Connection connection = DriverManager.getConnection(jdbcURL, dbusername, dbpassword);

			String sql = ("SELECT * FROM USERS");

			Statement smt = connection.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			while (rs.next()) {
				int user_id1 = rs.getInt(1);
				String username1 = rs.getString(2);
				String passwords = rs.getString(3);

				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
//			System.out.println(user_id1);
//			System.out.println(username1);
//			System.out.println(passwords);
//		
			}
		} catch (SQLException ex) {
			//System.out.println("This is not best output");
			ex.printStackTrace();
		}

	}

}
