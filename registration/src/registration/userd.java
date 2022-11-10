package registration;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import registration.user;

	public class userd {

	    public int registerEmployee(user user) throws ClassNotFoundException {
	        String INSERT_USERS_SQL = "INSERT INTO usertable" +
	            "  (username, password, mail, dob) VALUES " +
	            " (?,?,?,?);";

	        int result = 0;

	        Class.forName("com.mysql.cj.jdbc.Driver");

	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/practisework", "root", "admin");

	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
	        	  preparedStatement.setString(1, user.getPassword());
	            preparedStatement.setString(2, user.getUsername());
	            preparedStatement.setString(3, user.getmail());
	            preparedStatement.setInt(4, user.getdob());
	            

	            System.out.println(preparedStatement);
	            // Step 3: Execute the query or update query
	            result = preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            // process sql exception
	            printSQLException(e);
	        }
	        return result;
	    }

	    private void printSQLException(SQLException ex) {
	        for (Throwable e: ex) {
	            if (e instanceof SQLException) {
	                e.printStackTrace(System.err);
	                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	                System.err.println("Message: " + e.getMessage());
	                Throwable t = ex.getCause();
	                while (t != null) {
	                    System.out.println("Cause: " + t);
	                    t = t.getCause();
	                }
	            }
	        }
	    }
	}

