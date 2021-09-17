package employee;

public class Employee {


	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");
		
		int WAGE_HOURS = 20;
		int DAILY_HOURS = 8;
		

		double empCheck = Math.floor(Math.random() * 10) % 2;

		System.out.println(empCheck);

		if (empCheck == 1) {

			System.out.println("Employee is Present");
			
			System.out.println("Daily Employee Wage is: "+  WAGE_HOURS * DAILY_HOURS);
			
		}

		else {
			System.out.println("Employee is Absent");
		}

	}

}