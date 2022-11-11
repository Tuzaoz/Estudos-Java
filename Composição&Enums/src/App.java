import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Derpartment;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Entre com o Departamento:");
        String derpatmentName = sc.nextLine();
        System.out.println("Entre com os Dados do Trabalhador:");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine();
        System.out.print("Salário Base: R$");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Derpartment(derpatmentName));
        System.out.print("Quantos Contratos tem esse trabalhador?: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Digite as informações do contrato #"+ (i+1));
            System.out.print("Data: ");
            LocalDate date = LocalDate.parse(sc.next(),fmt1);
            System.out.print("Valor por hora: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Horas de contrato: ");
            int hours = sc.nextInt();
            HourContract hourContract = new HourContract(date, valuePerHour, hours);
            worker.addContract(hourContract);
        }
        System.out.println();
        System.out.print("Entre com o mês e ano para calcular o Salário: (MM/YYYY) ");
        String meseano = sc.next();
        int month = Integer.parseInt(meseano.substring(0, 2));
        int year = Integer.parseInt(meseano.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Departamento" + worker.getDerpartment().getName());
        System.out.println("Receita em "+meseano+" : "+ worker.income(year, month));
        sc.close();

            
    }
}
