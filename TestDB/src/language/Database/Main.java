package language.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Emmanuel\\Downloads\\pradeep_sqlite\\Testjava.db");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER, email TEXT)");
            statement.execute("INSERT INTO contacts(name, phone,email)"+ "VALUES('Bob','123456','bob@email.com')" );
            statement.close();
            conn.close();

        } catch (SQLException e){
            System.out.println("Something went wrong: "+ e.getMessage());
        }
	// write your code here
    }
}
