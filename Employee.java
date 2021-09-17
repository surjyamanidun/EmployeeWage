package employee;
import java.util.Random;

public class Employee {
	

	public static void main(String[] args) {

		Random rand = new Random();

		int empCheck = rand.nextInt(2);

		System.out.println(empCheck);

		switch (empCheck) {

		case 0:

			System.out.println("Employee is present");
			break;

		default:

			System.out.println("Employee is Absent");

		}

	}

}