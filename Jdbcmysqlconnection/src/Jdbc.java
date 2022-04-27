import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
        //1.Mention the type of the DB used// like system.setProperty
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2.Connection URL
		Connection cn = DriverManager.getConnection("jdbc:mysql://root@localhost/testing");
		//3.Connection Statement 
		Statement st = cn.createStatement();
		//4.Store in ResultSet
		ResultSet result = st.executeQuery("SELECT * FROM tbl_login");
		
		while(result.next())
				{
			System.out.println(result.getString(1));
			System.out.println(result.getString(2));
				}
	}

}
