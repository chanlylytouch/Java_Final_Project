package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteEmployee {
	static Connection con;
	String url = "jdbc:mysql://localhost:3306/java_project";
    String user = "root";
    String password = "";
	public void deleteEmployee() {
		try {
		      Connection connection = DriverManager.getConnection(url, user, password);
		      Scanner strInput = new Scanner(System.in);
		      System.out.println("Enter employees id: ");
		      int id = strInput.nextInt();
		      String query = "delete from employees where id = " + id;
		        PreparedStatement statement = connection.prepareStatement(query);
		        statement.executeUpdate(query);
		        System.out.println("The record removed");
		    } catch (Exception e) {
		      // TODO: handle exception
		    }
		}
}
