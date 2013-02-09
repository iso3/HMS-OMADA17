
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SQLUtilities {
	
	 public static Connection connect()
	 {
		 Connection connection = null;
		    try {
		        // Load the JDBC driver
		        String driverName = "com.mysql.jdbc.Driver"; // MySQL MM JDBC driver
		        Class.forName(driverName);
		    
		        // Create a connection to the database

		        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8";
		        String username = "root";
		        String password = "root";
		        connection = DriverManager.getConnection(url, username, password);
		    } catch (ClassNotFoundException e) {
		        // Could not find the database driver
		    } catch (SQLException e) {
		        // Could not connect to the database
		    }
		    return connection;
	 }
	 
	 public static ResultSet executeSQL(String query, Connection connection)
	 {
		 if (connect()!=null)
		 {
			 try {
				Statement statement = connection.createStatement();
				statement.execute(query);
				return statement.getResultSet();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 
		 return null;
	 }
	 
	 public static void disconnect(Connection connection)
	 {
		 if (connection !=null)
		 {
			 try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }

}
