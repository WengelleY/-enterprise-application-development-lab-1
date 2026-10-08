import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/StudentsDB";
            String username = "root";
            String password = "0911627815";

            Connection connection = DriverManager.getConnection(
                    url,
                    username,
                    password
            );


            Statement statement = connection.createStatement();




            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}