import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.Serializable;
import java.util.Scanner;

public class Product {

    private String  name;
    private double price;
    Scanner scanner = new Scanner(System.in);
    private char option;
    Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void delProduct(String name) {

        System.out.println("Deseja excluir o produto: " + name);
        System.out.println("Digite s / n )");
        switch(option){
            case 's' :
        }
    }

    public void editProduct(String name){
        System.out.println("Deseja editar o produto: " + name);
    }

    public void addProduct(String name){
        System.out.println("Deseja excuir o produto: " + name);
    }
    public String findProduct(String name){
        System.out.println("Deseja excuir o produto: " + name);
        return name;
    }

}
