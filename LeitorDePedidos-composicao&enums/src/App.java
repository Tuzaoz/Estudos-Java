import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Digite os dados do Cliente: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de Nascimento: ");
        LocalDate birthDate = LocalDate.parse(sc.nextLine(),fmt1);
        Client client = new Client(name, email, birthDate);
        System.out.println("=======================");
        System.out.println("Digite as informações do pedido: ");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next());
        System.out.print("Quantos itens tem no pedido?: ");
        int n = sc.nextInt();
        Order order = new Order(LocalDateTime.now(), orderStatus, client);
        for (int i = 0; i < n; i++) {
            System.out.println("Digite os dados do #"+(i+1)+" item");
            System.out.print("Nome do Produto: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Valor do Produto: $ ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantidade do Produto: ");
            int productQuantity = sc.nextInt();
            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
            order.addItem(orderItem);
        }
        System.out.println("=======================");
        System.out.println("DETALHES DO PEDIDO: ");
        System.out.println(order);
        sc.close();
    }
}
