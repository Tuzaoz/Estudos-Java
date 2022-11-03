import java.util.Scanner;

import entities.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rectangle Width and Height");
        Rectangle rectangle = new Rectangle();

        rectangle.Width = sc.nextDouble();
        rectangle.Height = sc.nextDouble();

        System.out.println(rectangle);
        sc.close();
    }
}
