package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Employee;
import entities.Individual;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee>list = new ArrayList<>();
		System.out.println("Enter the number of tax Players:");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Tax Payer #" + (i+1) + " data:");
			System.out.println("Individual or Company(i/c):");
			char cond = sc.next().charAt(0);
			System.out.println("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Anual Income:");
			double income = sc.nextDouble();
			if(cond =='i') {
				System.out.println("Health Expendures:");
				double health = sc.nextDouble();
				Employee emp = new Individual(name, income, health);
				list.add(emp);
			}else {
				System.out.println("Inform the number of employee:");
				int employee = sc.nextInt();
				Employee emp = new Company(name, income, employee);
				list.add(emp);
			}
		}
		
		System.out.println();
		double sum=0.0;
		System.out.println("TAXES PAID:");
		for(Employee emp : list) {
			
			System.out.println(emp.getName()+ ": $" + String.format("%.2f", emp.calcTax()));
			sum += emp.calcTax();
		}
		System.out.println();
		System.out.println("TOTAL TAX: $ " + String.format("%.2f", sum));
		sc.close();
	}

}
