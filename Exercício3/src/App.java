import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.Tax = sc.nextDouble();

        System.out.println("Employee: " + employee);
        System.out.print("Whix percentage to increase Salary?: ");
        double percentage = sc.nextDouble();
        employee.IncreaseSalary(percentage);
        System.out.println();
        System.out.println("Updated data:" + employee);
        sc.close();
    }
}
