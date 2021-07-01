import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class TestConnexionJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ResourceBundle bundle=ResourceBundle.getBundle("database");
		
		try {
		Class.forName(bundle.getString("db.jdbc.driver"));
		} catch (ClassNotFoundException e) {
			System.err.println("classe non trouvée"+bundle.getString("db.jdbc.driver"));
		}
		
		String dburl = bundle.getString( "db.url");
		String login = bundle.getString("db.login");
		String pwd = bundle.getString( "db.password");
		
		
		try(Connection connection = DriverManager.getConnection(dburl, login, pwd)) {
			System.out.println(connection);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
