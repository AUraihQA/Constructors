package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Runner {

	// JDBC driver and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.driver";
	static final String DB_URL = "jdbc:mysql://localhost/software1";
	// static final String DB_URL = "jdbc:mysql://127.0.0.1/software1 ";

	// DB username and password
	static final String USER = "root";
	static final String PASS = "root";

	public static void main(String[] args) {

		SQLExample ex = new SQLExample();
		ex.setFirstName("Jim");

		try {
			Connection conn = null;
			Statement stmt = null;

			// Registering our JDBC Driver
			Class.forName("com.mysql.jdbc.Driver");

			// Open a connection
			System.out.println("connection is being opened");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// Create our create statement
//			System.out.println("Creating our create statement");
//			stmt = conn.createStatement();
//			String sql;
//			sql = "INSERT INTO `software1`.`people` (`id`, `first`, `second`) VALUES ('2', 'Adi', 'Uraih');";
//			stmt.execute(sql);

			// Create our delete statement
//			System.out.println("Creating our delete statement");
//			stmt = conn.createStatement();
//			sql = "DELETE FROM `software1`.`people` WHERE (`id` = '2');";
//			stmt.execute(sql);

			// Create our read statement
			System.out.println("Creating our statement");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT first,second FROM people WHERE first = " + ex.getFirstName();
			ResultSet rs = stmt.executeQuery(sql);

			// Iterate over the object and each record out
			while (rs.next()) {
//				int id = rs.getInt("id");
				String fName = rs.getString("first");
				String sName = rs.getString("second");

				System.out.println(" First Name: " + fName + " SecondName: " + sName);

			}

			rs.close();
			stmt.close();
		}
//			conn.close();
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
//		System.out.println("Keep doing more stuff");
//		try {
//			@SuppressWarnings("resource")
//			Scanner sc = new Scanner(System.in);
//			int num = sc.nextInt();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			System.out.println("Happening regardless");
//		} 
	}
}