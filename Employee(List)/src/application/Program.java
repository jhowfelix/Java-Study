package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.println("Enter the number of employees: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + i + " employee");
			System.out.println("Outsourced (y/n)? ");
			char op = sc.next().charAt(0);
			if (op == 'y') {
				System.out.println("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Hours: ");
				Integer hours = sc.nextInt();
				System.out.println("Value per hour: ");
				Double valuePerHour = sc.nextDouble();
				System.out.println("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				var outSourcedEmployee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(outSourcedEmployee);

			} else if (op == 'n') {
				System.out.println("Name: ");

				String name = sc.next();
				System.out.println("Hours: ");
				Integer hours = sc.nextInt();
				System.out.println("Value per hour: ");
				Double valuePerHour = sc.nextDouble();
				var employee = new Employee(name, hours, valuePerHour);
				list.add(employee);

				for (int j = 0; j < n; j++) {
					System.out.println(list.get(j).toString());
				}
			}

		}

		sc.close();
	}

}
