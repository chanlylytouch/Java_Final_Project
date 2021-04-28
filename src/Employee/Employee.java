package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Employee_Management.Main;
import Position.Position;

public class Employee implements Menu{
	public void menu() {

		System.out.println("==================\n Employee Menu\n================== ");
		System.out.println("1: View Employee");
		System.out.println("2: Create Employee");
		System.out.println("3: Edit Employee");
		System.out.println("4: Delete Employee");
		System.out.println("5: Find Employee");
		System.out.println("\nEnter a Option (1-5): ");
	}

	public void employee() {
		Scanner input = new Scanner(System.in);
		Scanner strInput = new Scanner(System.in);
		ViewEmployee view = new ViewEmployee();
		int choice;

		do {
			choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("View Employee");
				view.viewEmployee();
				break;
			case 2:
				System.out.println("Create Employee");
				AddEmployee add = new AddEmployee();
				add.createEmployee();
				break;
			case 3:
				System.out.println("Edit Employee");
				UpdateEmployee update = new UpdateEmployee();
				view.findEmployee();
				update.updateEmployee();
				break;
			case 4:
				System.out.println("Delete Employee");
				DeleteEmployee delete = new DeleteEmployee();
				delete.deleteEmployee();
				;
				break;
			case 5:
				System.out.println("Find Employee");
				view.findEmployee();
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
			
		} while (choice != 5);

		System.out.println("Exit program");
	}

	@Override
	public void mainMenu() {
		System.out.println("==================\n Employee Menu\n================== ");
		System.out.println("1: Employee");
		System.out.println("2: Position");
		System.out.println("3: Department");
		System.out.println("\nEnter a Option (1-3): ");
		
	}


}
