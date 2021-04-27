package Employee_Management;

import java.util.ArrayList;
import java.util.Scanner;

import Employee.Employee;
import Position.Position;

public class Main {

	public static void main(String[] args) {
		
		//Position position = new Position();
		Scanner input=new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("==================\n Employee Menu\n================== ");
			System.out.println("1: Employee");
			System.out.println("2: Position");
			System.out.println("3: Department");
			System.out.println("\nEnter a Option (1-3): ");
			
			choice=input.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Employee");
					Employee employee = new Employee();
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
			
		}while(choice!=3);
		
		System.out.println("Exit program");
	}

}
