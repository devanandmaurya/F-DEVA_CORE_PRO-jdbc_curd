package net.corjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UsersManagers {

	public static void main(String[] args) {
		
		System.out.println("testing is done");
		/*
		 * try { Class.forName("oracle.jdbc.driver.OracleDriver"); } catch
		 * (ClassNotFoundException e) { e.printStackTrace(); }
		 * 
		 * // Oracle SID = orcl , find yours in tnsname.ora try (Connection conn =
		 * DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:orcl",
		 * "system", "Password123")) {
		 * 
		 * if (conn != null) { System.out.println("Connected to the database!"); } else
		 * { System.out.println("Failed to make connection!"); }
		 * 
		 * } catch (SQLException e) { System.err.format("SQL State: %s\n%s",
		 * e.getSQLState(), e.getMessage()); } catch (Exception e) {
		 * e.printStackTrace(); }
		 * 
		 * } }
		 */
		String jdbcURL = "jdbc:mysql://localhost:3306/devd";
		
		//String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "root";
		//String username = "HR";
		//String password = "HR";
		String password = "root";

		try {
			Connection connection = DriverManager.getConnection(jdbcURL, username, password);
			String sql = "INSERT INTO USERS(user_id, username,password,email)"
					+ "values(333,'devanand_Maurya','DE@12','dev@gmail')";

			Statement smt = connection.createStatement();
			int row = smt.executeUpdate(sql);
			if (row > 0) {
				System.out.println("A new user has inserted");
			}

			//connection.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

}
