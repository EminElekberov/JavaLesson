package Helper;
import java.sql.*;
public class Dbconnection {
	Connection c=null;
	
	public Dbconnection() {}
	
		public Connection connDb() {
			try {
				this.c=DriverManager.getConnection("jdbc:mariadb://localhost:3325/hospital?user=root&password=emin2001");
				return c;
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return c;
			
		}
	
	
}
