package empmanagement;

import java.util.Scanner;
public class EmpMain {

	EmployeeService service=new EmployeeService();
	static boolean ordering = true;
	public static void menu() {
        System.out.println("**********WELCOME TO EMPLOYEE MANAGEMENT SYSTEM**********"
        		+ " "
        		+ "\n1. Add Employee "
        		+ "\n2.View Employee"        																																																				+ "\n3.Update Employee"
        		+ "\n4. Delete Employee"
        		+ "\n5.View All Employee"
        		+ "\n6. Exit ");
    }
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService service=new EmployeeService();
		
		do {
			menu();
			System.out.println("<<<<<<<ENTER YOUR CHOICE>>>>>>>");
			int choice=sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("ADD EMPLOYEE");
				service.addEmp();
				break;
			case 2:
				System.out.println("VIEW EMPLOYEE");
				service.viewEmp();
				break;
			case 3:
				System.out.println("UPDATE EMPLOYEE");
				service.updateEmployee();
				break;
			case 4:
				System.out.println("DELETE EMPLOYEE");
				service.deleteEmp();
				break;
			case 5:
				System.out.println("VIEW ALL EMPLOYEE");
				service.viewAllEmps();
				break;
			case 6:
				System.out.println("**** THANK YOU FOR VISITING ****");
				System.exit(0);
				
			default:
				System.out.println("Please enter valid choice");
				break;
			
			
			}
			
		}while(ordering);
		
			}
		
	}
