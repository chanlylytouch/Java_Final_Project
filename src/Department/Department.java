package Department;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Department {
	public Department() {
	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_test", "root", "");

	      java.sql.Statement statement = con.createStatement();
	      ResultSet result = statement.executeQuery("select * from department");
	      System.out.println("|ID   FirstName  |");
	      System.out.println("------------------------------------------");
	      while (result.next())
	        System.out.println("|"+result.getInt(1) + "    " + result.getString(2));
	      con.close();
	    } catch (Exception e) {
	      System.out.println(e);
	    }
	  }
}
