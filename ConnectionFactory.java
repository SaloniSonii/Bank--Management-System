import java.sql.*;

public class ConnectionFactory {
    Connection con;
    Statement stmt;

    public ConnectionFactory() {
        try {
            // Step-1 Load the driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // Step-2 Connection create
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
            // Step-3 Statement create
            stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}
