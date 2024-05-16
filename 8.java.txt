import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLExample {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:postgresql://localhost:5432/database_name";
        String username = "admin";
        String password = "admin@12345";

            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            connection.close();
        }
}
