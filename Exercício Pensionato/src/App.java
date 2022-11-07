import java.util.Scanner;
import java.text.ParseException;
import entities.Rental;

public class App {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos quartos serão alugados?: ");
        int n = sc.nextInt();
        System.out.println();
        Rental[] quartos = new Rental[9];
        for (int i = 0; i < n; i++) {
            System.out.println("Aluguel# "+(i+1));
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            Rental rental = new Rental(name, email);
            quartos[quarto] = rental;
            System.out.println("--------------------------");
        }
        System.out.println();
        System.out.println("Quartos Alugados:");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(i+": "+ quartos[i]);                
            }
        }
        sc.close();
    }
}
