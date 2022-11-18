import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Número de Contribuintes a serem lidos");
        int n = sc.nextInt();
        List<Contribuinte> contribuintes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Digite os dados do Contrinuinte #"+(i+1));
            System.out.println("-> Pessoa Física (f)\n-> Pessoa Jurídica (j)?");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Nome:");
            String nameString = sc.nextLine();
            System.out.println("Renda:");
            Double renda = sc.nextDouble();
            switch (ch) {
                case 'f':
                    System.out.println("Gastos com Saúde:");
                    Double gastosSaude = sc.nextDouble();
                    contribuintes.add(new PessoaFisica(nameString, renda, gastosSaude));
                    break;
                
                case 'j':
                    System.out.println("N° de Funcionários:");
                    Integer nfuncInteger = sc.nextInt();
                    contribuintes.add(new PessoaJuridica(nameString, renda, nfuncInteger));
                    break;
            }
            sc.nextLine();
        }
        Double TotalArrecadado = 0.0;
        System.out.println("========================================");
        System.out.println("Imposto pago pelos contribuintes:");
        for (Contribuinte contribuinte : contribuintes) {
            System.out.println(contribuinte.getName() + " - R$"+contribuinte.impostoPagoDouble());
            TotalArrecadado += contribuinte.impostoPagoDouble();
        }
        System.out.println("Total Arrecadado com impostos:");
        System.out.println("R$"+TotalArrecadado);
        sc.close();
    }
}
