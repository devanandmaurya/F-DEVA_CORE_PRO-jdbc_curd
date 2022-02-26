package net.corjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CONNECTIONCLASS {

	public static void main(String args[]) {
		try {
			// step1 load the driver class
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("com.mysql.jdbc.Driver");

			// step2 create the connection object
			// Connection con =
			// DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "HR",
			// "HR");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/devd", "root", "root");

			// step3 create the statement object.
			Statement stmt = con.createStatement();

			// step4 execute query
			ResultSet rs = stmt.executeQuery("select * from users");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

			// step5 close the connection object
			con.close();
			stmt.close();
			System.out.println("connection succsess and data got..!! ");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}