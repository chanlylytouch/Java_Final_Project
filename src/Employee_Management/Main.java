package Employee_Management;

import java.util.ArrayList;
import java.util.Scanner;

import Employee.Employee;
import Position.Position;

public class Main {

	public static void main(String[] args) {

		// Position position = new Position();
		Scanner input = new Scanner(System.in);
		int choice;
		Employee employee = new Employee();
		employee.mainMenu();
		

		do {
			choice = input.nextInt();
			switch (choice) {
			case 1:
				// System.out.println("Employee");
				employee.subMenu();;
				employee.employee();
				
				break;
			case 2:
				System.out.println("Position");
				
				break;
			case 3:
				System.out.println("Department");

				break;
			default:
				System.out.println("Invalid input");
				break;
			}

		} while (choice != 3);

		System.out.println("Exit program");
	}

}
