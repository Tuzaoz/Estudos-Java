import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.tercEmployee;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite os número de Empregados: ");
        int n = sc.nextInt();
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Digite os dados do "+ (i+1)+"° Empregado: ");
            System.out.print("Terceirizado (y/n)?: ");
            sc.nextLine();
            char terceirizado = sc.next().charAt(0);
            System.out.print("Digite o nome do Funcionário: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Horas trabalhadas: ");
            Integer hours = sc.nextInt();
            System.out.print("Valor da hora de trabalho: R$");
            Double valuePerHour = sc.nextDouble();
            if (terceirizado == 'y') {
                System.out.print("Pagamento Adicional: ");
                Double custoAdicional = sc.nextDouble();
                Employee employee = new tercEmployee(name, hours, valuePerHour, custoAdicional);
                employees.add(employee);
            } else {
                Employee employee = new Employee(name, hours, valuePerHour);
                employees.add(employee);
            }
            System.out.println();
           
        }
        System.out.println("=========================================");
        System.out.println("PAGAMENTOS: ");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - R$ " + employee.payment());
        }
        sc.close();
    }
}
