import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Products;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Products> products = new ArrayList<>();
        System.out.println("Digite o Caminho do Arquivo: ");
        String arquivoRaizDirect = sc.nextLine();
        File arquivoRaiz = new File(arquivoRaizDirect);
        String arquivoRaizPasta = arquivoRaiz.getParent();
        new File(arquivoRaizPasta + "\\out").mkdir();
        String arquivoNovo = arquivoRaizPasta + "\\out\\summary.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoRaizDirect))) {
            String itemCsv = br.readLine();
            while (itemCsv!=null) {
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                Double price = Double.parseDouble(fields[1]);
                Integer quantity = Integer.parseInt(fields[2]);
                products.add(new Products(name, price, quantity));
                itemCsv = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoNovo))) {
                for (Products products2 : products) {
                    bw.write(products2.getName()+ "," + products2.total() );
                    bw.newLine();
                }
                System.out.println("Arquivo Criado");
                
            } catch (Exception e) {
                System.out.println("Erro na criação do arquivo: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Erro na criação do arquivo: " + e.getMessage());
        }
        sc.close();
    }
}
