package net.corjava;

//DELETE  FROM USERS WHERE username=?;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delet_fromdb {
	public static void main(String[] args) {

		//String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String jdbcURL = "jdbc:mysql://localhost:3306/devd";
		
		//String dbusername = "HR";
		String dbusername = "root";
		String dbpassword = "root";
	//	String dbpassword = "HR";
	//	String username = "vijay";
		String username = "vijay g mauya";
		try {
			Connection connection = DriverManager.getConnection(jdbcURL, dbusername, dbpassword);

			String sql = " DELETE FROM users where  username=?";
			PreparedStatement smt = connection.prepareStatement(sql);

			smt.setString(1, username);
			int rows = smt.executeUpdate();
			if (rows > 0) {
				System.out.println("user deleted  successfully as deleted ");
			}
			
		} catch (SQLException ex) {
			System.out.println("This user does not present");
			ex.printStackTrace();
		}

	}

}
