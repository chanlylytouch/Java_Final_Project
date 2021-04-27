package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmployee {
	static Connection con;
	String url = "jdbc:mysql://localhost:3306/java_project";
    String user = "root";
    String password = "";
	///=====Update=====///
		public void updateEmployee() {        
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Scanner strInput = new Scanner(System.in);
			Scanner input=new Scanner(System.in);
			System.out.println("Enter employee id: ");
			int id = input.nextInt();
			String query = "update employees set id=?,firstname = ?, lastname = ?, gender = ?, age = ?, dateOfBirth = ? , province = ?, phone = ?, email = ? ,position_id = ?"
					+ ",role_id = ?, department_id = ?  where id = " +id;
			PreparedStatement statement = con.prepareStatement(query);
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
		       // Step 2:Update a statement using connection object
		       statement.setInt(1, id);
		       statement.setString(2, firstname);
		       statement.setString(3, lastname);
		       statement.setString(4, gender);
		       statement.setInt(5, age);
		       statement.setString(6, dob);
		       statement.setString(7, province);
		       statement.setString(8, phone);
		       statement.setString(9, email);
		       statement.setInt(10, positionID);
		       statement.setInt(11, roleID);
		       statement.setInt(12, departmentID);
			System.out.println(statement);
			// Step 3: Execute the query or update query
			statement.executeUpdate();
			System.out.println("update successfull");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 
		}
}
