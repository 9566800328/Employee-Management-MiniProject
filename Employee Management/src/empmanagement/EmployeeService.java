package empmanagement;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeService {
	
	HashSet<Employee> empset=new HashSet<Employee>();
	// create the employee
	Employee emp1=new Employee(101, "Tamilarasan", 19, "Developer", "IT", 45000);
	Employee emp2=new Employee(102, "Sathish", 18, "Tester","CO", 50000);
	Employee emp3=new Employee(103, "Dinesh", 20, "Manager","Group", 80000);
	Employee emp4=new Employee(104, "Shahul", 21, "supervisor","CO",  40000);
	
	Scanner sc=new Scanner(System.in);
	boolean found=false;
	int id;
	String name;
	int age;
	String department;
	String designation;
	double salary;
	

	public EmployeeService() {
		
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		
	}
	
	//view all employees
	
	public void viewAllEmps() {
		for(Employee emp:empset) {
			System.out.println(emp);
		}
	}
	//view employee based on there id
	
	public void viewEmp(){
		
		System.out.println("Enter id: ");
		id=sc.nextInt();
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println(emp);
				found=true;
			}
			
		}
		if(!found) {
			System.out.println("Employee with this id is not present");
		}
	}
	
	//update the employee details
	
	public void updateEmployee() {
		System.out.println("Enter id: ");
		id=sc.nextInt();
		boolean found=false;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println("Enter name: ");
				name=sc.next();
				System.out.println("Enter new Salary");
				salary=sc.nextDouble();
				emp.setName(name);
				emp.setSalary(salary);
				System.out.println("Updated Details of employee are: ");
				System.out.println(emp);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			System.out.println("-----Employee details updated successfully-----");
		}
	}
	
	//delete employee details
	
	public void deleteEmp() {
		System.out.println("Enter id");
		id=sc.nextInt();
		boolean found=false;
		Employee empdelete=null;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				empdelete=emp;
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			empset.remove(empdelete);
			System.out.println("Employee deleted successfully!!");
		}
	}
	
	//add employee details
	
	public void addEmp() {
		System.out.println("Enter id:");
		id=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("enter Desiganation");
		designation=sc.next();
		System.out.println("Enter Department");
		department=sc.next();
		System.out.println("Enter salary");
		sc.nextDouble();
		
		Employee emp=new Employee(id, name, age, designation, department, salary);
		
		empset.add(emp);
		System.out.println(emp);
		System.out.println("Employee addeed successfully");
		
	}
	
	}