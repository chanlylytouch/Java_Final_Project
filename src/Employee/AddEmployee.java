package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddEmployee {
	
	static Connection con;
	String url = "jdbc:mysql://localhost:3306/java_project";
    String user = "root";
    String password = "";
	
	public void createEmployee() {
	try {
	       
	       Connection con = DriverManager.getConnection(url, user, password);
	       String sql = "INSERT INTO employees" +
	              "  (firstname, lastname,gender,age,dateOfBirth,province,phone,email, position_id, role_id,department_id) VALUES " +
	              " (?, ?, ?, ?, ?,?,?,?,?,?,?)";
	       Scanner strInput = new Scanner(System.in);
	       Scanner input=new Scanner(System.in);
	       System.out.println("Enter employee firstname: ");
	       String firstname = strInput.nextLine();
	       System.out.println("Enter employee lastname: ");
	       String lastname = strInput.nextLine();
	       System.out.println("Enter employee gender: ");
	       String gender = strInput.nextLine();
	       System.out.println("Enter employee age: ");
	       int age = input.nextInt();
	       System.out.println("Enter employee date of birth: ");
	       String dob = strInput.nextLine();
	       System.out.println("Enter employee province: ");
	       String province = strInput.nextLine();
	       System.out.println("Enter employee phone: ");
	       String phone = strInput.nextLine();
	       System.out.println("Enter employee email: ");
	       String email = strInput.nextLine();
	       System.out.println("Enter employee position Id: ");
	       int positionID = input.nextInt();
	       System.out.println("Enter employee role Id: ");
	       int roleID = input.nextInt();
	       System.out.println("Enter employee department Id: ");
	       int departmentID = input.nextInt();
	       // Step 2:Create a statement using connection object
	       PreparedStatement statement = con.prepareStatement(sql);
	       statement.setString(1, firstname);
	       statement.setString(2, lastname);
	       statement.setString(3, gender);
	       statement.setInt(4, age);
	       statement.setString(5, dob);
	       statement.setString(6, province);
	       statement.setString(7, phone);
	       statement.setString(8, email);
	       statement.setInt(9, positionID);
	       statement.setInt(10, roleID);
	       statement.setInt(11, departmentID);
	           System.out.println(statement);
	           // Step 3: Execute the query or update query
	           statement.executeUpdate();
	           System.out.println("successfull insert");
	       
	  } catch (Exception e) {
	    // TODO: handle exception
	  }
	}
}
