package BD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConectarBD {
	Statement stmt;
    ResultSet rs;
    Connection connection;
    PreparedStatement pstmt;
    
    public int Conectar() {
    	try {
    		Class.forName("oracle.jdbc.driver.OracleDriver");
            connection =DriverManager.getConnection(
                    "jdbc:oracle:thin:@grad.icmc.usp.br:15215:orcl",
                    "11275071","a"); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return -1;
		}   	
    	return 1;
    }
}
