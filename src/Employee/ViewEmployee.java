package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ViewEmployee {
	public void viewEmployee() {
	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      Connection con = DriverManager.getConnection(url, user, password);

	      java.sql.Statement statement = con.createStatement();
	      ResultSet result = statement.executeQuery("SELECT emp.id,emp.firstname,emp.lastname,emp.gender,emp.age,emp.dateOfBirth,emp.province,emp.phone,emp.Email,dep.name,pos.name FROM employees emp INNER JOIN department dep ON emp.department_id=dep.id LEFT JOIN position pos on emp.position_id=pos.id");
	      System.out.println("|ID   FirstName  Lastname	Gender Age	DateOfBirth	 Province Phone  Email  Position  Department|");
	      System.out.println("---------------------------------------------------------------------------------------------------------------------------");
	      while (result.next()) {
	    	  int id = result.getInt(1);
	    	  String firstname = result.getString(2);
	    	  String lastname = result.getString(3);
	    	  String gender = result.getString(4);
	    	  int age = result.getInt(5);
	    	  String dob = result.getString(6);
	    	  String province = result.getString(7);
	    	  String phone = result.getString(8);
	    	  String email = result.getString(9);
	    	  String position = result.getString(10);
	    	  String department = result.getString(11);
	        System.out.println("|"+id + "    " + firstname+ "    " + lastname+ "     " + gender
	        + "    " + age+ "    " + dob+ "    " + province+ "    " + phone+ "    " + email
	        + "    " + position+ "    " + department);
	      }
	      con.close();
	    } catch (Exception e) {
	      System.out.println(e);
	    }
	}
	static Connection con;
	String url = "jdbc:mysql://localhost:3306/java_project";
    String user = "root";
    String password = "";
	public void findEmployee() {
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			java.sql.Statement statement = con.createStatement();
			Scanner input=new Scanner(System.in);
			System.out.println("Enter employee id: ");
			int id = input.nextInt();
		      ResultSet result = statement.executeQuery("SELECT emp.id,emp.firstname,emp.lastname,emp.gender,emp.age,emp.dateOfBirth,emp.province,emp.phone,emp.Email,dep.name,pos.name FROM employees emp INNER JOIN department dep ON emp.department_id=dep.id LEFT JOIN position pos on emp.position_id=pos.id where emp.id="+id);
		      System.out.println("|ID   FirstName  Lastname	Gender Age	DateOfBirth	 Province Phone  Email  Position   Department|");
		      System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		      while (result.next())
		        System.out.println("|"+result.getInt(1) + "    " + result.getString(2)+ "    " + result.getString(3)+ "     " + result.getString(4)
		        + "    " + result.getString(5)+ "    " + result.getString(6)+ "    " + result.getString(7)+ "    " + result.getString(8)+ "    " + result.getString(9)
		        + "    " + result.getString(10)+ "    " + result.getString(11));
		      con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
