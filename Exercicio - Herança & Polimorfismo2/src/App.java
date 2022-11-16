import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Products;
import entities.UsedProduct;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de produtos a serem lidos: ");
        int n =  sc.nextInt();
        sc.nextLine();
        List<Products> products = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Produto #" + (i+1));
            System.out.println("- Comum (c) \n- Usado (u) \n- Importado (i)");
            char cs = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Produto: ");
            String name = sc.nextLine();
            System.out.println("Preço: ");
            Double price = sc.nextDouble();
            switch (cs) {
                case 'i':
                    System.out.println("Taxas a serem cobradas:");
                    Double taxas = sc.nextDouble();
                    Products produto = new ImportedProduct(name, price, taxas);
                    products.add(produto);
                    break;
                
                case 'u':
                    System.out.println("Data de Fabricação: (DD/MM/YYYY)");
                    LocalDate manufLocalDate =  LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    produto = new UsedProduct(name, price, manufLocalDate);
                    products.add(produto);
                    break;

                case 'c':
                    produto = new Products(name, price);
                    products.add(produto);
                    break;
            }
            
        }
        System.out.println("=============================");
        System.out.println("Etiquetas dos Produtos cadastrados: ");
        for (Products produto : products) {
            System.out.println(produto.priceTag());
        }
        sc.close();
    }
}
