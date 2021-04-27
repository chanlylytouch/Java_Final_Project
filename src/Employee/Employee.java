package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Position.Position;



public class Employee {
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
		Scanner input=new Scanner(System.in);
		Scanner strInput = new Scanner(System.in);
		int choice;
		
		do {
		choice=input.nextInt();
		switch(choice) {
			case 1:
				System.out.println("View Employee");
				ViewEmployee view = new ViewEmployee();
				view.viewEmployee();
				break;
			case 2:
				System.out.println("Create Employee");
				
				System.out.println("Do you want to add more?Y/N");
			    String addmore = strInput.nextLine();
			       if(addmore == "Y") {
			    	   //employee.createEmployee();
			       }else if(addmore == "N"){
			    	   System.out.println("Back to menu");
			       }
				break;
			case 3:
				System.out.println("Edit Employee");
				
				break;			
			default:
				System.out.println("Invalid input");
				break;
			}
		System.out.println("Do you want to continue? Y/N");
		String inputString = strInput.nextLine();
		}while(choice!=5);
	
		System.out.println("Exit program");
	}

}
