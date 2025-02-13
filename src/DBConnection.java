import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection  implements IDBConnection {
	   
		String BDD = "nomBD";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    private Connection conn;

	    private static DBConnection instance;
	    private DBConnection() throws SQLException {
			conn=DriverManager.getConnection(url, user,passwd);
		}

	   

	    public static DBConnection getInstance() throws SQLException {
	    	if(instance == null) {
	    		instance = new DBConnection();
	    	} else if (instance.getConn().isClosed()) {
	            instance = new DBConnection();
	        }

	    	return instance;
	    }
		
	    
	    @Override
	    public Connection getConn() throws SQLException {
	    	if(conn.isClosed()) {
	    		conn=DriverManager.getConnection(url, user,passwd);
	    	}
			return conn;
		}
	
}
