import java.util.Scanner;

import users.User;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double balance = 0;

        System.out.print("Entre com o número da conta: ");
        String accountNumber = sc.nextLine();
        System.out.print("Digite seu nome: ");
        String name = sc.nextLine();
        User user = new User(accountNumber, name, balance);
        System.out.print("Quer adicionar saldo no início?(y/n): ");
        char decisor = sc.next().charAt(0);
        if (decisor ==  'y') {
            System.out.print("Digite quanto Saldo você deseja adicionar: ");
            balance = sc.nextDouble();
            user.addBalance(balance);
        }
        System.out.println();
        System.out.println("Dados do cliente]:");
        System.out.println(user);
        System.out.println();
        System.out.print("Deposite um valor: ");
        balance = sc.nextDouble();
        user.addBalance(balance);
        System.out.println("Dados Atualizados: ");
        System.out.println(user);
        System.out.println();
        System.out.print("Realize um Saque: ");
        balance = sc.nextDouble();
        user.removeBalance(balance);
        System.out.println("Dados Atualizados: ");
        System.out.println(user);

        sc.close();

    }
}
