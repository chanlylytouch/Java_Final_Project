package Employee_Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Employee {
	public Employee() {
	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_final_project", "root", "");

	      java.sql.Statement statement = con.createStatement();
	      ResultSet result = statement.executeQuery("select * from employees");
	      System.out.println("|ID   FirstName  |");
	      System.out.println("------------------------------------------");
	      while (result.next())
	        System.out.println("|"+result.getInt(1) + "    " + result.getString(2)+ "    " + result.getString(3)+ "    " + result.getString(4)
	        + "    " + result.getString(5)+ "    " + result.getString(6)+ "    " + result.getString(7)+ "    " + result.getString(8)+ "    " + result.getString(9)
	        + "    " + result.getString(10)+ "    " + result.getString(11)+ "    " + result.getString(12));
	      con.close();
	    } catch (Exception e) {
	      System.out.println(e);
	    }
	  }
}
