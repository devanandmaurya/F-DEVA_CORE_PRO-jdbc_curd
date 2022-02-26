package net.corjava;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/*import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;*/

public class preparedstatment {

	public static void main(String[] args) {
		//jdbc:mysql://localhost:3306/sonoo","root","root

		String jdbcURL = "jdbc:mysql://localhost:3306/devd";
				//String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String dbusername = "root";
		//String dbusername = "HR";
		String dbpassword = "root";
	//	String dbpassword = "HR";
		//String username = "vijay g mauya";// these are dynamic value insert here success
		String username = "ajay ";// these are dynamic value insert here success
	//	String password = "dev%$3";
		String password = "devanand Maurya";
		String email = "dev@12";
		//String email = "devanand@gmail.com";
	//	int user_id = 80907;
	//	int user_id =41;
		//+++++++++++++++++++
	//	try (Connection con = DriverManager.getConnection(someConnection, user, password)) {
		  //  try (PreparedStatement pstmt = con.prepareStatement(sqlStatement)) {
		//        pstmt.executeUpdate();
		//    }

		 ///   try (PreparedStatement pstmt = con.prepareStatement(anotherSqlStatement)) {
		    //    pstmt.executeUpdate();            
		  //  }
	//	}
//i am using  id as a peimary key that why i am not inaert value of id  its autoincrimented.and 
		//you can also insert your wone id
		try {
			
			java.sql.Connection connection= DriverManager.getConnection(jdbcURL ,dbusername ,dbpassword);
			//Connection connection = (Connection) DriverManager.getConnection(jdbcURL, dbusername, dbpassword);
			String sql = "INSERT INTO USERS(username,password,email)" + "values(?,?,?)";

			PreparedStatement smt = connection.prepareStatement(sql);
		//	smt.setInt(1, user_id);
			smt.setString(1, username);
			smt.setString(2, password);
			smt.setString(3, email);

			int row = smt.executeUpdate();
			if (row > 0) {
				System.out.println("A  new user has beeb inserted");
			}

			connection.close();
		} catch (SQLException ex) {
			System.out.println("No user insert");
			ex.printStackTrace();
		}

	}

}
