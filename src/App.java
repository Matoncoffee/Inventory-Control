
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        app();
    }
    public static void app(){
        System.out.println("MENU");
        System.out.println("Escolha uma opção");
        System.out.println("1 - Adicionar produto");
        System.out.println("2 - Buscar produto");
        System.out.println("3 - Deletar produto");
        System.out.println("4 - Alterar produto");

        Scanner scanner = new Scanner(System.in);
        char option = scanner.next().charAt(0);

        String name = "";
        double price = 0;

        Product product = new Product(name, price);
        try {
            switch (option) {
                case '1' -> product.addProduct(name);
                case '2' -> product.findProduct(name);
                case '3' -> product.delProduct(name);
                case '4' -> product.editProduct(name);
                default -> {
                    System.out.println("Opção inválida");
                    Thread.sleep(500);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
