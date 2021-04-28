package Position;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Position {
	public void viewPosition() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_test", "root", "");

			java.sql.Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery("select * from position");
			System.out.println("|ID   FirstName  Description|");
			System.out.println("------------------------------------------");
			while (result.next())
				System.out
						.println("|" + result.getInt(1) + "    " + result.getString(2) + "    " + result.getString(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void craetePosition() {
		try {

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_test", "root", "");
			String sql = "INSERT INTO position" + "  (id,name, description) VALUES " + " (?,?,?)";
			Scanner strInput = new Scanner(System.in);
			Scanner input = new Scanner(System.in);
			System.out.println("Enter position id: ");
			int id = input.nextInt();
			System.out.println("Enter position name: ");
			String position = strInput.nextLine();
			System.out.println("Enter position description: ");
			String description = strInput.nextLine();
			// Step 2:Create a statement using connection object
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, id);
			statement.setString(2, position);
			statement.setString(3, description);

			System.out.println(statement);
			// Step 3: Execute the query or update query
			statement.executeUpdate();
			System.out.println("successfull insert");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
