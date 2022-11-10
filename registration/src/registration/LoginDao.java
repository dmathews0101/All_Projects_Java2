package registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

	public static boolean validate(String name, String password)
	{
		boolean status=false;
		try {
			String mysqlURL="jdbc:mysql://localhost:3306/practicework";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(mysqlURL, "root","admin");
			String query="select * from usertable where username=? and password=?";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, password);
            ResultSet rs=ps.executeQuery();
            status=rs.next();
            
            
            
            
		}catch(Exception e) {
			System.out.println(e);
		}
		return status;
	}
}